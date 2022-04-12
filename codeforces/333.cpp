#include<bits/stdc++.h>
using namespace std;
int main(){
	int t=1;
	cin>>t;
	while(t--){
		int  n; cin>>n;
		int  count=1,i=0;
		while(count <= n){
			i++;
			count = i*i;
			if(count == n){
				i--;
				break;
			} else if (count > n){
				i--;
				break;
			}
		}
		count=i*i;
		int  x=1,y=i+1;
		for (int  j=count+1;j<=(i+1)*(i+1);j++){
			if(j==n){
				cout<<x<<" "<<y<<endl;
				break;
			} else {
				if(x>=i+1) y--;
				if(x<i+1) x++;
			}
		}
	}
	return 0;
}
