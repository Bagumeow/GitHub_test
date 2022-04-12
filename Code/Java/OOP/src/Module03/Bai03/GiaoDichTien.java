package Module03.Bai03;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class GiaoDichTien extends GiaoDich {
    private float tiGia;
    private String loaiTien;

    public GiaoDichTien(String maGiaoDich, LocalDate ngayGiaoDich, float donGia, int soLuong, float tiGia,
            String loaiTien) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        setLoaiTien(loaiTien);
        setTiGia(tiGia);
    }

    public GiaoDichTien() {
        super();
        this.tiGia = 0;
        this.loaiTien = "KXD";
    }

    public float getTiGia() {
        return tiGia;
    }

    public void setTiGia(float tiGia) {
        if (tiGia >= 0)
            this.tiGia = tiGia;
        else
            this.tiGia = 0;
    }

    public String getLoaiTien() {
        return loaiTien;
    }

    public void setLoaiTien(String loaiTien) {
        if (!loaiTien.equals(""))
            this.loaiTien = loaiTien;
        else
            this.loaiTien = "KXD";
    }

    @Override
    public double tinhThanhTien() {
        if (!loaiTien.equals("VN"))
            return super.tinhThanhTien() * tiGia;
        else
            return super.tinhThanhTien();
    }

    public static String getTieuDe() {
        return String.format("%s%-20s%-20s", GiaoDich.getTieuDe(), "Loai Tien", "Thanh tien");
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00" + "VND");
        return String.format("%s%-20s%-20s", super.toString(), loaiTien, df.format(tinhThanhTien()));
    }
}
