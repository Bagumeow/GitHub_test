package Module03.Bai04;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class GiaoDichDat extends GiaoDich {
    private char loaiDat;

    public GiaoDichDat(String maGiaoDich, LocalDate ngayGiaoDich, float donGia, float dienTich, char loaiDat) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        setLoaiDat(loaiDat);
    }

    public GiaoDichDat() {
        super();
        this.loaiDat = '0';
    }

    public char getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(char loaiDat) {
        if (loaiDat == 'A' || loaiDat == 'B' || loaiDat == 'C')
            this.loaiDat = loaiDat;
        else
            this.loaiDat = '0';
    }

    @Override
    public double tinhThanhTien() {
        if (loaiDat == '0')
            return 0;
        else if (loaiDat == 'A')
            return getDienTich() * getDonGia() * 1.5;
        else
            return getDienTich() * getDonGia();
    }

    public static String getTieuDe() {
        return String.format("%s%-20s%-20s", GiaoDich.getTieuDe(), "Loaidat", "Thanh tien");
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00" + "VND");
        return String.format("%s%-20s%-20s", super.toString(), loaiDat, df.format(tinhThanhTien()));
    }
}
