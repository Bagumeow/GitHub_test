package Module2;


import java.time.LocalDate;



public class MainHangThucPham {
    public static void main(String[] args) {
        try {
            LocalDate nsx = LocalDate.of(2018,12,1);
            LocalDate hsd = LocalDate.of(2022,4,5);
            HangThucPham h1 = new HangThucPham("001", "Gao", 100000, nsx, hsd);
            nsx = LocalDate.of (2017,4,17);
            hsd = LocalDate.of(2021,12,3);
            HangThucPham h2 = new HangThucPham("002", "Keo", 5000, nsx, hsd);
            nsx = LocalDate.of (2009,6,30);
            hsd = LocalDate.of (2019,5,15);
            HangThucPham h3 = new HangThucPham("003", "Banh", 70000, nsx, hsd);
            System.out.printf("%-8s %-10s %-15s %-15s %-15s %-10s\n"
            ,"Ma_Hang","Ten_hang","Don_Gia","Ngay_San_Xuat","Ngay_het_han","Ghi_chu");
            for (int i = 0; i < 80; i++) {
                System.out.print("-");
            }
            System.out.println();
            System.out.println(h1);
            System.out.println(h2);
            System.out.println(h3);
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
}
