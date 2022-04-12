package Module03.Bai04;

import java.util.ArrayList;
import java.util.List;

public class DanhMucGiaoDichNhaDat {
    private GiaoDich[] list;
    private int count;

    public DanhMucGiaoDichNhaDat(int n) {
        list = new GiaoDich[n];
        count = 0;
    }

    public boolean them(GiaoDich g) {
        if (count < list.length) {
            list[count++] = g;
            return true;
        }
        return false;
    }

    int tinhTongSoLuongGDDat() {
        int s = 0;
        for (GiaoDich giaoDich : list) {
            if (giaoDich instanceof GiaoDichDat) {
                s += 1;
            }
        }
        return s;
    }

    int tinhTongSoLuongGDNha() {
        int s = 0;
        for (GiaoDich giaoDich : list) {
            if (giaoDich instanceof GiaoDichNha)
                s += 1;
        }
        return s;
    }

    double tinhTrungBinhThanhTienCuaGDDat() {
        double s = 0;
        int count = 0;
        for (GiaoDich giaoDich : list) {
            if (giaoDich instanceof GiaoDichDat) {
                s += giaoDich.tinhThanhTien();
                count += 1;
            }
        }
        return s / count;
    }

    List<GiaoDich> timGiaoDichthang9nam2013() {
        List<GiaoDich> kq = new ArrayList<GiaoDich>();
        for (int i = 0; i < count; i++) {
            if (list[i].getNgayGiaoDich().getMonthValue() == 9 && list[i].getNgayGiaoDich().getYear() == 2013) {
                kq.add(list[i]);
            }
        }
        return kq;
    }

    @Override
    public String toString() {
        String s = GiaoDichDat.getTieuDe() + "\n";
        for (int i = 0; i < count; i++) {
            if (list[i] instanceof GiaoDichDat)
                s += list[i] + "\n";
        }
        s += GiaoDichNha.getTieuDe() + "\n";
        for (int i = 0; i < count; i++) {
            if (list[i] instanceof GiaoDichNha)
                s += list[i] + "\n";
        }
        return s;
    }
}
