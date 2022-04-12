package Module2;

public class ThongTinDangKiXe {
    private String chuxe;
    private String loaixe;
    private double trigia;
    private int cc;

    public ThongTinDangKiXe(String chuxe, String loaixe, double trigia, int cc) throws Exception {
        setChuxe(chuxe);
        setLoaixe(loaixe);
        setTrigia(trigia);
        setCc(cc);
    }

    public void setChuxe(String chuxe) throws Exception {
        if (chuxe.equals("")) {
            throw new Exception("Phai nhap ten chu xe!");
        } else {
            this.chuxe = chuxe;
        }

    }

    public String getChuxe() {
        return chuxe;
    }

    public void setLoaixe(String loaixe) throws Exception {
        if (loaixe.equals("")) {
            throw new Exception("Phai nhap ten loai xe!!");
        } else {
            this.loaixe = loaixe;
        }
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setTrigia(double trigia) throws Exception {
        if (trigia < 0) {
            throw new Exception("Tri gia phai > 0!!");
        } else {
            this.trigia = trigia;
        }
    }

    public double getTrigia() {
        return trigia;
    }

    public void setCc(int cc) throws Exception {
        if (cc < 0) {
            throw new Exception("Dung tich phai >0 !!");
        } else {
            this.cc = cc;
        }
    }

    public int getCc() {
        return cc;
    }

    public double tinhThue() {
        if (cc < 100) {
            return trigia * 1 / 100;
        }
        if (cc >= 100 && cc <= 200) {
            return trigia * 3 / 100;
        } else {
            return trigia * 5 / 100;
        }
    }

    public String toString() {
        return String.format("%-20s %-20s %-20d %-20.2f %-20.2f", chuxe, loaixe, cc, trigia, tinhThue());
    }
}
