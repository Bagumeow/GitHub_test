#include<iostream>
using namespace std;
int Interpolation(int a[],int n,int x){
	int l=0, r=n-1;
	while (a[l]<=x && a[l]!= a[r] && a[r]>=x ){
		int mid=l+(r-l)*(x-a[l])/(a[r]-a[l]);
		if (a[mid]<x){
			l=mid+1;
		} else if (a[mid]>x){
			r=mid-1;
		} else {
			if (mid>0 && a[mid-1] == x ){
				r =  mid-1;
			} else {
				return mid;
			}
		}
	}
	if(a[l]==x){
		return l;
	}
	return -1;
}
int main(){
	int n,x;
	cin>>n;
	int a[n];
	for (int i=0;i<n;i++){
		cin>>a[i];
	}
	cin>>x;
	cout<<Interpolation(a,n,x);
	return 0;
}
