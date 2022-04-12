#include<bits/stdc++.h>
using namespace std;
struct item{
	char masv[20];
	char name[20];
	double diem;
};
struct node{
	item data;
	node *left;
	node *right;
};
node *insert(node *t,item x){
	if (t==NULL){
		node *temp = new node;
		temp->data=x;
		temp->left=NULL;
		temp->right=NULL;
		return temp;
	}
	else {
		if (x.diem==-1){
			return t; 
		}
		else if (strcmp(x.masv,t->data.masv) <0 ){
			t->left= insert(t->left,x);
		}else if(strcmp(x.masv,t->data.masv) >0 ){
			t->right = insert(t->right,x);
		}else {
			cout<<"MSSV trung , nhap lai"<<endl;
			return t;
		}
	}
}

void Nhap(node *&t){
	int chon=0;
	do{
		item x;
		cout<<"Nhap mssv:";
		fflush(stdin);
		gets(x.masv);
		cout<<"Nhap ho ten sv:";
		fflush(stdin);
		gets(x.name);
		cout<<"Nhap diem:"; 
		double m;
		cin>>m;
		if (m>=0 && m<=10)
			x.diem=m;
		else{
			cout<<"Diem khong hop le nhap lai"<<endl;
			x.diem=-1; 
		}
		t=insert(t,x);
		cout<<"Muon nhap thong tin tiep khong? 1: co, 0: ko ~~>";
		cin>>chon;
	}while(chon);
}

void printTree(node *t){
	if (t != NULL){
		if (t->left != NULL)
			printTree(t->left);
		cout <<"MSSV:"<<t->data.masv<<" "<<endl;
		cout <<"Ho ten:"<<t->data.name<<" "<<endl; 
		cout <<"Diem:"<<t->data.diem<< " "<<endl ;
		cout<<endl;
		if (t->right != NULL)
			printTree(t->right);
	}
}
bool isLeafNode(node *l){
	return (l->left == NULL && l->right == NULL);
}
int countLeafNode(node *t){
	if (t == NULL) return 0;
	if (isLeafNode(t)) return 1;
	return countLeafNode(t->left) + countLeafNode(t->right);
}
int treeLevel(node *t){
	if (t == NULL) return -1;
	if (isLeafNode(t)) return 0;
	return 1 + max(treeLevel(t->left), treeLevel(t->right));
}
void deleteNode(node *t){
	if(t != NULL){
		if (t->left != NULL) deleteNode(t->left);
		if (t->right != NULL) deleteNode(t->right);
		delete(t);
	}
}
node *deleteMSSV(node *t, char x[]){
	if (t != NULL){
		if (strcmp(x,t->data.masv)==0){
			deleteNode(t->left);
			deleteNode(t->right);
			t = NULL;
		}
		else if (strcmp(x,t->data.masv)<0) t->left = deleteMSSV(t->left, x);
		else t->right = deleteMSSV(t->right, x);		
	}
	return t;
}
int main(){
	node *t = NULL;
	Nhap(t);
	cout<<"Xuat cay LNR (Tang dan):"<<endl;
	printTree(t);
	cout<<"So nut la cua cay la :"<<countLeafNode(t)<<endl;
	cout<<"Chieu cao cua cay la :"<<treeLevel(t)<<endl;
	cout<<"Nhap mssv can xoa: ";
	char mssv[20];
	fflush(stdin);
	gets(mssv);
	t=deleteMSSV(t,mssv);
	if (t==NULL) cout<<"NULL";
	else {
		cout<<"Danh sach sinh vien sau khi xoa la:"<<endl;
		printTree(t);
	}
	return 0;
}










