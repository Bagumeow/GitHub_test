package Module2.phan03;

import java.util.Scanner;
/**
 * Viết hàm để đếm số lượng ký tự là số có trong chuỗi s. Chuỗi s được nhập từ bàn phím
 */
public class Bai11 {
    public static int demTu(String s){
        int count=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)>=48 && s.charAt(i)<=57){
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap chuoi :");
        String s = sc.nextLine();
        System.out.println("So luong ky tu so la :"+demTu(s));
    }
}
