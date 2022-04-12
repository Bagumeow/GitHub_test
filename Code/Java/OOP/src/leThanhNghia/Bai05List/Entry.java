package leThanhNghia.Bai05List;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class Entry {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00" + "VND");
        HoaDon[] h = new HoaDon[4];
        h[0] = new KhachHangVN("1001", "Le Van Oai", LocalDate.of(2018, 9, 2), 90, 1734, "Kinh Doanh", 100);
        h[1] = new KhachHangNN("10A1", "Lee Sin", LocalDate.of(2018, 9, 30), 40, 1678, "Han Quoc");
        h[2] = new KhachHangNN("10B4", "Peter Parker", LocalDate.of(2011, 9, 2), 230, 2536, "Anh");
        h[3] = new KhachHangVN("1002", "Dam Ngoc Linh", LocalDate.of(2021, 5, 21), 130, 2014, "Sinh Hoat", 100);
        DanhMucHoaDon a = new DanhMucHoaDon();
        a.them(h[0]);
        a.them(h[1]);
        a.them(h[2]);
        a.them(h[3]);
        System.out.println(a);
        System.out.println("Tong hoa don cua khach hang Viet Nam la:" + a.tinhTongHoaDonVN());
        System.out.println("Tong hoa don cua khach hang Nuoc ngoai la:" + a.tinhTongHoaDonNN());
        System.out.println("Trung binh thanh tien hoa don cua khach hang Nuoc Ngoai la:"
                + df.format(a.tinhTrungBinhThanhTienNN()));
        System.out.println("Danh sach hoa don trong thang 9 nam 2018 la:");
        DanhMucHoaDon d = a.timHoaDonTrongThang9nam2018();
        if (d.getSize() != 0) {
            System.out.println(d);
        } else
            System.out.println("Khong co hoa don trong thang 9 nam 2018");
    }
}
