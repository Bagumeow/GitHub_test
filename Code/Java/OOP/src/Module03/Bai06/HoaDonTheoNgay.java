package Module03.Bai06;

import java.text.DecimalFormat;
import java.time.LocalDate;


public class HoaDonTheoNgay extends HoaDonKhachSan {
    private int soNgayThue;

    public HoaDonTheoNgay(String maHoaDon, LocalDate ngayLap, String tenKhach, String maPhong, double donGia,
            int soNgayThue) {
        super(maHoaDon, ngayLap, tenKhach, maPhong, donGia);
        setSoNgayThue(soNgayThue);
    }

    public HoaDonTheoNgay() {
        super();
        this.soNgayThue = 0;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        if (soNgayThue >= 0)
            this.soNgayThue = soNgayThue;
        else
            this.soNgayThue = 0;
    }

    @Override
    public double tinhThanhTien() {
        if (soNgayThue<=7)
            return soNgayThue*getDonGia();
        else{
            int a=soNgayThue-7;
            return 7*getDonGia()+(a*getDonGia()*80/100);
        }
    }
    public static String getTieuDe() {
        return String.format("%s%-15s%-20s",HoaDonKhachSan.getTieuDe(),"So Ngay Thue","Thanh tien");
    }
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00" + "VND");
        return String.format("%s%-15d%-20s", super.toString(),soNgayThue,df.format(tinhThanhTien()));
    }
}
