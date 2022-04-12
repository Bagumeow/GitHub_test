package Module03.Bai01;

import java.text.DecimalFormat;


public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00" + "VND");
        ChuyenXe[] ds = new ChuyenXe[3];
        ds[0] = new ChuyenXeNoiThanh("1", "Le van An", "113", 200000, 24, 100);
        ds[1] = new ChuyenXeNgoaiThanh("2", "Bui van B", "114", 100000, "SaiGon", 3);
        ds[2] = new ChuyenXeNoiThanh("3", "Nam ba", "153", 350000, 24, 100);
        xuatThongTinChuyenXe(ds);
        System.out.println("Tong doanh thu cac chuyen xe =" + df.format(tinhTongDoanhThu(ds)));
        System.out.println("Tong doanh thu cua chuyen xe noi thanh="+df.format(tinhTongDoanhThuCXNoiThanh(ds)));
        System.out.println("Tong doanh thu cua chuyen xe ngoai thanh="+df.format(tinhTongDoanhThuCXNgoaiThanh(ds)));
    }

    public static double tinhTongDoanhThu(ChuyenXe[] a) {
        double s = 0;
        for (int i = 0; i < a.length; i++) {
            s += a[i].getDoanhThu();
        }
        return s;
    }

    public static double tinhTongDoanhThuCXNoiThanh(ChuyenXe[] a) {
        double s = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] instanceof ChuyenXeNoiThanh)
                s += a[i].getDoanhThu();
        }
        return s;
    }

    public static double tinhTongDoanhThuCXNgoaiThanh(ChuyenXe[] a) {
        double s = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] instanceof ChuyenXeNgoaiThanh)
                s += a[i].getDoanhThu();
        }
        return s;
    }

    public static void xuatThongTinChuyenXe(ChuyenXe[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}