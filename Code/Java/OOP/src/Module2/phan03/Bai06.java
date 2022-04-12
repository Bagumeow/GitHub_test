package Module2.phan03;
/**
 * Viết chương trình kiểm tra số nhập vào có phải là số nguyên tố hay không
 */
import java.util.Scanner;

public class Bai06 {
    public static boolean ktsnt(int n){
        if (n <= 1) return false;
        for (int i = 2; i <=Math.sqrt(n); ++i) 
            if (n % i == 0) return false;
        return true;
    }
    public static void main(String[] args){
        try {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap n: ");
        int n = sc.nextInt();
        if (ktsnt(n)){
            System.out.println("n la so nguyen to");
        } else {
            System.err.println("n khong phai la so nguyen to");
        }
        } catch (Exception e) {
            System.out.println("Khong duoc nhap chu");
        }
    }
}
