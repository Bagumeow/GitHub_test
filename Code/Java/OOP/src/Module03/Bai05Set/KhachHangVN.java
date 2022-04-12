package Module03.Bai05Set;

import java.text.DecimalFormat;
import java.time.LocalDate;


public class KhachHangVN extends HoaDon {
    private String doituong;
    private int dinhMuc;

    public KhachHangVN(String maKhachHang, String hoTen, LocalDate ngayLap, int soKW, float donGia, String doituong,
            int dinhMuc) {
        super(maKhachHang, hoTen, ngayLap, soKW, donGia);
        this.doituong = doituong;
        this.dinhMuc = dinhMuc;
    }

    public KhachHangVN() {
        super();
        this.doituong = "KXD";
        this.dinhMuc = 0;
    }

    public String getDoituong() {
        return doituong;
    }

    public void setDoituong(String doituong) {
        if (!doituong.equals(""))
            this.doituong = doituong;
        else
            this.doituong = "KXD";
    }

    public int getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(int dinhMuc) {
        if (dinhMuc >= 0)
            this.dinhMuc = dinhMuc;
        else
            this.dinhMuc = 0;
    }

    @Override
    public double tinhGiaThanh() {
        if (getSoKW() <= dinhMuc)
            return getSoKW() * getDonGia();
        else
            return (getSoKW() * getDonGia() * dinhMuc) + ((getSoKW() - dinhMuc) * getDonGia() * 2.5);
    }
    public static String getTieuDe() {
        return String.format("%s%-20s%-20s%-20s",HoaDon.getTieuDe(),"Doi Tuong", "Quoc tich", "Thanh Tien");
    }
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00" + "VND");
        return String.format("%s%-20s%-20s%-20s", super.toString(),doituong, dinhMuc,
                df.format(tinhGiaThanh()));
    }
}
