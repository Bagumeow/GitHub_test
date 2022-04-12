package leThanhNghia.Bai05List;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class HoaDon {
    private String maKhachHang;
    private String hoTen;
    private LocalDate ngayLap;
    private int soKW;
    private float donGia;

    public HoaDon(String maKhachHang, String hoTen, LocalDate ngayLap, int soKW, float donGia) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.ngayLap = ngayLap;
        this.soKW = soKW;
        this.donGia = donGia;
    }

    public HoaDon() {
        this("KXD", "KXD", LocalDate.now(), 0, 0);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((maKhachHang == null) ? 0 : maKhachHang.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        HoaDon other = (HoaDon) obj;
        if (maKhachHang == null) {
            if (other.maKhachHang != null)
                return false;
        } else if (!maKhachHang.equals(other.maKhachHang))
            return false;
        return true;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        if (!maKhachHang.equals(""))
            this.maKhachHang = maKhachHang;
        else
            this.maKhachHang = "KXD";
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        if (!hoTen.equals(""))
            this.hoTen = hoTen;
        else
            this.hoTen = "KXD";
    }

    public LocalDate getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(LocalDate ngayLap) {
        if (ngayLap.isAfter(LocalDate.now()))
            this.ngayLap = ngayLap;
        else
            this.ngayLap = LocalDate.now();
    }

    public int getSoKW() {
        return soKW;
    }

    public void setSoKW(int soKW) {
        if (soKW >= 0)
            this.soKW = soKW;
        else
            this.soKW = 0;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        if (donGia >= 0)
            this.donGia = donGia;
        else
            this.donGia = 0;
    }

    public abstract double tinhGiaThanh();

    public static String getTieuDe() {
        return String.format("%-17s%-20s%-15s%-10s%-15s", "Ma khach hang", "Ho ten", "Ngay lap HD", "SoKW", "Don Gia");
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,##0.00" + "VND");
        return String.format("%-17s%-20s%-15s%-10d%-15s", maKhachHang, hoTen, dtf.format(ngayLap), soKW,
                df.format(donGia));
    }
}
