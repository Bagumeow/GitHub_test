#include<iostream>
using namespace std;
struct node{
	int data;
	node *next;
	node *pre;
};
struct douList{
	node *head;
	node *tail;
};
douList *createList(int x){
	douList *l = new douList;
	l->head= new node;
	l->head->data=x;
	l->head->next= NULL;
	l->head->pre = NULL;
	l->tail = l->head; 
	return l;
}

douList *addTail(douList *l , int x){
	node *temp = new node;
	temp->data=x;
	temp->pre= l->tail;
	temp->next= NULL;
	l->tail->next=temp;
	l->tail=temp;
	return l; 
}
douList *deleteHead(douList *l){
	node *p = l->head->next;
	node *temp=l->head;
	p->pre=NULL;
	l->head=p;
	delete(temp);
	return l;
}
douList *deleteTail(douList *l){
	node *p=l->tail->pre;
	node *temp=l->tail;
	p->next=NULL;
	l->tail=p;
	delete(temp);
	return l;
}
douList *deleteAt(douList *l,int k){
	node *p=l->head;
	for (int i=0;i<k-1;i++){
		p=p->next;
	} 
	node *temp = p->next;
	node *p2=temp->next;
	p->next=p2;
	p2->pre=p;
	delete(temp);
	return l;
}
void printList(douList *l){
	node *p= l->head;
	while(p!=NULL){
		cout<<p->data<<" ";
		p=p->next;
	}
}
int main(){
	int n,k,x;
	cin >>n;
	cin >>x;
	douList *l= createList(x);
	for (int i=1;i<n;i++){
		cin>>x;
		l=addTail(l,x);
	}
	cin>>k;
	if(k==0){
		deleteHead(l);
	} else if(k == n-1){
		deleteTail(l);
	} else {
		deleteAt(l,k); 
	}
	printList(l);
	return 0;
}













