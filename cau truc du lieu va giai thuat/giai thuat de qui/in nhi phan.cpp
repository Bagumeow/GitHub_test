#include<iostream>

using namespace std;

void nhiphan(int n, string s){
	if (n == 0) cout << s << " ";
	else {
		for (int i = 0; i <= 1; i++){
			nhiphan(n-1, s + char(i + '0'));
		}
	}
}
int main(){
	int n;
	cin >> n;
	nhiphan(n, "");
}
