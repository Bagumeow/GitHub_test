#include<iostream>
using namespace std;
int findx(int a[],int n,int x){
	for (int i=0;i<n;i++){
		if(a[i]==x) {
			return i;
			break;
		}
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
	cout<<findx(a,n,x);
	return 0;
}
