#include<iostream>
using namespace std;
long long  dequy(int a,int b){
	if (b==0) return 1;
	return a*dequy(a,b-1);
}
int main(){
	long long a,b;
	cin>>a>>b;
	cout<<dequy(a,b);
	return 0;
}
