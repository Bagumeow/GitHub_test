package Module2.phan03;
/**
 * Tính tổng các số nguyên tố nhỏ hơn N
 */

import java.util.Scanner;

public class Bai07 {
    public static boolean ktsnt(int n){
        if (n <= 1) return false;
        for (int i = 2; i <=Math.sqrt(n); ++i) 
            if (n % i == 0) return false;
        return true;
    }
    public static int tinhTongsnt(int n){
        int sum=0;
        for (int i=1;i<n;i++){
            if(ktsnt(i)){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        try {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap n: ");
        int n = sc.nextInt();
        if (n<0){
            System.out.println("Khong duoc nhap so <0 !!");
        } else {
            System.out.println("Tong so nguyen to nho hon n la :"+tinhTongsnt(n));
        }
        } catch (Exception e) {
            System.out.println("Khong duoc nhap chu !!");
        }
    }
}
