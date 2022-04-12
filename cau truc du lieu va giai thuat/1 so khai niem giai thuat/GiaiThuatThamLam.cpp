#include<iostream>
using namespace std;

void quicksort(int a[],int l , int r){
	int p= a[(l+r)/2];
	int i=l,j=r;
	while (i<j){
		while (a[i]<p){
			i++;
		}
		while (a[j]>p){
			j--;
		}
		if (i<=j){
			int temp = a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
	}
	if (i<r){
		quicksort(a,i,r);
	}
	if (l<j){
		quicksort(a,l,j);
	}
}
int main(){
	int n;
	cin >>n;
	int a[n];
	for (int i=0;i<n;i++){
		cin>>a[i];
	}
	quicksort(a,0,n-1);
	int k = 1;
	int max = 0;
	for (int i=n-1;i>=0;i--){
		if (a[i] + k >max){
			max = a[i] + k;
		}
		k++;
	}
	cout <<max;
	return 0;
}
