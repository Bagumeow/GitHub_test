package stt20_LeThanhNghia_20116351;

public abstract class NhanVien {
    private String maNV;
    private float heSoLuong;
    private float phuCap;

    public NhanVien(String maNV, float heSoLuong, float phuCap) {
        setMaNV(maNV);
        setHeSoLuong(heSoLuong);
        setPhuCap(phuCap);
    }

    public NhanVien() {
        this("Unkown", 0, 0);
    }

    public String getMaNV() {
        return maNV;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((maNV == null) ? 0 : maNV.hashCode());
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
        NhanVien other = (NhanVien) obj;
        if (maNV == null) {
            if (other.maNV != null)
                return false;
        } else if (!maNV.equals(other.maNV))
            return false;
        return true;
    }

    public void setMaNV(String maNV) {
        if (!maNV.equals(""))
            this.maNV = maNV;
        else
            this.maNV = "Unknown";
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        if (heSoLuong >= 2.34 && heSoLuong <=4.99)
            this.heSoLuong = heSoLuong;
        else
            this.heSoLuong = (float)2.34;
    }

    public float getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(float phuCap) {
        if (phuCap > 0)
            this.phuCap = phuCap;
        else
            this.phuCap=0;
    }

    public abstract double tinhLuongNV();

    public static String getTieuDe() {
        return String.format("%-15s%-20s%-20s", "Ma nhan vien", "He so luong", "Phu Cap");
    }

    @Override
    public String toString() {
        return String.format("%-15s%-20.2f%-20.2f", maNV,heSoLuong,phuCap);
    }
}
