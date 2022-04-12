#include<iostream>
#include<string.h>
using namespace std;
void Menu ()
	{
		cout<<"=================MENU================\n";
		cout<<"1. Nhap danh sach sinh vien .\n";
		cout<<"2. Xuat danh sach sinh vien  \n";
		cout<<"3. Xoa danh sach sinh vien \n";
		cout<<("4. Sap xep sinh vien.\n");
		cout<<("Vui long chon chuc nang, chon 0 de exit.\n");
		}
struct Ngay{
	int ngay,thang,nam;
};
struct SinhVien{
	char maSV[10];
	char hoTen[50];
	int gioiTinh;
	Ngay ngaySinh;
	char diaChi[100];
	char lop[12];
	char khoa[7];
};
struct node{
	SinhVien data;
	node *next;
};
struct list{
	node *first;
	node *last;
};
void Init(list &l){
	l.first=l.last=NULL;
}
node *createNode(SinhVien x){
	node *p = new node;
	if (p == NULL)
		return NULL;
	p->data=x;
	p->next=NULL;
	return p;
}
void addLast(list &l, node *p){
	if (l.first==NULL){
		l.first=p;
		l.last=l.first;
	}else {
		l.last->next=p;
		l.last=p;
	}
}
void insertLast(list &l,SinhVien x){
	node *p = createNode(x);
	if (p==NULL)
		return;
	addLast(l,p);
}
node * Search (list l, char x[])
{
	node *p = l.first;
	while (p != NULL && strcmp(p->data.maSV,x)!=0)
		p = p ->next;
	return p;	
}

int insertLast_KhongTrung(list &l,/*SinhVien*/ x){
	if (Search(l,x.maSV)){
		cout<<"Exception"<<endl;
		return 0;
	}else{
		insertLast(l,x);
		return 1;
	}
}
void deleteNode(list &l , char maSV[]){
	cout <<"Nhap ma sv can xoa: ";
	fflush(stdin);
	gets(maSV);
	node *temp = l.first, *p = l.last ;
	node *prev = NULL;
	if (temp != NULL && strcmp(temp->data.maSV,maSV) == 0)  
    {
        l.first = temp->next; 
        delete temp;            
        return;
    }
      else
    {
    while (temp != NULL && strcmp(temp->data.maSV,maSV) != 0)
    {
        prev = temp;
        temp = temp->next;
    }
    if (temp == NULL)
        return;
    prev->next = temp->next;
    delete temp;
    }
}
// Hàm nh?p m?t sinh viên. Nh?p thành công tr? v? 1, 
//nh?p không thành công (MASV = 0) thì tr? v? 0
int nhapSinhVien(SinhVien &x){
	cout<<"Ma so sinh vien: ";
	fflush(stdin);
	gets(x.maSV);
	if(strcmp(x.maSV,"0")==0)
		return 0;//Nhap MASV = 0 de dung
	cout<<"Ho va ten :";
	fflush(stdin);
	gets(x.hoTen);
	cout<<"Gioi tinh: ";
	fflush(stdin);
	cin>>x.gioiTinh;// nam = 0 , con lai la nu~
	cout<<"Ngay thang nam sinh: ";
	fflush(stdin);
	cin>>x.ngaySinh.ngay>>x.ngaySinh.thang>>x.ngaySinh.nam;
	cout<<"Dia chi: ";
	fflush(stdin);
	gets(x.diaChi);
	cout<<"Lop: ";
	gets(x.lop);
	cout<<"Khoa: ";
	gets(x.khoa);
	return 1;
}
void NhapDSSV(list &l){
	cout<<"\nBat dau nhap DSSV. Nhap MASV = 0 de dung"<<endl;
	SinhVien x;
	int flag = nhapSinhVien(x);
	while(flag){
		insertLast_KhongTrung(l,x);
		flag = nhapSinhVien(x);
	}
	cout<<"\n Ket thuc nhap DSSV.";
}
void getTieuDe(){
	printf("\n|%-10s|%-10s|%-23s|%-5s|%-8s|%-8s|%-8s|",
			"MASV","Ho ten","Ngay Sinh","Phai","Dia chi","Khoa","Lop");;
}
void xuatSinhVien(SinhVien s){
	char gt[4];
	if(s.gioiTinh==0)
		strcpy(gt,"Nam");
	else
	 	strcpy(gt,"Nu");
	printf("\n|%-10s|%-10s|%d/%d/%-17d|%-5s|%-8s|%-8s|%-8s|"
			,s.maSV,s.hoTen,s.ngaySinh.ngay,s.ngaySinh.thang,s.ngaySinh.nam,gt,s.diaChi,s.khoa,s.lop);
}
void XuatDSSV(list l){
	node *p=l.first;
	getTieuDe();
	while(p){
		xuatSinhVien(p->data);
		p=p->next;
	}
}
void InterchangeSortList(list &l){
	for(node *i=l.first;i!=l.last;i=i->next)
		for(node *j=i->next;j!=NULL;j=j->next)
			if(strcmp(i->data.hoTen,j->data.hoTen)>0)
				swap(i->data,j->data);
}

int main(){
	list l;
	Init(l);
	char x[10];
	cout<<endl;
	int chon;
	do {
		Menu();
		cout<<"Chuc nang can chon la :";
		cin>>chon;
		switch(chon){
			case 1:
				NhapDSSV(l);
				cout<<endl;
				break;
			case 2:
				XuatDSSV(l);
				cout<<endl;
				break;
			case 3:
				if(deleteNode(l,x))
					cout<<"Xoa Thanh Cong!";
				else
					cout<<"Xoa Khong thanh cong!";
				cout<<endl;
				break;
			case 4:
				InterchangeSortList(l);
				cout<<"Da Sap Xep Xong!"<<endl;
				break;
		}
	}while(chon != 0);
}







