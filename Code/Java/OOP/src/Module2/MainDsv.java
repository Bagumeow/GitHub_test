package Module2;

import java.util.Scanner;

public class MainDsv {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            DiemSinhVien sv1 = new DiemSinhVien(20116351, "Le Thanh Nghia", 8, 9);
            DiemSinhVien sv2 = new DiemSinhVien();
            sv2.setMasv(20116953);
            sv2.setHoten("Nguyen Tri Khanh");
            sv2.setLt((float) 7.6);
            sv2.setTh((float) 8.3);
            System.out.print("Nhap ten sv3 :");
            String name = sc.nextLine();
            System.out.print("Nhap ma sv3 :");
            int masv = sc.nextInt();
            System.out.print("Nhap diem LT :");
            float lt = sc.nextFloat();
            System.out.print("Nhap diem TH :");
            float th = sc.nextFloat();
            DiemSinhVien sv3 = new DiemSinhVien(masv, name, lt, th);
            System.out.printf("%-10s %-30s %-10s %-10s %-10s\n", "mssv", "Hoten", "Diem lt", "Diem th", "Diem tb");
            System.out.println(sv1.toString());
            System.out.println(sv2.toString());
            System.out.println(sv3.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}