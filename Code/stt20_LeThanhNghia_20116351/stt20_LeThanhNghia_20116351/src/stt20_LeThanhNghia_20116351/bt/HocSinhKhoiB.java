package stt20_LeThanhNghia_20116351.bt;

import java.time.LocalDate;

public class HocSinhKhoiB extends HocSinh {
    private static char khoiThi = 'B';
    private float toan;
    private float sinh;
    private float hoa;

    public HocSinhKhoiB() throws Exception {
        super();
        this.toan = 0;
        this.sinh = 0;
        this.hoa = 0;
    }

    public HocSinhKhoiB(String sbd, String name, String address, int prioritized, LocalDate testDay, float toan,
            float sinh,
            float hoa) throws Exception {
        super(sbd, name, address, prioritized, testDay);
        setToan(toan);
        setLy(sinh);
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

    public float getSinh() {
        return sinh;
    }

    public void setLy(float sinh) {
        if (sinh >= 0 && sinh <= 10)
            this.sinh = sinh;
        else
            this.sinh = 0;
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
        return 1.0 * (toan + sinh + hoa) / 3;
    }

    @Override
    public String toString() {
        return String.format("%s|%-15s|%-15.2f|", super.toString(), khoiThi, getAvg());
    }
}
