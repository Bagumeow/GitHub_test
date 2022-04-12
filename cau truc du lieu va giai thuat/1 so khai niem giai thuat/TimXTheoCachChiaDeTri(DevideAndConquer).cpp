#include<iostream>
using namespace std;
int countdevide(int a[], int l, int r , int x){
	if (l == r){
		if (a[l] ==  x) return 1;
		else return 0;
	} else {
		int m = (l+r)/2;
		return countdevide(a,l,m,x) + countdevide(a,m+1,r,x);
	}
}
int main(){
	int n,x;
	cin>>n;
	int a[n];
	for (int i=0;i<n;i++){
		cin>>a[i];
	}
	cin>>x;
	cout << countdevide(a,0,n-1,x);
	return 0;
} 
