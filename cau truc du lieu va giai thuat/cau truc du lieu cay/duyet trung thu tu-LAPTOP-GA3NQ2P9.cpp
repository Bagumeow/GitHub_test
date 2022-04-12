#include<iostream>
using namespace std;
struct node{
	int data;
	node *left;
	node *right;
}; 
node *insert(node *t,int x){
	if (t == NULL){
		node *temp = new node;
		temp->data=x;
		temp->left=NULL;
		temp->right=NULL;
		return temp;
	} else {
		if (x < t->data){
			t->left = insert(t->left,x);
		} else {
			t->right = insert(t->right,x);
		}
	}
}
void printTreeTruoc(node *t){
	if (t != NULL){
		//cout o day la tien thu tu
		cout << t->data << " " ;
		printTreeTruoc(t->left);//cout o day la trung thu tu
		printTreeTruoc(t->right);
		//cout o day la hau thu tu
	}
}
void printTreeGiua(node *t){
	if (t != NULL){
		//cout o day la tien thu tu
		printTreeGiua(t->left);
		cout << t->data << " " ;//cout o day la trung thu tu
		printTreeGiua(t->right);
		//cout o day la hau thu tu
	}
}
void printTreeSau(node *t){
	if (t != NULL){
		//cout o day la tien thu tu
		printTreeSau(t->left);
		//cout o day la trung thu tu
		printTreeSau(t->right);
		cout << t->data << " " ;
		//cout o day la hau thu tu
	}
}
int main(){
	int n,x;
	cin >> n;
	node *t = NULL;
	for (int i=0 ;i<n ; i++){
		cin>>x;
		t = insert(t,x);
	}
	printTreeTruoc(t);
//	printTreeGiua(t);
//	printTreeSau(t);
	return 0;
}
