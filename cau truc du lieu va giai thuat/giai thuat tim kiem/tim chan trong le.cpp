#include<iostream>
using namespace std;
void find(int a[],int n){
	bool kt = true;
	for (int i=0;i<n;i++){
		if(a[i]%2!=0 && i%2==0) {
			cout<<a[i]<<" ";
			kt = false;
		}
	}
	if (kt) cout<<"NULL";
}

int main(){
	int n;
	int a[10000];
	cin>>n;
	for (int i=0;i<n;i++){
		cin>>a[i];
	}
	find(a,n);
	return 0;
}
