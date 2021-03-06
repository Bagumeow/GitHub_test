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
			t->left=insert(t->left,x);
		} else {
			t->right=insert(t->right,x);
		}
	}
}
int treeLevel(node *t){
	if (t == NULL) return -1;
	return 1 + max(treeLevel(t->left),treeLevel(t->right));
}
bool checkAVL(node *t){
	if (t == NULL) return true;
	if (abs(treeLevel(t->left)-treeLevel(t->right)) >1) return false;
	return checkAVL(t->left) && checkAVL(t->right);
}
node *turnRight(node *a){
	node *b = a->left;
	node *d = b->right;
	a->left = d;
	b->right = a;
	return b;
}
node *turnLeft(node *a){
	node *b = a->right;
	node *c = b->left;
	a->right = c;
	b->left = a;
	return b;
}
node *updateTreeAVL(node *t){
	if (abs(treeLevel(t->left)-treeLevel(t->right)) >1 ) {
		if (treeLevel(t->left) > treeLevel(t->right)){
			node *p = t->left;
			if (treeLevel(p->left) >= treeLevel(p->right)){
				t = turnRight(t);
			} else {
				t->left = turnLeft(t->left);
				t = turnRight(t);
			}
		} else {
			node *p = t->right;
			if (treeLevel(p->right) >= treeLevel(p->left)){
				t = turnLeft(t);
			} else {
				t->right = turnRight(t->right);
				t = turnLeft(t);
			}
		}
	}
	if (t->left != NULL) t->left = updateTreeAVL(t->left);
	if (t->right != NULL) t->right = updateTreeAVL(t->right);
	return t;
}
int count(node *t,int x){
	if (t ==NULL) return 0;
	if (x == t->data) return 1 + count(t->left,x) + count(t->right,x);
	else if (t->data < x) return count(t->right,x);
	return count(t->left , x);
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
	int n,temp,x;
	cin>>n;
	node *t = NULL;
	for (int i=0;i<n;i++){
		cin>>temp;
		t = insert(t,temp);
	}
	while (!checkAVL(t)){
		t=updateTreeAVL(t);
	}
	printTreeTruoc(t);
	cout<<endl;
	printTreeGiua(t);
	cout<<endl;
	printTreeSau(t);
	return 0;
}
