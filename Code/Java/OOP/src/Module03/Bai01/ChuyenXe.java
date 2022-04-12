package Module03.Bai01;

import java.text.DecimalFormat;

public class ChuyenXe {
    private String maSo;
    private String hoTen;
    private String soXe;
    private float doanhThu;

    public ChuyenXe() {
        this("KXD", "KXD", "KXD", 0);
    }

    public ChuyenXe(String maSo, String hoTen, String soXe, float doanhThu) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        if (!maSo.equals(""))
            this.maSo = maSo;
        else
            this.maSo = "KXD";
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        if (!hoTen.equals(""))
            this.hoTen = hoTen;
        else
            this.hoTen = "KXD";
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        if (!soXe.equals(""))
            this.soXe = soXe;
        else
            this.soXe = "KXD";
    }

    public float getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(float doanhThu) {
        if (doanhThu >= 0)
            this.doanhThu = doanhThu;
        else
            this.doanhThu = 0;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00"+"VND");
        return String.format("MaSo: %s HoTen: %s Soxe: %s DoanhThu: %s", maSo, hoTen, soXe,df.format(doanhThu));
    }
}
