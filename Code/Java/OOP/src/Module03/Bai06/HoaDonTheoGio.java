package Module03.Bai06;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class HoaDonTheoGio extends HoaDonKhachSan {
    private int soGioThue;

    public HoaDonTheoGio(String maHoaDon, LocalDate ngayLap, String tenKhach, String maPhong, double donGia,
            int soGioThue) {
        super(maHoaDon, ngayLap, tenKhach, maPhong, donGia);
        setSoGioThue(soGioThue);
    }

    public HoaDonTheoGio() {
        super();
        this.soGioThue = 0;
    }

    public int getSoGioThue() {
        return soGioThue;
    }

    public void setSoGioThue(int soGioThue) {
        if (soGioThue >= 0)
            this.soGioThue = soGioThue;
        else
            this.soGioThue = 0;
    }

    @Override
    public double tinhThanhTien() throws Exception {
        int a=0;
        if (soGioThue >24 && soGioThue<30)
            a=24;
        else if(soGioThue>=30){
            throw new Exception("So gio thue >= 30!! Hay su dung hoa don Ngay!!");
        }
        else a= soGioThue;
        return a*getDonGia();
    }

    public static String getTieuDe() {
        return String.format("%s%-15s%-20s",HoaDonKhachSan.getTieuDe(),"So Gio Thue","Thanh tien");
    }
    
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00" + "VND");
        try {
            return String.format("%s%-15d%-20s", super.toString(),soGioThue,df.format(tinhThanhTien()));
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
