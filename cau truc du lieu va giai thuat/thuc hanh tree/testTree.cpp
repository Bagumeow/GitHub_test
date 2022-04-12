#include<iostream>
using namespace std;
struct item{
	int id;
	string dan;
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
		if (x.id < t->data.id){
			t->left= insert(t->left,x);
		}else if (x.id > t->data.id){
			t->right = insert(t->right,x);
		}else 
			return t;
	}
}

void Nhap(node *&t){
	int chon=0;
	do{
		item x;
		cout<<"ID:";
		fflush(stdin);
		cin >> x.id;
		cout<<"Dap an:";
		fflush(stdin);
		gets 
		t=insert(t,x);
		cout<<"Muon nhap thong tin tiep khong? 1: co, 0: ko ~~>";
		cin>>chon;
	}while(chon);
}

void printTree(node *t){
	if (t != NULL){
		if (t->left != NULL)
			printTree(t->left);
		cout <<"MSSV:"<<t->data.id<<" "<<endl;
		cout <<"Ho ten:"<<t->data.dan<<" "<<endl; 
		cout<<endl;
		if (t->right != NULL)
			printTree(t->right);
	}
}

int main(){
	node *t = NULL;
	Nhap(t);
	printTree(t);
	return 0;
}
