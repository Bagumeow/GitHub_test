package Module2.phan03;
/**
 * Viết chương trình đọc một giá trị nguyên từ bàn phím và in ra số đó là số chẵn, lẻ hoặc zero.

 */
import java.util.Scanner;

public class Bai16 {
    public static void check(int n){
        if (n%2 == 0) {
            System.out.println("Day la so chan");
        } else if ( n==0){
            System.out.println("Day la zero");
        } else {
            System.out.println("Day la so le");
        }
    }
    public static void main(String[] args) {
    try {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap so de kiem tra :");
        int n = sc.nextInt();
        check(n);
    } catch (Exception e) {
        System.out.println("khong duoc nhap chu !!");
     }
    }
}
