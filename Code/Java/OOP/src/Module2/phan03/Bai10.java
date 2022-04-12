package Module2.phan03;

import java.util.Scanner;
/**
 * Viết hàm tách chuỗi gốc thành chuỗi con.
 */
public class Bai10 {
    public static void chiaTu(String s){
        String[] words = s.split(" ");
		for(String word:words) {
			System.out.println(word);
		}
    }
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap chuoi :");
        String s = sc.nextLine();
        chiaTu(s);
    }
}
