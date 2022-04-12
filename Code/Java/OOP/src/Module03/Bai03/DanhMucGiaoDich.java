package Module03.Bai03;

import java.util.ArrayList;
import java.util.List;

public class DanhMucGiaoDich {
    private GiaoDich[] list;
    private int count;

    public DanhMucGiaoDich(int n) {
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

    int tinhTongSoLuongGDVang() {
        int s = 0;
        for (GiaoDich giaoDich : list) {
            if (giaoDich instanceof GiaoDichVang) {
                s += 1;
            }
        }
        return s;
    }

    int tinhTongSoLuongGDTien() {
        int s = 0;
        for (GiaoDich giaoDich : list) {
            if (giaoDich instanceof GiaoDichTien)
                s += 1;
        }
        return s;
    }

    double tinhTrungBinhThanhTienCuaGDT() {
        double s = 0;
        int count = 0;
        for (GiaoDich giaoDich : list) {
            if (giaoDich instanceof GiaoDichTien) {
                s += giaoDich.tinhThanhTien();
                count += 1;
            }
        }
        return s / count;
    }

    List<GiaoDich> timGiaoDichTren1Ty() {
        List<GiaoDich> kq = new ArrayList<GiaoDich>();
        for (int i = 0; i < count; i++) {
            if (list[i].tinhThanhTien() > 1000000000) {
                kq.add(list[i]);
            }
        }
        return kq;
    }

    @Override
    public String toString() {
        String s = GiaoDichVang.getTieuDe() + "\n";
        for (int i = 0; i < list.length; i++) {
            if (list[i] instanceof GiaoDichVang)
                s += list[i] + "\n";
        }
        s += GiaoDichTien.getTieuDe() + "\n";
        for (int i = 0; i < list.length; i++) {
            if (list[i] instanceof GiaoDichTien)
                s += list[i] + "\n";
        }
        return s;
    }
}
