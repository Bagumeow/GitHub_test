package stt20_LeThanhNghia_20116351;

import java.text.DecimalFormat;


public class GiangVien extends NhanVien {
    private String trinhDo;
    private int soTietDay;

    public GiangVien(String maNV, float heSoLuong, float phuCap, String trinhDo, int soTietDay) {
        super(maNV, heSoLuong, phuCap);
        setTrinhDo(trinhDo);
        setSoTietDay(soTietDay);
    }

    public GiangVien() {
        super();
        this.trinhDo = "Unknown";
        this.soTietDay = 0;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        if (trinhDo.equals("CN") || trinhDo.equals("THS") || trinhDo.equals("TS"))
            this.trinhDo = trinhDo;
        else
            this.trinhDo = "Unknown";
    }

    public int getSoTietDay() {
        return soTietDay;
    }

    public void setSoTietDay(int soTietDay) {
        if (soTietDay > 0)
            this.soTietDay = soTietDay;
        else
            this.soTietDay = 0;
    }

    @Override
    public double tinhLuongNV() {
        return super.getHeSoLuong() * 1490 + super.getPhuCap() + soTietDay * 100;
    }

    public static String getTieuDe() {
        return String.format("%s%-15s%-15s%-20s", NhanVien.getTieuDe(), "Trinh do ", "So Tiet Day","Tien Luong");
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00" + "VND");
        return String.format("%s%-15s%-15d%-15s", super.toString(),trinhDo,soTietDay,df.format(tinhLuongNV()));
    }
}
