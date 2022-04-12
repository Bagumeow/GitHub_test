#include <stdio.h>
#include <time.h>
#include <stdlib.h>

struct Node
{
	int data;
	Node * link;
};

struct List
{
	Node * First;
	Node * Last;
		
};
/*
void Menu ()
{
	printf ("Chuong trinh quan ly ")
}
*/
Node* GetNode (int x) 
{	Node *p;		
	p = new Node;  // C?p phát vùng nh? cho node
	if  (p==NULL)   
		{ 
			printf ("Khong du bo nho!");  return NULL; 
		}
	p->data = x; 	// Gán d? li?u cho ph?n t? p
	p->link = NULL;
	return p; 
}

void Init (List &L)
{
	L.First = L.Last = NULL;	
}

void AddFirst(List &L, int x)
{	Node *p = GetNode (x);
	if(L.First == NULL)
		L.First = L.Last = p;
	else
		{	p ->link = L.First;
			L.First = p;
		}
}

void AddLast(List &L, int x)
{	Node *p = GetNode (x);
	if(L.First == NULL)
		L.First = L.Last = p;
	else
		{	L.Last ->link = p;
			L.Last = p;
		}
}

void CreateListHead (List &L, int &n)
{
	int x, i;
	printf ("n = "); scanf ("%d", &n);
	for (i = 1 ; i<=n ; i++)
	{	printf ("Nhap du lieu phan tu thu %d : ",i);
		scanf ("%d" , &x);
		AddFirst (L,x);
	}
}

void CreateListLast (List &L, int &n)
{
	int x, i;
	printf ("n = "); scanf ("%d", &n);
	for (i = 1 ; i<=n ; i++)
	{	printf ("Nhap du lieu phan tu thu %d : ",i);
		scanf ("%d" , &x);
		AddLast (L,x);
	}
}

void CreateListRand (List &L, int &n)
{	srand (time (NULL));
	int x, i;
	printf ("n = "); scanf ("%d", &n);
	for (i = 1 ; i<=n ; i++)
	{	x = rand()%100;
		AddLast (L,x);
	}
}

void AddAfter (List &L, Node *q, Node* p)
{	if (q!=NULL)  
	{
		p->link = q->link;
		q->link = p; 	
		if(q == L.Last)
			L.Last = p; 
	}
}
// Chen nut co khoa x vao sau nut max
void AddAfterMax (List &L, int &x)
{	printf("Nhap gia tri can chen sau max : ");
	scanf ("%d", &x);
	Node *q = L.First, *p;
	for (p=q->link ; p!= NULL ; p = p->link)
		if (p ->data > q ->data)
			q = p;
	p = GetNode(x);
	AddAfter (L,q,p);			 
}

// Chen nut co khoa x vao sau nut chan dau tien
void AddAfterFirstEven (List &L, int &x)
{	printf("Nhap gia tri can chen sau chan dau tien : ");
	scanf ("%d", &x);
    Node *p = GetNode(x);
    Node *q = L.First;
    while(q!=NULL && q->data %2 != 0 )
    	q = q->link;
    AddAfter(L,q,p);
}

// Chen nut co khoa x vao sau nut chan max
void AddAfterMaxEven (List &L, int x)
{	Node *q = L.First, *p;
	while(q!=NULL && q->data %2 != 0 )
    	q = q->link;
	if (q != NULL)// q tro den first even
	{
		for (p = q ->link; p!= NULL; p = p ->link)
			if (p ->data %2 == 0 && p ->data > q ->data)
				q = p;
		//q tro den max even
		p = GetNode(x);
		AddAfter (L,q,p);			
	}			
}

float AvgList (List L)
{
	long S = 0; int d = 0;
	for (Node *p = L.First; p != NULL ; p = p -> link)
		{
			S += p ->data ; d++; 
		}
	return 1.0*S/d;
}

