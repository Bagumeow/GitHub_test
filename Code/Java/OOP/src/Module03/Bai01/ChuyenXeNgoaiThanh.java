package Module03.Bai01;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgayDiDuoc;

    public ChuyenXeNgoaiThanh() {
        super();
        this.noiDen = "KXD";
        this.soNgayDiDuoc = 0;
    }

    public ChuyenXeNgoaiThanh(String maSo, String hoTen, String soXe, float doanhThu, String noiDen, int soNgayDiDuoc) {
        super(maSo, hoTen, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        if (!noiDen.equals(""))
            this.noiDen = noiDen;
        else
            this.noiDen = "KXD";
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        if (soNgayDiDuoc >= 0)
            this.soNgayDiDuoc = soNgayDiDuoc;
        else
            this.soNgayDiDuoc = 0;
    }

    @Override
    public String toString() {
        return String.format("Chuyen xe ngoai thanh [%s Noi den= %s , SoNgayDiDuoc = %d]", super.toString(), noiDen,
                soNgayDiDuoc);
    }

}
