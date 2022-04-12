package Module03.Bai05Set;

import java.text.DecimalFormat;
import java.time.LocalDate;


public class KhachHangNN extends HoaDon {
    private String quocTich;

    public KhachHangNN(String maKhachHang, String hoTen, LocalDate ngayLap, int soKW, float donGia, String quocTich) {
        super(maKhachHang, hoTen, ngayLap, soKW, donGia);
        this.quocTich = quocTich;
    }

    public KhachHangNN() {
        super();
        this.quocTich = "KXD";
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        if (!quocTich.equals(""))
            this.quocTich = quocTich;
        else
            this.quocTich = "KXD";
    }

    @Override
    public double tinhGiaThanh() {
        return getSoKW() * getDonGia();
    }

    public static String getTieuDe() {
        return String.format("%s%-20s%-20s", HoaDon.getTieuDe(), "Quoc tich", "Thanh Tien");
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00" + "VND");
        return String.format("%s%-20s%-20s", super.toString(), quocTich, df.format(tinhGiaThanh()));
    }
}
