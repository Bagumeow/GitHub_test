package Module2.phan03;

import java.util.Scanner;
/**
 * Viết chương trình in ra số lần kí tự ‘a’ xuất hiện trong một chuỗ
 */
public class Bai09 {
    public static int dem(String s){
        char c = 'a';
        int count=0;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap chuoi :");
        String s = sc.nextLine();
        System.out.println("So lan ky tu a xuat hien trong chuoi la :"+dem(s));
    }
}
