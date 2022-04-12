#include<bits/stdc++.h>
using namespace std;
int main(){
	int n; cin>>n;
	vector<int> v;
	for (int i=1;i<=n;i++){
		v.push_back(i);
	}
	int count=0;
	for (int i=1;i<=n;i++){
		if (v[i]<i){
			count+=1;
		}
	}
	return 0;
}
