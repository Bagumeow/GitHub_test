package stt20_LeThanhNghia_20116351.bt;

import java.time.LocalDate;

public class HocSinhKhoiA extends HocSinh {
    private static char khoiThi = 'A';
    private float toan;
    private float ly;
    private float hoa;

    public HocSinhKhoiA() throws Exception {
        super();
        this.toan = 0;
        this.ly = 0;
        this.hoa = 0;
    }

    public HocSinhKhoiA(String sbd, String name, String address, int prioritized, LocalDate testDay, float toan,
            float ly,
            float hoa) throws Exception {
        super(sbd, name, address, prioritized, testDay);
        setToan(toan);
        setLy(ly);
        setHoa(hoa);
    }

    public static char getKhoiThi() {
        return khoiThi;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        if (toan >= 0 && toan <= 10)
            this.toan = toan;
        else
            this.toan = 0;
    }

    public float getLy() {
        return ly;
    }

    public void setLy(float ly) {
        if (ly >= 0 && toan <= 10)
            this.ly = ly;
        else
            this.ly = 0;
    }

    public float getHoa() {
        return hoa;
    }

    public void setHoa(float hoa) {
        if (hoa >= 0 && hoa <= 10)
            this.hoa = hoa;
        else
            this.hoa = 0;
    }

    @Override
    public double getAvg() {
        return 1.0 * (toan + ly + hoa) / 3;
    }

    @Override
    public String toString() {
        String s = String.format("%s|%-15s|%-15.2f|", super.toString(), khoiThi, getAvg());
        return s;
    }

}
