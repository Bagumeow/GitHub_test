#include<iostream>
using namespace std;
void Menu ()
	{
		cout<<"=================MENU================\n";
		cout<<"1. Nhap danh sach lien ket.\n";
		cout<<("2. Xuat danh sach lien ket.\n");
		cout<<("3.Tong phan tu chan trong list.\n");
		cout<<("4. Tim kiem gia tri.\n");
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
void insertFirst(list &l,int x){
	node *p = createNode(x);
	if (p == NULL)
		return;
	addFirst(l,p);
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
node *search(list l,int x){
	node *p=l.first;
	while (p!= NULL){
		if (p->data == x){
			return p;
		}
		p =p->next;
	}
	return NULL;
}
int main(){
	list l;
	Init(l);
	int chon;
	do {
		Menu();
		cout<<"Chuc nang can chon la :";
		cin>>chon;
		switch(chon){
			case 1:
				createListFirst(l);
				break;
			case 2:
				cout<<"\nDanh sach cac phan tu trong list la : ";
				printList(l);
				cout<<endl;
				break;
			case 3:
				cout<<"\nTong cua cac so chan trong list la :"<<sumEvenNumber(l)<<endl;	
				break;
			case 4:
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
