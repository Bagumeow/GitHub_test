package Module2;

public class DiemSinhVien {
    private int masv;
    private String hoten;
    private float lt, th;

    public DiemSinhVien() {
        masv=0;
        hoten="chua biet";
        lt=0;
        th=0;
    }

    public DiemSinhVien(int masv, String hoten, float lt, float th) throws Exception {
        setMasv(masv);
        setHoten(hoten);
        setLt(lt);
        setTh(th);
    }

    public void setMasv(int masv) {
        if (masv < 0) {
            masv = 0;
        } else {
            this.masv = masv;
        }
    }

    public int getMasv() {
        return masv;
    }

    public void setHoten(String hoten) throws Exception {
        if (hoten.equals("")) {
            throw new Exception("Phai Nhap ten ");
        } else {
            this.hoten = hoten;
        }
    }

    public String getHoten() {
        return hoten;
    }

    public void setLt(float lt) {
        if (lt < 0 || lt > 10) {
            lt = 0;
        } else {
            this.lt = lt;
        }
    }

    public float getLt() {
        return lt;
    }

    public void setTh(float th) {
        if (th < 0 || th > 10) {
            th = 0;
        } else {
            this.th = th;
        }
    }

    public float tinhDTB() {
        return (lt + th) / 2;
    }

    public String toString() {
        return String.format("%-10d %-30s %-10.2f %-10.2f %-10.2f", this.masv, this.hoten, this.lt, this.th, tinhDTB());
    }

}
