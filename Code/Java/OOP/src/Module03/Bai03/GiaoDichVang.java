package Module03.Bai03;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class GiaoDichVang extends GiaoDich {
    private String loaiVang;

    public GiaoDichVang(String maGiaoDich, LocalDate ngayGiaoDich, float donGia, int soLuong, String loaiVang) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        setLoaiVang(loaiVang);
    }

    public GiaoDichVang() {
        super();
        this.loaiVang = "KXD";
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        if (!loaiVang.equals(""))
            this.loaiVang = loaiVang;
        else
            this.loaiVang = "KXD";
    }

    @Override
    public double tinhThanhTien() {
        return super.tinhThanhTien();
    }

    public static String getTieuDe() {
        return String.format("%s%-20s%-20s", GiaoDich.getTieuDe(), "LoaiVang", "Thanh Tien");
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00" + "VND");
        return String.format("%s%-20s%-20s", super.toString(), loaiVang, df.format(tinhThanhTien()));
    }

}
