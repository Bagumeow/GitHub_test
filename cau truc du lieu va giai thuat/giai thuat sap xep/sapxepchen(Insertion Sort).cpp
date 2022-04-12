#include<iostream>
using namespace std;
void insertionsort(int a[],int n){
	int index, value;
	for (int i=1;i<n;i++){
		index=i;
		value=a[i];
		while (index > 0 && a[index-1] > value){
			a[index] = a[index-1];
			index--;
		}
		a[index]=value;
	}
} 
int main(){
	int n;
	cin>>n;
	int a[n];
	for (int i=0;i<n;i++){
		cin>>a[i];
	}
	insertionsort(a,n);
	for (int i=0;i<n;i++){
		cout<<a[i]<<" ";
	}
	return 0;
} 
