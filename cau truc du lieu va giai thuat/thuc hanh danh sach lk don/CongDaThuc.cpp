#include<iostream>
using namespace std;
struct node{
	float heSo;
	int soMu;
	node *next;
};
struct list{
	node *first,*last;
};
void Init(list &l){
	l.first = l.last = NULL;
}
node *createNode(float heSo,int soMu){
	node *p = new node;
	if(p == NULL)
		return NULL;
	p->heSo = heSo;
	p->soMu = soMu;
	p->next = NULL;
	return p;
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

void insertLast(list &l,float heSo, int soMu){
	node *p = createNode(heSo,soMu);
	if (p == NULL)
		return;
	addLast(l,p);
} 

void nhapDaThuc(list &l){
	float heSo;
	int soMu;
	cout<<"Bat dau nhap da thuc ( nhap he so = 0 de ket thuc ):"<<endl;
	do {
		cout<<"Nhap he so :";
		cin>>heSo;
		if (heSo == 0)
			break;
		cout<<"Nhap so mu :";
		cin>>soMu;
		insertLast(l,heSo,soMu);
	}while(heSo != 0);
	cout<<"Da thuc da nhap xong"<<endl;
}
void printList(list l){
	node *p =l.first;
		if (p->heSo>1 && p->soMu>1){
			cout<<p->heSo<<"*x^"<<p->soMu;
		}else if (p->heSo==1 && p->soMu>1){
			cout<<"+x^"<<p->soMu;
		}else if (p->heSo<-1 && p->soMu>1){
			cout<<p->heSo<<"*x^"<<p->soMu;
		}else if (p->heSo==-1 && p->soMu>1){
			cout<<"-x^"<<p->soMu;
		}else if (p->heSo>1 && p->soMu==1){
			cout<<p->heSo<<"*x";
		}else if (p->heSo==1 && p->soMu==1){
			cout<<"x";
		}else if (p->heSo<-1 && p->soMu==1){
			cout<<p->heSo<<"*x";
		}else if (p->heSo==-1 && p->soMu==1){
			cout<<"-x";
		}else if (p->heSo>1 && p->soMu==0){
			cout<<p->heSo;
		}else if (p->heSo<0 && p->soMu==0){
			cout<<p->heSo;
		}
		p=p->next;
	while (p != NULL){
		if (p->heSo>1 && p->soMu>1){
			cout<<"+"<<p->heSo<<"*x^"<<p->soMu;
		}else if (p->heSo==1 && p->soMu>1){
			cout<<"+x^"<<p->soMu;
		}else if (p->heSo<-1 && p->soMu>1){
			cout<<p->heSo<<"*x^"<<p->soMu;
		}else if (p->heSo==-1 && p->soMu>1){
			cout<<"-x^"<<p->soMu;
		}else if (p->heSo>1 && p->soMu==1){
			cout<<"+"<<p->heSo<<"*x";
		}else if (p->heSo==1 && p->soMu==1){
			cout<<"+x";
		}else if (p->heSo<-1 && p->soMu==1){
			cout<<p->heSo<<"*x";
		}else if (p->heSo==-1 && p->soMu==1){
			cout<<"-x";
		}else if (p->heSo>1 && p->soMu==0){
			cout<<"+"<<p->heSo;
		}else if (p->heSo<0 && p->soMu==0){
			cout<<p->heSo;
		}
		p=p->next;
	}
}
void CongDaThuc(list l1,list l2,list &l3){
	Init(l3);
	node *p =l1.first, *q=l2.first;
	float sumHeSo;
	while(p&&q){
		if(p->soMu == q->soMu){
			sumHeSo=p->heSo + q->heSo;
			if (sumHeSo != 0)
				insertLast(l3,sumHeSo,p->soMu);
			p=p->next;
			q=q->next;
		} else {
			if (p->soMu > q->soMu){
				insertLast(l3,p->heSo,p->soMu);
				p=p->next;
			}else if(q->soMu > p->soMu){
				insertLast(l3,q->heSo,q->soMu);
				q=q->next;	
			}
		}	
	}
	while (q){
		insertLast(l3,q->heSo,q->soMu);
		q=q->next;
	}
	while (p){
		insertLast(l3,p->heSo,p->soMu);
		p=p->next;
	}
}

void interchangeSort(list &l){
	for (node *p=l.first;p!=l.last;p=p->next){
		for( node *q=p->next;q!=NULL;q=q->next){
			if (p->soMu < q->soMu){
				swap(p->heSo,q->heSo);
				swap(p->soMu,q->soMu);
			}
		}
	}
}
void TruDaThuc(list l1,list l2,list &l4){
	Init(l4);
	node *p =l1.first, *q=l2.first;
	float HieuHeSo;
	while(p&&q){
		if(p->soMu == q->soMu){
			HieuHeSo=p->heSo - q->heSo;
			if (HieuHeSo != 0)
				insertLast(l4,HieuHeSo,p->soMu);
			p=p->next;
			q=q->next;
		} else {
			if (p->soMu > q->soMu){
				insertLast(l4,p->heSo,p->soMu);
				p=p->next;
			}else if(q->soMu > p->soMu){
				insertLast(l4,q->heSo,q->soMu);
				q=q->next;	
			}
		}	
	}
	while (q){
		insertLast(l4,q->heSo,q->soMu);
		q=q->next;
	}
	while (p){
		insertLast(l4,p->heSo,p->soMu);
		p=p->next;
	}
}
int main(){
	list l1,l2,l3,l4;
	Init(l1);
	Init(l2);
	
	nhapDaThuc(l1);
	interchangeSort(l1);
		cout<<"Danh sach da thuc l1:";
	printList(l1);
		cout<<endl;
	nhapDaThuc(l2);
	interchangeSort(l2);
		cout<<"Danh sach da thuc l2:";
	printList(l2);
		cout<<endl;
	CongDaThuc(l1,l2,l3);
		cout<<"Danh sach da thuc da cong lai:";
	printList(l3);
		cout<<endl;
	TruDaThuc(l1,l2,l4);
		cout<<"Danh sach da thuc da tru :";
	printList(l4);
		cout<<endl;
	return 0;
}


