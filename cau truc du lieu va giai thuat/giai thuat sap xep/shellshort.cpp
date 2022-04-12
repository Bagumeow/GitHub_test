#include<iostream>
using namespace std;

void shellshort(int a[],int n){
	int interval,i,j,temp;
	for (interval = n/2;interval>0;interval /= 2){
		for (i=interval;i<n;i++){
			temp=a[i];
			for (j=i;j>=interval && a[j - interval] > temp;j -= interval){
				a[j]=a[j-interval];
			}
			a[j]=temp;
		}
	}
}
int main(){
	int n;
	cin >>n;
	int a[n];
	for (int i=0;i<n;i++){
		cin>>a[i];
	}
	shellshort(a,n);
	for (int i=0;i<n;i++){
		cout <<a[i]<<" ";
	}
	return 0;
}
