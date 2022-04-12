package stt20_LeThanhNghia_20116351.bt;

import java.time.LocalDate;

public class HocSinhKhoiC extends HocSinh {
    private static char khoiThi = 'C';
    private float van;
    private float su;
    private float dia;

    public HocSinhKhoiC() throws Exception {
        super();
        this.van = 0;
        this.su = 0;
        this.dia = 0;
    }

    public HocSinhKhoiC(String sbd, String name, String address, int prioritized, LocalDate testDay, float van,
            float su,
            float dia) throws Exception {
        super(sbd, name, address, prioritized, testDay);
        setVan(van);
        setSu(su);
        setDia(dia);
    }

    public float getVan() {
        return van;
    }

    public static char getKhoiThi() {
        return khoiThi;
    }

    public void setVan(float van) {
        if (van >= 0 && van <= 10)
            this.van = van;
        else
            this.van = 0;
    }

    public float getSu() {
        return su;
    }

    public void setSu(float su) {
        if (su >= 0 && su <= 10)
            this.su = su;
        else
            this.su = 0;
    }

    public float getDia() {
        return dia;
    }

    public void setDia(float dia) {
        if (dia >= 0 && dia <= 10)
            this.dia = dia;
        else
            this.dia = 0;
    }

    @Override
    public double getAvg() {
        return 1.0 * (van + su + dia) / 3;
    }

    @Override
    public String toString() {
        return String.format("%s|%-15s|%-15.2f|", super.toString(), khoiThi, getAvg());
    }

}
