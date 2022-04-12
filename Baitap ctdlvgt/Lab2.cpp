#include <iostream> 
#include <time.h>
#include <stdlib.h>
#include <stdio.h>
int slhoanvi=0;
// Nhap mang 
void NhapMang(int a[], int &n)
{
	printf("Ban muon phat sinh mang co bao nhieu ptu?");
	scanf("%d", &n);
	for(int i=0; i<n; i++)
	{
		printf("a[%d]=", i);
		scanf("%d", &a[i]);
	}
}
// Phat sinh mang
void PhatSinhMang(int a[], int &n)
{
	printf("Ban muon phat sinh mang co bao nhieu ptu?");
	scanf("%d", &n);
	srand(time(NULL));
	for(int i=0; i<n; i++) a[i] = rand();
	
}
// Xuat mang
void XuatMang(int a[], int n)
{
	printf("\n");
	for(int i=0; i<n; i++) printf("%10d", a[i]);

}
//Ghi mang a có n phan tu vao file text
int GhiMangVaoFileText(char* filename, int a[], int n)
{
	FILE* f = fopen(filename, "w");// write dang TEXT
	if(!f) //khong mo duoc tep
		return 0;	
	for(int  i= 0; i < n; i++)
 		fprintf(f ,"%d\t",a[i]); //Ghi cac phan tu vao file cach nhau 1 dau tab
	fclose(f);
	return 1; //Ghi file thanh cong
}
//Doc file text vao mang a
int DocFileTextVaoMang(char* filename, int a[], int &n)
{
	FILE* f = fopen(filename, "r"); //read
	if(!f) // khong mo duoc file
		return 0;	
	int i=0;
	while(!feof(f)) //Trong khi chua het file
	{
 		fscanf(f,"%d",&a[i]); //doc tung phan tu vao mang
 		i++; // tang chi so
	}
	n = i-1;
	fclose(f);
	return 1; //Doc file thanh cong
}
// doi cho truc tiep
void interchangeSort(int a[],int n){
	for (int i=0;i<n-1;i++) {
		for (int j=i+1;j<n;j++){
			if (a[i]>a[j]){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
} 
// selectionsort  
void selectionsort(int a[],int n){
	int slhv=0;
	int indexmin;
	for (int i=0;i<n-1;i++) {
		indexmin=i;
		for (int j=i+1;j<n;j++){
			if (a[indexmin] > a[j]){
				indexmin = j;
			}
		}
		if (i != indexmin){
			int temp = a[i];
			a[i] = a[indexmin];
			a[indexmin]=temp;
		}
		slhv++;
	}
	printf("So lan hoan vi la :%d \n",slhv);
} 
// insertionsort  
void insertionsort(int a[],int n){
	int slhv=0;
	int index, value;
	for (int i=1;i<n;i++){
		index=i;
		value=a[i];
		while (index > 0 && a[index-1] > value){
			a[index] = a[index-1];
			index--;
		}
		a[index]=value;
		slhv++;
	}
	printf("So lan hoan vi la :%d \n",slhv);
} 
//quick sort 
void quickSort(int a[], int l, int r,int &slhoanvi){
	//nhap n de xuat mang
	int p = a[(l+r)/2];
	int i = l, j = r;
	while (i < j){
		while (a[i] < p){
			i++;
		}
		while (a[j] > p){
			j--;
		}
		if (i <= j){
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
			slhoanvi++;
		}
	}
	if (i < r){
		quickSort(a, i, r,slhoanvi);
	}
	if (l < j){
		quickSort(a, l, j,slhoanvi);
	}
}
//bubleSort
void bubbleSort(int a[], int n){
	for (int i = n-1; i >= 1; i--){
		bool swapped= true;
		for (int j = 0; j < i; j++){
			if (a[j] > a[j+1]){
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				swapped = false;
			}
		}
		if (swapped){
			break;
		}
	}
}
// Chuong trinh chinh
int main()
{
	clock_t start, end;
	int KT=1, chon;
	int a[100000], n, x,kq;
	double t;
	//PhatSinhMang(a,n);
	//GhiMangVaoFileText("C:\\Users\\Admin\\OneDrive\\Desktop\\File Code\\Baitap ctdlvgt\\Luu file\\mang2.txt",a,n);
	/*DocFileTextVaoMang("C:\\Users\\Admin\\OneDrive\\Desktop\\File Code\\Baitap ctdlvgt\\Luu file\\mang1.txt",a,n);
	start =clock();
	quickSort(a,0,n-1,slhoanvi);
	end =clock();
	t = end - start;
	printf("so lan hoan vi la : %d\n", slhoanvi);
	printf("Thoi gian tim kiem quicksort : %f",t);*/
	
	DocFileTextVaoMang("C:\\Users\\Admin\\OneDrive\\Desktop\\File Code\\Baitap ctdlvgt\\mang1.txt",a,n);
	start =clock();
	selectionsort(a,n);
	end =clock();
	t = end - start;
	printf("Thoi gian tim kiem selectionsort : %f",t);
	
	
}
