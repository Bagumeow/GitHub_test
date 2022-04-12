package Module03.Bai06;

import java.text.DecimalFormat;
import java.time.LocalDate;



public class Main {
    public static void menu() {
        System.out.println("1)Them Hoa Don theo gio:");
        System.out.println("2)Them Hoa Don theo ngay:");
        System.out.println("3)Xuat danh sach hoa don hien co:");
        System.out.println("4)So Luong Hoa Don Theo Gio");
        System.out.println("5)So Luong Hoa Don Theo Ngay");
        System.out.println("6)Tong so luong hoa don theo thang va nam");
    }
    public static void main(String[] args) throws Exception {
        HoaDonKhachSan[] h = new HoaDonKhachSan[5];
        h[0] = new HoaDonTheoGio("100", LocalDate.of(2015, 12, 2), "Nguyen van Bao", "108", 500000, 12);
        h[1] = new HoaDonTheoGio("101", LocalDate.of(2012, 12, 2), "Nguyen van an", "107", 500000, 24);
        h[2] = new HoaDonTheoNgay("102", LocalDate.of(2019, 5, 12), "Le Van Nam", "125", 1000000, 3);
        h[3] = new HoaDonTheoNgay("103", LocalDate.of(2015, 12, 12), "Pham Thai Bao", "135", 1000000, 3);
        h[4] = new HoaDonTheoNgay("104", LocalDate.of(2022, 5, 12), "Binh Minh", "155", 1000000, 10);
        DanhMucHoaDon a = new DanhMucHoaDon(5);
        a.them(h[0]);
        a.them(h[1]);
        a.them(h[2]);
        a.them(h[3]);
        a.them(h[4]);
        System.out.println(a);
        System.out.println("So Luong Hoa Don Theo Gio la :"+a.thongKeSoLuongHDTheoGio());
        System.out.println("So Luong Hoa Don Theo Ngay la :"+a.thongKeSoLuongHDTheoNgay());
        DecimalFormat df = new DecimalFormat("#,##0.00" + "VND");
        System.out.println("Tong so luong hoa don theo thang va nam la:"+df.format(a.tinhTongThanhTien(12, 2015)));
    }
}