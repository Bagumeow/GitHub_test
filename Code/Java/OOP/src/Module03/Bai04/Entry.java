package Module03.Bai04;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.List;

public class Entry {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00" + "VND");
        GiaoDich[] g = new GiaoDich[4];
        g[0] = new GiaoDichDat("1001", LocalDate.of(2013, 9, 12), 7000000, 20, 'C');
        g[1] = new GiaoDichNha("1002", LocalDate.of(2013, 9, 15), 10000000, 15, true, "Le Duc Tho,Go Vap");
        g[2] = new GiaoDichDat("1003", LocalDate.of(2021, 2, 14), 12500000, 15, 'A');
        g[3] = new GiaoDichNha("1004", LocalDate.of(2013, 9, 13), 8000000, 10, false, "Dao Duy Tu,Da Lat");
        DanhMucGiaoDichNhaDat a = new DanhMucGiaoDichNhaDat(100);
        a.them(g[0]);
        a.them(g[1]);
        a.them(g[2]);
        a.them(g[3]);
        System.out.println(a);
        System.out.println("Tinh tong so luong giao dich  Dat la:" + a.tinhTongSoLuongGDDat());
        System.out.println("Tinh tong so luong giao dich  Nha la:" + a.tinhTongSoLuongGDNha());
        System.out
                .println("Trung binh thanh tien cua giao dich Dat la:" + df.format(a.tinhTrungBinhThanhTienCuaGDDat()));
        List<GiaoDich> b = a.timGiaoDichthang9nam2013();
        System.out.println("Cac giao dich trong thang 9 nam 2013 la:");
        if (b.size() != 0) {
            for (GiaoDich giaoDich : b) {
                System.out.println(giaoDich);
            }
        } else
            System.out.println("Khong co giao dich nao trong thang 9 nam 2013");
    }
}
