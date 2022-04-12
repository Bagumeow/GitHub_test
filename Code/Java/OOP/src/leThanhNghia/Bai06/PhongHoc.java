package leThanhNghia.Bai06;

public class PhongHoc {
    private String maPhong;
    private String dayNha;
    private double dienTich;
    private int soBongDen;

    public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
        setMaPhong(maPhong);
        setDayNha(dayNha);
        setDienTich(dienTich);
        setSoBongDen(soBongDen);
    }

    public PhongHoc() {
        this("KXD", "KXD", 0, 0);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((maPhong == null) ? 0 : maPhong.hashCode());
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
        PhongHoc other = (PhongHoc) obj;
        if (maPhong == null) {
            if (other.maPhong != null)
                return false;
        } else if (!maPhong.equals(other.maPhong))
            return false;
        return true;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        if (!maPhong.equals(""))
            this.maPhong = maPhong;
        else
            this.maPhong = "KXD";
    }

    public String getDayNha() {
        return dayNha;
    }

    public void setDayNha(String dayNha) {
        if (!dayNha.equals(""))
            this.dayNha = dayNha;
        else
            this.dayNha = "KXD";
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        if (dienTich >= 0)
            this.dienTich = dienTich;
        else
            this.dienTich = 0;
    }

    public int getSoBongDen() {
        return soBongDen;
    }

    public void setSoBongDen(int soBongDen) {
        if (soBongDen >= 0)
            this.soBongDen = soBongDen;
        else
            this.soBongDen = 0;
    }

    public boolean xetDatChuan() {
        if (dienTich - soBongDen * 10 > 0)
            return false;
        return true;
    }

    public static String getTieuDe() {
        return String.format("%-15s%-15s%-15s%-15s%-20s", "Ma Phong", "Day Nha", "Dien Tich(m^2)", "So bong den",
                "Chat Luong");
    }

    @Override
    public String toString() {
        String s = "";
        if (xetDatChuan())
            s = "Dat Chuan";
        else
            s = "Khong Dat Chuan";
        return String.format("%-15s%-15s%-15.0f%-15d%-20s", maPhong, dayNha, dienTich, soBongDen, s);
    }
}
