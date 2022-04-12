package Module03.Bai05List;

import java.util.ArrayList;
import java.util.List;

public class DanhMucHoaDon {
    private List<HoaDon> hd;

    public DanhMucHoaDon() {
        hd = new ArrayList<HoaDon>();
    }

    public boolean them(HoaDon a) {
        if (hd.contains(a))
            return false;
        hd.add(a);
        return true;
    }

    @Override
    public String toString() {
        String s = KhachHangNN.getTieuDe() + "\n";
        for (HoaDon hoaDon : hd) {
            if (hoaDon instanceof KhachHangNN)
                s += hoaDon + "\n";
        }
        s += KhachHangVN.getTieuDe() + "\n";
        for (HoaDon hoaDon : hd) {
            if (hoaDon instanceof KhachHangVN)
                s += hoaDon + "\n";
        }
        return s;
    }

    public int getSize() {
        return hd.size();
    }

    public int tinhTongHoaDonVN() {
        int s = 0;
        for (int i = 0; i < hd.size(); i++) {
            if (hd.get(i) instanceof KhachHangVN)
                s += 1;
        }
        return s;
    }

    public int tinhTongHoaDonNN() {
        int s = 0;
        for (int i = 0; i < hd.size(); i++) {
            if (hd.get(i) instanceof KhachHangNN)
                s += 1;
        }
        return s;
    }

    public double tinhTrungBinhThanhTienNN() {
        double s = 0;
        int count = 0;
        for (int i = 0; i < hd.size(); i++) {
            if (hd.get(i) instanceof KhachHangNN) {
                s += hd.get(i).tinhGiaThanh();
                count += 1;
            }
        }
        return s / count;
    }

    public DanhMucHoaDon timHoaDonTrongThang9nam2018() {
        DanhMucHoaDon d = new DanhMucHoaDon();
        for (HoaDon hoaDon : hd) {
            if (hoaDon.getNgayLap().getYear() == 2018 && hoaDon.getNgayLap().getMonthValue() == 9) {
                d.them(hoaDon);
            }
        }
        return d;
    }
}
