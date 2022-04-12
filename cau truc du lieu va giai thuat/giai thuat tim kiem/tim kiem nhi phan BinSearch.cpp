#include<iostream>
using namespace std;
int binsearch(int a[],int n,int x){
	int l=0,r=n-1;
	while (l<r){
		int mid = (l+r)/2;
		if(a[mid]<x){
			l = mid+1;
		} else {
			r = mid;
		}
	}
	if(a[l]==x){
		return l;
	}
	return -1;
}

int main(){
	int n,x;
	int a[10000];
	cin>>n;
	for (int i=0;i<n;i++){
		cin>>a[i];
	}
	cin>>x;
	cout<<binsearch(a,n,x);
	return 0;
}
