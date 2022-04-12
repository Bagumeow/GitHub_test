package Module2.phan03;

import java.util.Scanner;
/**
 * Viết chương trình in ra giá trị lớn nhất và nhỏ nhất trong một dãy các giá trị user đã nhập.

 */

public class Bai15 {

    public static int giaTriLonNhat(int[] a){
        int max = a[0];
        for (int i=1;i<a.length;i++){
            if (a[i]>max){
                max = a[i];
            }
        }
        return max;
    }
    public static int giaTriNhoNhat(int[] a){
        int min = a[0];
        for (int i=0;i<a.length;i++){
            if (a[i] < min){
                min = a[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
     try {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap n :");
        int n = sc.nextInt();
        if (n<0){
            System.out.println("Khong duoc nhap so <0");
        } else {
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Gia tri lon nhat la :"+giaTriLonNhat(a));
        System.out.println("Gia tri nho nhat la :"+giaTriNhoNhat(a));
        }
    } catch (Exception e) {
            System.out.println("Khong duoc ghi chu");
    }
    }
}
