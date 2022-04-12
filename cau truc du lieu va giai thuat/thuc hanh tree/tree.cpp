#include<bits/stdc++.h>
using namespace std;

struct node{
	int data;
	node *left;
	node *right;
};
node *insert(node *t,int x){
	if (t==NULL){
		node *temp = new node;
		temp->data=x;
		temp->left=NULL;
		temp->right=NULL;
		return temp;
	}
	else {
		if (x<t->data){
			t->left= insert(t->left,x);
		}else if(x > t->data){
			t->right = insert(t->right,x);
		}else {
			cout<<"trung nhap lai:"<<endl;
			return t;
		}
	}
}

void Nhap(node *&t){
	int chon=0;
	do{
		int x;
		cout<<"Nhap x: ";
		cin>>x;
		t=insert(t,x);
		cout<<"Muon nhap thong tin tiep khong? 1: co, 0: ko ~~>";
		cin>>chon;
	}while(chon);
}

void printTree(node *t){
	if (t != NULL){
		if (t->left != NULL)
			printTree(t->left);
		cout << t->data << " " ;
		if (t->right != NULL)
			printTree(t->right);
	}
}
int main(){
	node *t = NULL;
	Nhap(t);
//	int n,x;
//	cin>>n;
//	for (int i=0;i<n;i++){
//		cin>>x;
//		t=insert(t,x);
//	}
	cout<<"Xuat cay LNR (Tang dan):";
	printTree(t);
	return 0;
}










