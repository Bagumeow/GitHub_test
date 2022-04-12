#include<iostream>
using namespace std;
void selectionsort(int a[],int n){
	int indexmin;
	for (int i=0;i<n-1;i++) {
		indexmin=i;
		for (int j=i+1;j<n;j++){
			if (a[indexmin] > a[j]){
				indexmin = j;
			}
		}
		if (i != indexmin){
			int temp = a[i];
			a[i] = a[indexmin];
			a[indexmin]=temp;
		}
	}
} 
int main(){
	int n;
	cin>>n;
	int a[n];
	for (int i=0;i<n;i++){
		cin>>a[i];
	}
	selectionsort(a,n);
	for (int i=0;i<n;i++){
		cout<<a[i]<<" ";
	}
	return 0;
} 
