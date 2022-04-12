#include<iostream>
using namespace std;
struct node{
	int data;
	node *next;
};
struct list{
	node *first,*last;
};
void Init(list &l){
	l.first = l.last = NULL;
}
node *createNode(int x){
	node *p = new node;
	if(p == NULL)
		return NULL;
	p->data = x;
	p->next = NULL;
	return p;
}
void addLast(list &l,node *p){
	if (l.first == NULL){
		l.first = p;
		l.last = l.first;
	} else {
	    l.last->next = p ;
		l.last = p;
	}
}

void insertlast(list &l,int x){
	node *p = createNode(x);
	if (p == NULL)
		return;
	addLast(l,p);
}
void createListlast(list &l,int &n){
	int x;
	cout<<"Nhap n :";
	cin>>n;
	for (int i=1;i<=n;i++){
		cout<<"Nhap du lieu phan tu thu "<<i<<":";
		cin>>x;
		insertlast(l,x);
	}
} 
void addAfter (list &l, node *q, node* p)
{
	if (q!=NULL)  
	{
		p->next = q->next;
		q->next = p; 	
		if(q == l.last)
			l.last = p; 
	}
}
void addEven(list &l,int x){
	cout<<"Nhap gia tri can chen : ";
	cin>>x;
	node *p=createNode(x);
	node *q=l.first;
	while (q != NULL && q->data % 2== 0){
			q= q->next;
		}
	addAfter(l,q,p);
}
void addAfterMaxEven(list &l, int x)
{
    node *p = createNode(x);
    node *q = l.first;
    node *g=NULL;
    while (q != NULL){
    
        if (q->data % 2 == 0){
            g = q;
            break;
        }
        q = q->next;
    }
    while (q != NULL)
    {
        if (q->data % 2 == 0){
            if(g->data<q->data)
                g=q;
        }
        q= q->next;
    }
    addAfter(l, g, p);
}

void printList(list l){
	node *p = l.first;
	while(p != NULL){
		cout<<p->data<<" ";
		p=p->next;
	}
}
int main(){
	list l;
	Init(l);
	int n,x;
	createListlast(l,n);
	printList(l);
	cout<<endl;
	cout<<"Nhap x:";
	cin>>x;
	addAfterMaxEven(l,x);
	printList(l);
}
