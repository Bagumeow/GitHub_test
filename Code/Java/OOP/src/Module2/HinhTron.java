package Module2;

public class HinhTron {
    private ToaDo tam;
    private double bankinh;

    public double tinhChuVi() {
        return 2 * 3.14 * bankinh;
    }

    public double tinhDienTich() {
        return bankinh * bankinh * Math.PI;
    }

    public HinhTron() {
        bankinh=0;
    }

    public HinhTron(ToaDo tam, double bankinh) {
        setTam(tam);
        setBankinh(bankinh);
    }

    public void setTam(ToaDo tam) {
        this.tam = tam;
    }

    public ToaDo getTam() {
        return tam;
    }

    public void setBankinh(double bankinh) {
        if (bankinh > 0)
            this.bankinh = bankinh;
        else
            this.bankinh = 0;
    }

    public double getBankinh() {
        return bankinh;
    }

    @Override
    public String toString() {
        return String.format("Diện tích và chu vi hình tròn bán kính tấm %s có bán kính %.2f là %.2f và %.2f.",
                tam.toString(), bankinh, tinhDienTich(), tinhChuVi());
    }
}
