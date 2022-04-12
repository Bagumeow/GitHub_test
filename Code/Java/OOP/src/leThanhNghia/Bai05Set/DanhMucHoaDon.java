package leThanhNghia.Bai05Set;

import java.util.HashSet;
import java.util.Set;

public class DanhMucHoaDon {
    private Set<HoaDon> hd;

    public DanhMucHoaDon() {
        hd = new HashSet<HoaDon>();
    }

    public boolean them(HoaDon a) {
        return hd.add(a);
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
       for (HoaDon hoaDon : hd) {
            if (hoaDon instanceof KhachHangVN)
                    s += 1;
       }
        return s;
    }

    public int tinhTongHoaDonNN() {
        int s = 0;
       for (HoaDon hoaDon : hd) {
            if (hoaDon instanceof KhachHangNN)
                    s += 1;
       }
        return s;
    }

    public double tinhTrungBinhThanhTienNN() {
        double s = 0;
        int count = 0;
       for (HoaDon hoaDon : hd) {
           if(hoaDon instanceof KhachHangNN)
                s+=hoaDon.tinhGiaThanh();
                count+=1;
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
