package stt20_LeThanhNghia_20116351;

import java.text.DecimalFormat;

public abstract class BenhNhan {
    private String maBN;
    private String hoTen;
    private double tienKham;

    public BenhNhan(String maBN, String hoTen, double tienKham) {
        setMaBN(maBN);
        setHoTen(hoTen);
        setTienKham(tienKham);
    }

    public BenhNhan() {
        this("Unknown", "Unknown", 0);
    }

    public String getMaBN() {
        return maBN;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((maBN == null) ? 0 : maBN.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BenhNhan other = (BenhNhan) obj;
        if (maBN == null) {
            if (other.maBN != null)
                return false;
        } else if (!maBN.equals(other.maBN))
            return false;
        return true;
    }

    public void setMaBN(String maBN) {
        if (!maBN.equals(""))
            this.maBN = maBN;
        else
            this.maBN = "Unknown";
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        if (!hoTen.equals(""))
            this.hoTen = hoTen;
        else
            this.hoTen = "Unknown";
    }

    public double getTienKham() {
        return tienKham;
    }

    public void setTienKham(double tienKham) {
        if (tienKham >= 0)
            this.tienKham = tienKham;
        else
            this.tienKham = 0;
    }

    public abstract double tinhChiPhiKham();

    public static String getTieuDe() {
        return String.format("%-15s%-23s%-20s", "Ma benh nhan", "Ho ten", "Tien kham");
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00" + " VND");
        return String.format("%-15s%-23s%-20s", maBN, hoTen, df.format(tienKham));
    }
}
