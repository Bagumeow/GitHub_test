package Module03.Bai03;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.List;

public class Entry {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00" + "VND");
        DanhMucGiaoDich a = new DanhMucGiaoDich(100);
        a.them(new GiaoDichVang("1001", LocalDate.of(2021, 7, 14), 60000000, 12, "9999"));
        a.them(new GiaoDichTien("1002", LocalDate.of(2021, 4, 24), 100000, 50, 0, "VN"));
        a.them(new GiaoDichTien("1003", LocalDate.of(2020, 2, 21), 1000, 50000, (float) 22.737, "USD"));
        a.them(new GiaoDichTien("1004", LocalDate.of(2021, 12, 21), 1000, 17000, (float) 26.429, "EUR"));
        a.them(new GiaoDichVang("0105", LocalDate.of(2021, 1, 12), 54000000, 245, "SCJ"));
        System.out.println(a);
        System.out.println("Tinh tong so luong giao dich  vang la:" + a.tinhTongSoLuongGDVang());
        System.out.println("Tinh tong so luong giao dich  Tien la:" + a.tinhTongSoLuongGDTien());
        System.out
                .println("Trung binh thanh tien cua giao dich Tien la:" + df.format(a.tinhTrungBinhThanhTienCuaGDT()));
        List<GiaoDich> kq = a.timGiaoDichTren1Ty();
        System.out.println("Giao dich tren 1 ty la :");
        if (kq.size() != 0) {
            for (GiaoDich giaoDich : kq) {
                System.out.println(giaoDich);
            }
        } else {
            System.out.println("Khong co giao dich tren 1 ty!!");
        }
    }
}
