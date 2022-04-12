package Module2.phan03;

import java.util.Scanner;

/**
 * Tính tổng N số nguyên tố đầu tiên
 */

public class Bai08 {
    public static boolean ktsnt(int n){
        if (n <= 1) return false;
        for (int i = 2; i <=Math.sqrt(n); ++i) 
            if (n % i == 0) return false;
        return true;
    }
    public static int tinhTongnsnt(int n){
        int sum=0,i=0;
        for(int j=0;;j++){
        if(ktsnt(j))
        {
            sum+=j;
            i++;
        }
            if(i==n) break;
        }
        return sum;
    }
    public static void main(String[] args){
        try {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap n: ");
        int n = sc.nextInt();
        if (n<0){
            System.out.println("Khong duoc nhap so <0");
        } else {
            System.out.println("Tong n snt dau tien la :"+ tinhTongnsnt(n));
        }
        } catch (Exception e) {
            System.out.println("Khong duoc nhap chu !!");
        }
    }
}
