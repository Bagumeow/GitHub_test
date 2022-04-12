#include<iostream>
#include<queue>
#include<stdio.h>
using namespace std;
struct mathang{
	int mamh;
	char tenmh[12];
}; 

int main(){
	queue<mathang> q;
	int chucnang;
	char c;
	mathang mh;
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
				cin>>mh.tenmh;
				q.push(mh);
				break;
			}
			case 2:{
				if(!q.empty()){
					cout<<"\nMat hang xuat:Ma:"<<mh.mamh<<", Ten:"<<mh.tenmh;
					q.pop();
				}
				else
					cout<<"\nKho khong con hang";
				break;
			}
			case 3:{
				cout<<"\nMat hang chuan bi xuat:Ma:"<<q.front().mamh<<", Ten:"<<q.front().tenmh;
				break;
			}
			case 4:{
				cout<<"\nMat hang moi nhap:Ma:"<<q.back().mamh<<", Ten:"<<q.back().tenmh;
				break;
			}
//			case 5:{
//				if (q.empty())
//					cout<<"Kho khong con hang"<<endl;
//				else {
//					mathang a[q.size()];
//					cout<<"\nCac mat hang co trong kho:";
//					printf("\n%11s%15s","MA MAT HANG","TEN MAT HANG\n");
//					for (int i =1;i<=q.size();i++){
//						b[i]=q
//					}
//					for (int i =1;i<=q.size();i++){
//						cout<<"Ma:"<<q[i].mamh<<", Ten:"<<q[i].tenmh;
//					}
//				}
//			}
			case 6: {
				while(!q.empty()){
					q.pop();
				}
				break; 
			}
		}
	} while (chucnang!=0);
}


