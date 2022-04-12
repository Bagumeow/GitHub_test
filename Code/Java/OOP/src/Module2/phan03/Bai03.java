package Module2.phan03;

import java.util.InputMismatchException;
/**
 * Viết chương trình in ra tổng 1+3+5 …. +n nếu n là số chẵn, 2+4+6+ …. n nếu n là số lẻ.
 */
import java.util.Scanner;

public class Bai03 {
    public static int tinhTong(int n){
        int tong =0;
        if (n % 2==0){
            for (int i=1;i<=n;i++){
                if (i%2==0){
                    tong+=i;
                } else continue ;
            }
        } else {
            for (int i=1;i<=n;i++){
                if (i%2!=0){
                    tong +=i;
                } else continue;
            }
        }
        return tong;
    }
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Hay nhap n:");
            int n = sc.nextInt();
            if (n<0) {
                System.out.println("Khong duoc nhap so <0");
            } else{
                System.out.println("Tong = "+ tinhTong(n));
            }
        } catch (InputMismatchException e) {
            System.out.println("Khong duoc nhap chu!!");
        }
    }
    
}
