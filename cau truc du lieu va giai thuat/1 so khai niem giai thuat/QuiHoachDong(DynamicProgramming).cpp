#include<iostream>
using namespace std;
void printArr(int a[], int l, int r){
	for (int i = l ; i<= r ; i++){
		cout << a[i] << " ";
	}
}
int main (){
	int n;
	cin>>n;
	int a[n];
	for (int i = 0 ; i<n ; i++){
		cin>>a[i];
	}
	int l[n];
	l[0] = 1;
	for (int i = 1 ; i<n;i++){
		if (a[i] >= a[i-1]) {
			l[i] = l[i-1] +1;
		} else {
			l[i] = 1;
		}
	}
	int max = 0;
	for (int i=0;i<n;i++){
		if (l[max] < l[i]){
			max = i;
		}
	}
	printArr(a,max-l[max]+1,max);
	return 0;
}
