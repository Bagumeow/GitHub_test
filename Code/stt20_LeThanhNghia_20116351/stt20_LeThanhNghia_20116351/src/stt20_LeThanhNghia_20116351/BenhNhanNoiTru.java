package stt20_LeThanhNghia_20116351;

import java.text.DecimalFormat;

public class BenhNhanNoiTru extends BenhNhan {
    private int soNgayNam;

    public BenhNhanNoiTru(String maBN, String hoTen, double tienKham, int soNgayNam) {
        super(maBN, hoTen, tienKham);
        setSoNgayNam(soNgayNam);
    }

    public BenhNhanNoiTru() {
        super();
        this.soNgayNam = 0;
    }

    public int getSoNgayNam() {
        return soNgayNam;
    }

    public void setSoNgayNam(int soNgayNam) {
        if (soNgayNam >= 0)
            this.soNgayNam = soNgayNam;
        else
            this.soNgayNam = 0;
    }

    @Override
    public double tinhChiPhiKham() {
        return soNgayNam * 150000 + getTienKham();
    }

    public static String getTieuDe() {
        return String.format("%s%-17s%-20s", BenhNhan.getTieuDe(), "So ngay nam", "Chi phi kham");
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00" + "VND");
        return String.format("%s%-17s%-20s", super.toString(), soNgayNam, df.format(tinhChiPhiKham()));
    }
}
