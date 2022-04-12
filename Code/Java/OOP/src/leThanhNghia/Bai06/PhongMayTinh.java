package leThanhNghia.Bai06;

public class PhongMayTinh extends PhongHoc {
    private int mayTinh;

    public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int mayTinh) {
        super(maPhong, dayNha, dienTich, soBongDen);
        setMayTinh(mayTinh);
    }

    public PhongMayTinh() {
        super();
        this.mayTinh = 0;
    }

    public int getMayTinh() {
        return mayTinh;
    }

    public void setMayTinh(int mayTinh) {
        if (mayTinh >= 0)
            this.mayTinh = mayTinh;
        else
            this.mayTinh = 0;
    }
    @Override
    public boolean xetDatChuan() {
        if(super.xetDatChuan() && getDienTich()/mayTinh<=1.5)
            return true;
        return false;
    }

    public static String getTieuDe() {
        return String.format("%s%-15s", PhongHoc.getTieuDe(),"So may tinh");
    }
    @Override
    public String toString() {
        return String.format("%s%-15d",super.toString(),mayTinh);
    }
}
