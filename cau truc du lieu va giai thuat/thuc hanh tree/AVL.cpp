#include<iostream>
using namespace std;

struct node {
	int balFactor;
	node *left;
	node *right;
	int data;
};
typedef node * Tree;
node *taoNode(int x){
	node *p = new node;
	if (p==NULL)
		return NULL;
	p->left = NULL;
	p->right = NULL;
	p->data = x;
	return p;
}
void themNodeVaoCay(node *p, Tree &t){
	if(t == NULL)
		t=p;
	else{
		if(p->data < t->data)
			themNodeVaoCay(p,t->left);
		else if (p->data > t->data)
			themNodeVaoCay(p,t->right);
		else
			return;
	}
}
void Nhap(Tree &t){
	int chon = 0;
	do{
		int x;
		cout<<"Nhap x:";
		cin>>x;
		node *p=taoNode(x);
		themNodeVaoCay(p,t);
		cout<<"Muon nhap thong tin tiep khong? 1:co , 0:ko~~>";
		cin>>chon;
	}while(chon);
}
void Xuat(Tree t){
	if (t!=NULL)
	{
		if(t->left != NULL)
			Xuat(t->left);
		cout<<t->data<<" ";
		if(t->right != NULL)
			Xuat(t->right);
	}
}
int main(){
	Tree t= NULL;
	Nhap(t);
	Xuat(t);
	return 0;
}
