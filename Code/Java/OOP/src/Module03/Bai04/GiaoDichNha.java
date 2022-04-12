package Module03.Bai04;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class GiaoDichNha extends GiaoDich {
    private boolean loaiNha;
    private String diaChi;

    public GiaoDichNha() {
        super();
        this.loaiNha = false;
        this.diaChi = "KXD";
    }

    public GiaoDichNha(String maGiaoDich, LocalDate ngayGiaoDich, float donGia, float dienTich, Boolean loaiNha,
            String diaChi) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        setLoaiNha(loaiNha);
        setDiaChi(diaChi);
    }

    public boolean getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(Boolean loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        if (!diaChi.equals(""))
            this.diaChi = diaChi;
        else
            this.diaChi = "KXD";
    }

    @Override
    public double tinhThanhTien() {
        if (loaiNha)
            return getDienTich() * getDonGia();
        else
            return getDienTich() * getDonGia() * 90 / 100;
    }

    public static String getTieuDe() {
        return String.format("%s%-20s%-20s%-20s", GiaoDich.getTieuDe(), "Loai nha", "Dia chi", "Thanh tien");
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00" + "VND");
        String s = "";
        if (loaiNha)
            s = "Moi";
        else
            s = "Cu";
        return String.format("%s%-20s%-20s%-20s", super.toString(), s, diaChi, df.format(tinhThanhTien()));
    }

}