/*
void addAfterMaxEven(list &l, int x)
{
    node *p = createNode(x);
    node *q = l.pHead;
    node *tmp=NULL;
    while (q != NULL)
    {
        if (q->data % 2 == 0)
        {
            tmp = q;
            break;
        }
        q = q->pNext;
    }
    while (q != NULL)
    {
        if (q->data % 2 == 0)
        {
            if(tmp->data<q->data)
                tmp=q;
        }
        q= q->pNext;
    }
    addAfter(l, tmp, p);
}

*/

/*
void addAfterFirstEven(List &L,int &x)
{	printf("Nhap gia tri can chen sau max : ");
	scanf ("%d", &x);
    node *p = GetNode(x);
    node *q = l.pHead;
    while(q!=NULL)
    {
        if(q->data%2==0)
        break;
        q=q->pNext;
    }
    AddAfter(l,q,p);

}
*/

int RemoveAfter (List &L, Node *q )
{
	if (q !=NULL && q->link !=NULL)
	{
		Node*   p = q->link;
		q->link = p->link;
		if  (p==L.Last)	 L.Last = q;
		delete p;
		return 1;
	}
	else return 0;
}

// Xoa sau Max
void RemoveAfterMax (List &L)
{
	Node *q = L.First, *p;
	for (p = q ->link ; p != NULL ; p = p->link)
		if (p ->data > q ->data)
			q = p;
	RemoveAfter (L,q);		
} 

void RemoveFirst (List &L)
{
	if (L.First != NULL)
	{	Node* p = L.First;
		L.First = p->link;
		if (L.First == NULL)  L.Last=NULL; 
		delete p;
	}
}

void RemoveLast (List &L)
{	Node *q;
	if (L.First == L.Last)
		{	delete (L.First);
			Init (L); return;	
		}
	q = L.First;
	while (q ->link != L.Last)
		q = q ->link;	
	RemoveAfter(L,q);
}
 
void Swap (int &a, int &b)
{
	int t = a ; a = b ; b = t ;
} 
 
// Xoa Max
void RemoveMax (List &L)
{
	Node *q = L.First, *p;
	for (p = q ->link ; p != NULL ; p = p->link)
		if (p ->data > q ->data)
			q = p;
	if (q == L.First) RemoveFirst(L);
	else if (q == L.Last) RemoveLast(L);
		else 
		{	Swap (q ->data , q ->link->data);
			RemoveAfter(L,q);	
		}
}
//Xoa nut dau tien co khoa k
int RemoveNode  (List &L, int k) 
{	Node    *p = L.First, *q = NULL; 
	while  (p != NULL) 
	{ 	if  (p->data == k) break; 
		q = p;    
		p = p->link; 
	} 
	if (p == NULL)  return 0;
	else if (q == NULL) 
			RemoveFirst(L); // th?c hi?n xóa ph?n t? d?u ds là p
		else 
			RemoveAfter(L,q); // th?c hi?n xóa ph?n t? p sau q
} 

Node * Search (List L, int k)
{
	Node *p = L.First;
	while (p != NULL && p ->data != k)
		p = p ->link;
	return p;	
}

//Xoa tat ca cac nut co khoa k
void RemoveAllK (List &L, int k)
{
	while (Search (L,k))
		RemoveNode (L,k);
}

void PrintList (List L)
{
	Node *p;
	for (p = L.First; p!=NULL; p=p->link)
		printf ("%6d", p->data);
		
}

int main ()
{	List L;
	int n,x;
	Init (L);
	//CreateListRand (L, n);
	CreateListLast (L,n); 
	PrintList(L); printf("\n");
//	printf ("x = "); scanf("%d", &x);
//	AddAfterMaxEven(L,x);
//	PrintList(L); printf("\n");
	
//	AddAfterMax(L,x);	
//	PrintList(L); printf("\n");
//	AddAfterFirstEven(L,x);	
//	PrintList(L); printf("\n");
//	RemoveAfterMax (L);
//	RemoveMax (L);
	printf ("Nhap gia tri can xoa x = ");
	scanf ("%d", &x);
//	RemoveNode (L,x);
	RemoveAllK (L,x);
	PrintList(L); printf("\n");
	
		

}
