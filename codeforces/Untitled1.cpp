#include<bits/stdc++.h>
using namespace std;
int main(){
	string table;
	cin>>table;
	string c;
	for (int i=0;i<5;i++){
		cin>>c;
		if (c[0] == table[0] || c[1] == table[1]){
			cout <<"YES"<<endl;
			return 0;
		}
	}
	cout<<"NO"<<endl;
	return 0;
}
