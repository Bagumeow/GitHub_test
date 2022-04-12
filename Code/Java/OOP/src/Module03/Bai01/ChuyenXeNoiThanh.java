package Module03.Bai01;

public class ChuyenXeNoiThanh extends ChuyenXe {
    private int soTuyen;
    private float soKm;

    public ChuyenXeNoiThanh() {
        super();
        this.soTuyen = 0;
        this.soKm = 0;
    }

    public ChuyenXeNoiThanh(String maSo, String hoTen, String soXe, float doanhThu, int soTuyen, float soKm) {
        super(maSo, hoTen, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        if (soTuyen >= 0)
            this.soTuyen = soTuyen;
        else
            this.soTuyen = 0;
    }

    public float getSoKm() {
        return soKm;
    }

    public void setSoKm(float soKm) {
        if (soKm >= 0)
            this.soKm = soKm;
        else
            this.soKm = 0;
    }

    @Override
    public String toString() {
        return String.format("Chuyen xe noi thanh [%s SoKm= %d , SoTuyen= %f]", super.toString(), soTuyen, soKm);
    }

}
