package Module04.Bai06;

public class PhongHocLyThuyet extends PhongHoc {
    private boolean mayChieu;

    public PhongHocLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean mayChieu) {
        super(maPhong, dayNha, dienTich, soBongDen);
        setMayChieu(mayChieu);
    }

    public PhongHocLyThuyet() {
        super();
        this.mayChieu = false;
    }

    public boolean isMayChieu() {
        return mayChieu;
    }

    public void setMayChieu(boolean mayChieu) {
        this.mayChieu = mayChieu;
    }
    
    @Override
    public boolean xetDatChuan() {
        if(super.xetDatChuan() && mayChieu)
            return true;
        return false;
    }
    public static String getTieuDe() {
        return String.format("%s%-10s", PhongHoc.getTieuDe(),"May Chieu");
    }
    @Override
    public String toString() {
        String s="";
        if (mayChieu)
            s="Co";
        else
            s="Khong";
        return String.format("%s%-10s", super.toString(),s);
    }
}
