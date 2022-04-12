package hinh;

import java.util.Scanner;

public class Entry {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chieu dai :");
		float cd = sc.nextFloat();
		System.out.print("Nhap chieu rong:");
		float cr = sc.nextFloat();
		HinhChuNhat hcn1 = new HinhChuNhat(cd,cr); 
		System.out.println(hcn1.toString()); 
		System.out.println("Chu vi ="+hcn1.tinhChuVi());
		System.out.println("Dien tich hinh chu nhat la :"+hcn1.tinhDienTich());
	}
}
