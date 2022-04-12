package Module03.Bai04;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class GiaoDich {
    private String maGiaoDich;
    private LocalDate ngayGiaoDich;
    private float donGia;
    private float dienTich;

    public GiaoDich() {
        this("KXD", LocalDate.now(), 0, 0);
    }

    public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, float donGia, float dienTich) {
        setMaGiaoDich(maGiaoDich);
        setNgayGiaoDich(ngayGiaoDich);
        setDonGia(donGia);
        setDienTich(dienTich);
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
            this.dienTich = 0;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        if (dienTich >= 0)
            this.dienTich = dienTich;
        else
            this.dienTich = 0;
    }

    public abstract double tinhThanhTien();

    public static String getTieuDe() {
        return String.format("%-17s%-20s%-25s%-20s", "Ma giao dich", "Ngay Giao Dich", "Don Gia", "dientich");
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,##0.00" + "VND");
        return String.format("%-17s%-20s%-25s%-20.2f", maGiaoDich, dtf.format(ngayGiaoDich), df.format(donGia),
                dienTich);
    }

}
