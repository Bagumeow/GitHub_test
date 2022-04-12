#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define Max 100000
	void Menu ()
	{
		printf ("=================MENU================\n");
		printf ("1. Nhap mang phat sinh.\n");
		printf ("2. Nhap mang tu user.\n");
		printf ("3. Xuat mang\n");
		printf ("4. Ghi mang vao file.\n");
		printf ("5. Doc file text vao mang\n");
		printf ("6. Tim kiem tuyen tinh\n");
		printf ("7. TIm kiem de quy\n");
		printf ("Vui long chon chuc nang, chon 0 de exit.\n");
		}
int GhiMangVaoFileText(char* filename,int a[],int &n)
{
	FILE *f;
	f = fopen(filename, "w");
	if(!f) 
	{
		printf("Khong mo duoc tep");
		return 0;
	}
	for(int i=0; i<n; i++)
		fprintf(f ,"%d\t",a[i]); 
	fclose(f);
		return 1;
}
int DocFileTextVaoMang(char* filename,int a[],int &n)
{
	int i=0;
	FILE *f;
	f = fopen(filename,"r");
	if(!f) 
		return 0;
	while(!feof(f)) 
	{
		fscanf(f,"%d",&a[i]); 
		i++; 
	}
	n = i;
}
void Nhap_Mang(int a[],int &n)
{
	for(int i=0;i<n;i++)
	{
		printf("Nhap phan tu thu a[%d]=",i);
		scanf("%d",&a[i]);
	}
}
void Phat_Sinh_Mang(int a[],int &n)
{
	srand(time(0));
	for(int i=0;i<n;i++)
		a[i]=rand();
}
void Xuat_Mang(int a[],int n)
{
	printf("\n");
	for(int i=0;i<n;i++)
		printf("%10d",a[i]);
	printf ("\n");
}
void selectionSort(int a[],int n){
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
	}
} 
int LinearSearch(int a[], int x, int n){
	for (int i =0 ;i<n;i++){
		if (a[i] == x){
			return i;
		}
	}
	return -1;
}
int BinarySearch(int a[], int x, int n){
	int l = 0, r = n-1;
	while (l < r){
		int mid = (l+r)/2;
		if (a[mid] < x){
			l = mid+1;
		}
		else{
			r = mid;
		}
	}
	if (a[l] == x){
		return l;
	}
	return -1;
}

int main()
{
	int n,a[Max],chon,x;
	int left=0,right,kq;
	float time;
	clock_t start,end;
//	printf("Nhap so luong phan tu:");
//	scanf("%d",&n);
	do
	{
	Menu();
	scanf ("%5d",&chon);
	switch (chon)
	{
		case 1: 
				printf("Nhap so luong phan tu muon phat sinh:");
				scanf("%d",&n);
				Phat_Sinh_Mang(a,n);
				break;
		case 2: 
				printf("Nhap so luong phan tu :");
				scanf("%d",&n);
				Nhap_Mang(a,n);
				break;
		case 3: 
				printf ("Danh sach mang la:");
				Xuat_Mang(a,n);
				break;
		case 4: 
				GhiMangVaoFileText("C:\\Users\\Admin\\OneDrive\\Desktop\\File Code\\Baitap ctdlvgt\\Luu file\\mang1.txt",a,n);
				break;
		case 5: 
				DocFileTextVaoMang("C:\\Users\\Admin\\OneDrive\\Desktop\\File Code\\Baitap ctdlvgt\\Luu file\\mang1.txt",a,n);
				break;
		case 6:
				printf ("Nhap so can tim: ");
				scanf ("%d",&x);
				start = clock();
				kq=LinearSearch(a,x,n);
				end =clock();
				time = end - start;
				printf("Thoi gian tim kiem tuyen tinh la: %f\n",time);
				if (kq==-1)
					printf ("Khong tim thay. \n");
				else
					printf ("Tim thay tai vi tri: %d. \n",kq);
				break;
		case 7:
				printf ("Nhap so can tim: ");
				scanf ("%d",&x);
				selectionSort(a,n);
				start = clock();
			//	Xuat_Mang (a,n);
				kq=BinarySearch(a,x,n);
				end =clock();
				time = end - start;
				printf("Thoi gian tim kiem nhi phan la: %f\n",time);
				if (kq==-1)
					printf ("Khong tim thay. \n");
				else
					printf ("Tim thay tai vi tri: %d. \n",kq);
				break;
				}
	}while (chon!=0);
}
