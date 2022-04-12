#include<bits/stdc++.h>

using namespace std;
struct node {
	int data;
	node *right;
	node *left;
};
node *insert(node *t, int x)
{
	if(t == NULL)
	{
		node *temp = new node;
		temp->data = x;
		temp->left = NULL;
		temp->right = NULL;
	}else{
		if(x < t->data)
			t->left = insert(t->left,x);
		else 
			t->right = insert(t->right,x);
	}
		
	
}
void printTree(node *t){
	if (t != NULL){
		printTree(t->left);
		cout << t->data << " " ;
		printTree(t->right);
	}
}
int main()
{
	int n;
	node *tree = NULL;
	int k; cin >> k;
	while(k != -1)
	{
		tree = insert(tree,k);
		cin >> k;
	}
	printTree(tree);
}
