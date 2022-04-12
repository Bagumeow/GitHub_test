package Module03.Bai03;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GiaoDich {
    private String maGiaoDich;
    private LocalDate ngayGiaoDich;
    private float donGia;
    private int soLuong;

    public GiaoDich() {
        this("KXD", LocalDate.now(), 0, 0);
    }

    public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, float donGia, int soLuong) {
        setMaGiaoDich(maGiaoDich);
        setNgayGiaoDich(ngayGiaoDich);
        setDonGia(donGia);
        setSoLuong(soLuong);
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        if (!maGiaoDich.equals(""))
            this.maGiaoDich = maGiaoDich;
        else
            this.maGiaoDich = "KXD";
    }

    public LocalDate getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
        if (ngayGiaoDich.isBefore(LocalDate.now()))
            this.ngayGiaoDich = ngayGiaoDich;
        else
            this.ngayGiaoDich = LocalDate.now();
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

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if (soLuong >= 0)
            this.soLuong = soLuong;
        else
            this.soLuong = 0;
    }

    public double tinhThanhTien() {
        return soLuong * donGia;
    }

    public static String getTieuDe() {
        return String.format("%-17s%-20s%-25s%-10s", "Ma giao dich", "Ngay Giao Dich", "Don Gia", "SoLuong");
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,##0.00" + "VND");
        return String.format("%-17s%-20s%-25s%-10d", maGiaoDich, dtf.format(ngayGiaoDich), df.format(donGia), soLuong);
    }

}
