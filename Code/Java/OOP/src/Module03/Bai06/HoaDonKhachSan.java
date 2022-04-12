package Module03.Bai06;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class HoaDonKhachSan {
    private String maHoaDon;
    private LocalDate ngayLap;
    private String tenKhach;
    private String maPhong;
    private double donGia;

    public HoaDonKhachSan(String maHoaDon, LocalDate ngayLap, String tenKhach, String maPhong, double donGia) {
        setMaHoaDon(maHoaDon);
        setNgayLap(ngayLap);
        setTenKhach(tenKhach);
        setMaPhong(maPhong);
        setDonGia(donGia);
    }

    public HoaDonKhachSan() {
        this("KXD", LocalDate.now(), "KXD", "KXD", 0);
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        if (!maHoaDon.equals(""))
            this.maHoaDon = maHoaDon;
        else
            this.maHoaDon = "KXD";
    }

    public LocalDate getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(LocalDate ngayLap) {
        if (ngayLap.isBefore(LocalDate.now()))
            this.ngayLap = ngayLap;
        else
            this.ngayLap = LocalDate.now();
    }

    public String getTenKhach() {
        return tenKhach;
    }

    public void setTenKhach(String tenKhach) {
        if (!tenKhach.equals(""))
            this.tenKhach = tenKhach;
        else
            this.tenKhach = "KXD";
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        if (!maPhong.equals(""))
            this.maPhong = maPhong;
        else
            this.maPhong = "KXD";
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia >= 0)
            this.donGia = donGia;
        else
            this.donGia = 0;
    }

    public static String getTieuDe() {
        return String.format("%-15s%-15s%-20s%-15s%-20s", "Ma hoa don", "Ngay lap", "Ten Khach", "Ma Phong", "Don gia");
    }
    public abstract double tinhThanhTien() throws Exception;
    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,##0.00" + "VND");
        return String.format("%-15s%-15s%-20s%-15s%-20s", maHoaDon, dtf.format(ngayLap), tenKhach, maHoaDon,
                df.format(donGia));
    }
}
