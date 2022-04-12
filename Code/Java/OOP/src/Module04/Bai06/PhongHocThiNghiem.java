package Module04.Bai06;

public class PhongHocThiNghiem extends PhongHoc {
    private String chuyenNganh;
    private int sucChua;
    private boolean bonRua;

    public PhongHocThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh,
            int sucChua, boolean bonRua) {
        super(maPhong, dayNha, dienTich, soBongDen);
        setChuyenNganh(chuyenNganh);
        setSucChua(sucChua);
        setBonRua(bonRua);
    }

    public PhongHocThiNghiem() {
        super();
        this.chuyenNganh = "KXD";
        this.sucChua = 0;
        this.bonRua = false;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        if (!chuyenNganh.equals(""))
            this.chuyenNganh = chuyenNganh;
        else
            this.chuyenNganh = "KXD";
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        if (sucChua >= 0)
            this.sucChua = sucChua;
        else
            this.sucChua = 0;
    }

    public boolean isBonRua() {
        return bonRua;
    }

    public void setBonRua(boolean bonRua) {
        this.bonRua = bonRua;
    }

    @Override
    public boolean xetDatChuan() {
        if (super.xetDatChuan() && bonRua)
            return true;
        return false;
    }

    public static String getTieuDe() {
        return String.format("%s%-15s%-10s%-15s", PhongHoc.getTieuDe(), "Chuyen Nganh", "Suc chua", "Bon rua");
    }

    @Override
    public String toString() {
        String s="";
        if(bonRua)
            s="Co";
        else
            s="Khong";
        return String.format("%s%-15s%-10d%-15s", super.toString(),chuyenNganh,sucChua,s);
    }
}
