package Module2.phan03;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Viết chương trình tìm USCLN của 2 số nhập vào.
 */

public class Bai05 {
    public static long ucln(long a, long b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
    public static void main(String[] args){
        try { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap 2 so a va b: ");
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println("USCLN cua a va b la: "+ucln(a,b));
        } catch (InputMismatchException e) {
            System.out.println("Khong duoc nhap chu");
        }
    }
}
