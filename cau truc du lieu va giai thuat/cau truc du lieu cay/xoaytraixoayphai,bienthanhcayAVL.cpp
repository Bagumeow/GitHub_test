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
		temp->left = NULL;
		temp->right = NULL;
		return temp;
	} else {
		if (x > t->data){
			t->left = insert(t->left,x);
		} else {
			t->right = insert (t->right,x);
		}
	}
}
int treeLevel(node *t){
	if (t == NULL) return -1;
	return 1 + max(treeLevel(t->left),treeLevel(t->right));
}
bool checkAVL(node *t){
	if (t == NULL) return true;
	if (abs(treeLevel(t->left) - treeLevel(t->right)) >1 ) return false;
	return checkAVL(t->left) && checkAVL(t->right);
}
node *turnRight(node *a){
	node *b =a->left;
	node *d =b->right;
	a->left = d;
	b->right = a;
	return b;
}
node *turnLeft(node *a){
	node *b =a->right;
	node *c =b->left;
	a->right = c;
	b->left = a;
	return b;
}
node *updateTreeAVL(node *t){
	if (abs(treeLevel(t->left)-treeLevel(t->right)) > 1){
		if (treeLevel(t->left) > treeLevel(t->right)){
			node *p = t->left;
			if (treeLevel(t->left) >= treeLevel(t->right)){
				t=turnRight(t);
			} else {
				t->left=turnLeft(t->left);
				t=turnRight(t);
			}
		} else {
			if (treeLevel(t->right) >= treeLevel(t->left)){
				t=turnLeft(t);
			} else {
				t->right=turnRight(t->right);
				t=turnLeft(t);
			}
		} 
	}
	if (t->left!=NULL) t->left= updateTreeAVL(t->left);
	if (t->right!=NULL) t->right = updateTreeAVL(t->right);
	return t;
}
int main(){
	int n,x;
	cin>>n;
	node *t = NULL;
	for (int i=0;i<n;i++){
		cin>>x;
		t = insert(t,x);
	}
	while(!checkAVL(t)){
		t=updateTreeAVL(t);
	}
	cout<<treeLevel(t);
	return 0;
}
