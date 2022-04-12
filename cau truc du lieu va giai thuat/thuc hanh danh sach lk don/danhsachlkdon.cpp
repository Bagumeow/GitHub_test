#include<iostream>
using namespace std;
void Menu ()
	{
		cout<<"=================MENU================\n";
		cout<<"1. Nhap danh sach lien ket unlimit.\n";
		cout<<"2. Nhap n phan thu vao dau list\n";
		cout<<"3. Nhap n phan thu vao cuoi list\n";
		cout<<("4. Xuat danh sach lien ket.\n");
		cout<<("5.Tong phan tu chan trong list.\n");
		cout<<("6. Tim kiem gia tri.\n");
		cout<<("Vui long chon chuc nang, chon 0 de exit.\n");
		}
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
void addFirst(list &l,node *p){
	if (l.first == NULL){
		l.first = p;
		l.last = l.first;
	} else {
		p->next = l.first;
		l.first = p;
	}
}

void addLast(list &l,node *p){
	if (l.first == NULL){
		l.first = p;
		l.last = l.first;
	} else {
		l.last->next = p;
		l.last = p;
	}
}
void insertFirst(list &l,int x){
	node *p = createNode(x);
	if (p == NULL)
		return;
	addFirst(l,p);
}
 
void insertLast(list &l,int x){
	node *p = createNode(x);
	if (p == NULL)
		return;
	addLast(l,p);
} 
 
void createListHead(list &l,int &n){
	int x;
	cout<<"Nhap n :";
	cin>>n;
	for (int i=1;i<=n;i++){
		cout<<"Nhap du lieu phan tu thu "<<i<<":";
		cin>>x;
		insertFirst(l,x);
	}
} 


void createListTail(list &l,int &n){
	int x;
	cout<<"Nhap n :";
	cin>>n;
	for (int i=1;i<=n;i++){
		cout<<"Nhap du lieu phan tu thu "<<i<<":";
		cin>>x;
		insertLast(l,x);
	}
} 
void createListFirst(list &l){
	int x;
	cout<<"Bat dau nhap danh sach cac so nguyen , nhap -1 de ket thuc: "<<endl;
	cin>>x;
	while (x != -1){
		cout<<"Bat dau nhap danh sach cac so nguyen , nhap -1 de ket thuc: "<<endl;
		insertFirst(l,x);
		cin>>x;
	} 
	cout<<"Da nhap du lieu xong: "<<endl;
}
void printList(list l){
	node *p = l.first;
	while(p != NULL){
		cout<<p->data<<" ";
		p=p->next;
	}
}


long sumEvenNumber(list l){
	long sum=0;
	node *p= l.first;
	while (p!=NULL){
		if(p->data %2 == 0){
			sum += p->data;
		}
		p=p->next;
	}
	return sum;
}
node * search (list l, int k)
{
	node *p = l.first;
	while (p != NULL && p ->data != k)
		p = p ->next;
	return p;	
}
int RemoveAfter (list &l, node *q )
{
	if (q !=NULL && q->next !=NULL)
	{
		node*   p = q->next;
		q->next = p->next;
		if  (p==l.last)	 l.last = q;
		delete p;
		return 1;
	}
	else return 0;
}
void RemoveFirst (list &l)
{
	if (l.first != NULL)
	{	node* p = l.first;
		l.first = p->next;
		if (l.first == NULL)  l.last=NULL; 
		delete p;
	}
}

void RemoveLast (list &l)
{	node *q;
	if (l.first == l.last)
		{	delete (l.first);
			Init (l); return;	
		}
	q = l.first;
	while (q ->next != l.last)
		q = q ->next;	
	RemoveAfter(l,q);
}
// Xoa Max
void RemoveMax (list &l)
{
	node *q = l.first, *p;
	for (p = q ->next ; p != NULL ; p = p->next)
		if (p ->data > q ->data)
			q = p;
	if (q == l.first) RemoveFirst(l);
	else if (q == l.last) RemoveLast(l);
		else 
		{	swap (q ->data , q ->next->data);
			RemoveAfter(l,q);	
		}
}
//Xoa nut dau tien co khoa k
int RemoveNode  (list &l, int k) 
{	node    *p = l.first, *q = NULL; 
	while  (p != NULL) 
	{ 	if  (p->data == k) break; 
		q = p;    
		p = p->next; 
	} 
	if (p == NULL)  return 0;
	else if (q == NULL) 
			RemoveFirst(l); // th?c hi?n xóa ph?n t? d?u ds là p
		else 
			RemoveAfter(l,q); // th?c hi?n xóa ph?n t? p sau q
} 
void QuickSort(list &l)
{
    node *p, *x; 
    list l1, l2;
    if (l.pHead == l.pTail)
        return; 
    init(l1);
    init(l2);
    x = l.pHead;
    l.pHead = x->pNext;
    while (l.pHead != NULL) 
    {
        p = l.pHead;
        l.pHead = p->pNext;
        p->pNext = NULL;
        if (p->data <= x->data)
            addHead(l1, p);
        else
            addHead(l2, p);
    }
    QuickSort(l1);        
    QuickSort(l2);        
    if (l1.pHead != NULL) 
    {
        l.pHead = l1.pHead;
        l1.pTail->pNext = x; 
    }
    else
        l.pHead = x;
    x->pNext = l2.pHead;
    if (l2.pHead != NULL) 
        l.pTail = l2.pTail;
    else 
        l.pTail = x;
}


int main(){
	list l;
	Init(l);
	int chon,n;
	do {
		Menu();
		cout<<"Chuc nang can chon la :";
		cin>>chon;
		switch(chon){
			case 1:
				createListFirst(l);
				break;
			case 2:
				createListHead(l,n);
				break;
			case 3:
				createListTail(l,n);
				break;
			case 4:
				cout<<"\nDanh sach cac phan tu trong list la : ";
				printList(l);
				cout<<endl;
				break;
			case 5:
				cout<<"\nTong cua cac so chan trong list la :"<<sumEvenNumber(l)<<endl;	
				break;
			case 6:
				int k; 
				cout<<"\nNhap so can tim kiem trong list :";
				cin>>k;
				node *p = search(l,k);
				cout<<p->data;
				cout<<endl;
				break;
		}
	}while(chon != 0);
	return 0;
}
