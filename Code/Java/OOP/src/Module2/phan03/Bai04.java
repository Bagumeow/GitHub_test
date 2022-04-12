package Module2.phan03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Viết chương trình giải phương trình bậc 1
 */


public class Bai04 {
    public static double tinhPtBac1(double a, double b) throws Exception {
        double x= -b/a;
        if (a==0){
            if (b == 0){
                throw new  Exception ("Phuong trinh vo so nghiem");
            } else {
                throw new  Exception(("Phuong trinh vo nghiem"));
            }
        } else {
            return x;
        }
    }
    public static void main(String[] args){
        try {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap he so a va b:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Phuong trinh co nghiem la x :"+tinhPtBac1(a,b));
        } catch (InputMismatchException e) {
            System.out.println("Khong duoc nhap chu");
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
