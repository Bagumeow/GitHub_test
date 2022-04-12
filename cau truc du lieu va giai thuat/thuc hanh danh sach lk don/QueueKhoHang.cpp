#include <stdio.h>
#include<iostream>
#define MAXQUEUE 100
using namespace std;
struct mathang{
	int mamh;
	char tenmh[12];
}; 

struct queue
{
	int front, rear;
	mathang nodes[MAXQUEUE];
};

void Init(struct queue *pq){
	pq->front = pq->rear = MAXQUEUE-1;
}

int isEmpty(struct queue *pq){
	return ((pq->front== pq->rear)? 1 : 0);
}
void Insert(struct queue *pq, mathang x){
	if (pq->rear == MAXQUEUE-1)
		pq->rear = 0;
	else
		(pq->rear)++;
	if(pq->rear == pq->front)
		cout<<"Kho hang bi day"<<endl;
	else 
		pq->nodes[pq->rear] = x;
}
mathang Remove(struct queue *pq){
	if(isEmpty(pq))
		cout<<"Kho khong con hang"<<endl;
	else{
		if(pq->front == MAXQUEUE-1)
			pq->front = 0;
		else
			(pq->front)++;
		return (pq->nodes[pq->front]);
	}
}
void Traverse(struct queue *pq){
	int i;
	if (isEmpty(pq)){
		cout<<"Kho khong con hang"<<endl;
		return;
	}
	if (pq->front == MAXQUEUE-1)
		i=0;
	else 
		i = pq->front+1;
	while(i != pq->rear){
		printf("\n%11d%15s",pq->nodes[i].mamh,
			pq->nodes[i].tenmh);
		if(i == MAXQUEUE-1)
			i=0;
		else
			i++;
	}
	printf("\n%11d%15s",pq->nodes[i].mamh,
			pq->nodes[i].tenmh);
}
int main(){
	queue q;
	int chucnang,front1;
	char c;
	mathang mh;
	Init(&q);
	do {
		cout<<"\n\n\t\t\tCHUONG TRINH QUAN LY KHO";
		cout<<"\n\t\t\t(NHAP TRUOC - XUAT TRUOC)";
		cout<<"\n\nCac chuc nang cua chuong trinh:\n";
		cout<<"1: Nhap mot mat hang"<<endl;
		cout<<"2: Xuat mot mat hang"<<endl;
		cout<<"3: Xem mat hang chuan bi xuat"<<endl;
		cout<<"4: Xem mat hang moi Nhap"<<endl;
		cout<<"5: Xem cac mat hang co trong kho"<<endl;
		cout<<"6: Xuat toan bo kho hang"<<endl;
		cout<<"0: Ket thuc chuong trinh"<<endl;
		cout<<"Nhap chuc nang ban chon: ";
		cin>>chucnang;
		switch(chucnang){
			case 1:{
				cout<<"\nMa mat hang: ";
				cin>>mh.mamh;
				cout<<"Ten mat hang: ";
				fflush(stdin);
				gets(mh.tenmh);
				Insert(&q,mh);
				break;
			}
			case 2:{
				if(!isEmpty(&q)){
					mh = Remove(&q);
					cout<<"\nMat hang xuat:Ma:"<<mh.mamh<<", Ten:"<<mh.tenmh;
				}
				else
					cout<<"\nKho khong con hang";
				break;
			}
			case 3:{
				front1 = (q.front==MAXQUEUE-1 ? 0 : q.front+1);
				cout<<"\nMat hang chuan bi xuat:Ma:"<<q.nodes[front1].mamh<<", Ten:"<<q.nodes[front1].tenmh;
				break;
			}
			case 4:{
				cout<<"\nMat hang moi nhap:Ma:"<<q.nodes[q.rear].mamh<<", Ten:"<<q.nodes[q.rear].tenmh;
				break;
			}
			case 5:{
				cout<<"\nCac mat hang co trong kho:";
				printf("\n%11s%15s","MA MAT HANG","TEN MAT HANG\n");
				Traverse(&q);
				break;
			}
			case 6: {
				cout<<"\n Are you sure about that?? (c/k): ";
				cin>>c;
				if(c == 'c' || c == 'C')
					Init(&q);
				break; 
			}
			
		}
	} while (chucnang!=0);
}

