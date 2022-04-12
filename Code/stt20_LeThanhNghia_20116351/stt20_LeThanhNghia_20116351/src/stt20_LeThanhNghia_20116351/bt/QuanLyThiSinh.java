package stt20_LeThanhNghia_20116351.bt;

import java.util.ArrayList;
import java.util.List;

public class QuanLyThiSinh {
    private List<HocSinh> hs;

    public QuanLyThiSinh() {
        hs = new ArrayList<HocSinh>();
    }

    public boolean themsv(HocSinh a) {
        if (hs.contains(a))
            return false;
        hs.add(a);
        return true;
    }

    @Override
    public String toString() {
        String s = HocSinh.getTieuDe() + "\n";
        for (HocSinh hocSinh : hs) {
            s += hocSinh + "\n";
        }
        return s;
    }

    public boolean xoasv(String masbd) {
        return hs.removeIf(hs1 -> hs1.getSbd().equalsIgnoreCase(masbd));
    }

    public HocSinh timHocSinh(String masbd) {
        for (HocSinh hocSinh : hs) {
            if (hocSinh.getSbd().equalsIgnoreCase(masbd))
                return hocSinh;
        }
        return null;
    }
}
