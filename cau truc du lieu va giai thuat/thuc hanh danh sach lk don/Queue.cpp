#include <stdio.h>
#include<iostream>
using namespace std;
struct node
{
	int data;
	node *next;
};

struct queue
{
	node *top,*bot ;
};

void Init(queue &q)
{

	q.top =q.bot = NULL;
}
int isEmpty(queue q)
{
	return q.top == NULL ? 1 : 0;
}
void EnQueue(queue &q, int x)
{
	node *p;
	p = new node;
	p->data = x;
	p->next = NULL;
	if (isEmpty(q))
	{
		q.top = p;
		q.bot = p;
	}
	else
	{
		q.bot->next = p;
		q.bot = p;
	}
}
int DeQueue(queue &q)
{
	if (isEmpty(q))
	{
		printf("Queue rong \n");
		return 1;
	}
	node *p = q.top;
	q.top = q.top->next;
	if (isEmpty(q))
		q.bot = NULL;
	int x = p->data;
	p->next = NULL;
	delete p;
	return x;
}
int Front(queue q)
{
if (isEmpty(q)) return 1;
return q.top->data;
}
int main(){
	int k;
	queue q;
	Init(q);
	cout<<"\nNhap cac phan tu vao Queue (-1 de ket thuc): ";
	do{
		cin>>k;
		if(k!= -1)
			EnQueue(q,k);
	}while (k!=-1);
	cout<<"\n\nLay cac phan tu ra khoi Queue: ";
	while(!isEmpty(q)){
		k= DeQueue(q);
		cout<<k<<" ";
	}
}
