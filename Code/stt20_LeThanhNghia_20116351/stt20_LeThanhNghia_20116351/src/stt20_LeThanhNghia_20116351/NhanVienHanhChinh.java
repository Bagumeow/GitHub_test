package stt20_LeThanhNghia_20116351;

import java.text.DecimalFormat;

public class NhanVienHanhChinh extends NhanVien {
    private int soNgayNghi;

    public NhanVienHanhChinh(String maNV, float heSoLuong, float phuCap, int soNgayNghi) {
        super(maNV, heSoLuong, phuCap);
        setSoNgayNghi(soNgayNghi);
    }

    public NhanVienHanhChinh() {
        super();
        this.soNgayNghi = 0;
    }

    public int getSoNgayNghi() {
        return soNgayNghi;
    }

    public void setSoNgayNghi(int soNgayNghi) {
        if (soNgayNghi > 0)
            this.soNgayNghi = soNgayNghi;
        else
            this.soNgayNghi = 0;
    }

    @Override
    public double tinhLuongNV() {
        return super.getHeSoLuong() * 1490 + super.getPhuCap() - soNgayNghi * 200;
    }

    public static String getTieuDe() {
        return String.format("%s%-15s%-20s", NhanVien.getTieuDe(), "So ngay nghi","Tien Luong");
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00" + "VND");
        return String.format("%s%-15d%-20s", super.toString(),soNgayNghi,df.format(tinhLuongNV()));
    }
}
