package Module2.phan03;
/**
 * Viet chuong trinh hien thi ra n so dau tien cua day Fibonaci
 */
import java.util.Scanner;

public class Bai18 {
    public static void Fibonaci(Long n){
        Long n1=(long) 1,n2=(long)1,n3=(long)0;
        if (n==1){
            System.out.print(n1);
        } else if(n==2){
            System.out.print(n1+" "+n2);
        } else {
            System.out.print(n1+" "+n2+" ");
            for (int i=2;i<n;++i){
                n3=n2+n1;
                System.out.print(n3+" ");
                n1=n2;
                n2=n3;
            }
            //System.out.print(n3+" ");
        }
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Hay nhap n:");
            Long n = sc.nextLong();
            if (n<0){
                System.out.println("Khong duoc nhap so <0 !!");
            } else{
             Fibonaci(n);
            }
        } catch (Exception e) {
        System.out.println("Khong duoc nhap chu !!");
         }   
    }
}
