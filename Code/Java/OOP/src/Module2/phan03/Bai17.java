package Module2.phan03;

import java.util.Scanner;

/**
 * Viết chương trình in ra bội số của 3 từ 300 đến 3
 */
public class Bai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Boi so cua 3 tu 300->3 la :");
        for (int i = 300 ;i>=3;i--){
            if (i%3==0){
                System.out.print(i+" ");
            }
        }
    }
}
