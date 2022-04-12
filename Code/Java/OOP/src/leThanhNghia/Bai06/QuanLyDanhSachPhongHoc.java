package leThanhNghia.Bai06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class QuanLyDanhSachPhongHoc {
    private List<PhongHoc> ph;

    public QuanLyDanhSachPhongHoc() {
        ph = new ArrayList<PhongHoc>();
    }

    public boolean them(PhongHoc a) {
        if (ph.contains(a))
            return false;
        ph.add(a);
        return true;
    }

    public PhongHoc tim(String maphonghoc) {
        for (PhongHoc phongHoc : ph) {
            if (phongHoc.getMaPhong().equalsIgnoreCase(maphonghoc))
                return phongHoc;
        }
        return null;
    }

    @Override
    public String toString() {
        String s = PhongHocLyThuyet.getTieuDe() + "\n";
        for (PhongHoc phongHoc : ph) {
            if (phongHoc instanceof PhongHocLyThuyet)
                s += phongHoc + "\n";
        }
        s += PhongMayTinh.getTieuDe() + "\n";
        for (PhongHoc phongHoc : ph) {
            if (phongHoc instanceof PhongMayTinh)
                s += phongHoc + "\n";
        }
        s += PhongHocThiNghiem.getTieuDe() + "\n";
        for (PhongHoc phongHoc : ph) {
            if (phongHoc instanceof PhongHocThiNghiem)
                s += phongHoc + "\n";
        }
        return s;
    }

    public QuanLyDanhSachPhongHoc getDanhSachPhongHocDatChuan() {
        QuanLyDanhSachPhongHoc q = new QuanLyDanhSachPhongHoc();
        for (PhongHoc phongHoc : ph) {
            if (phongHoc.xetDatChuan())
                q.them(phongHoc);
        }
        return q;
    }

    public void sapTangDanTheoDayNha() {
        Collections.sort(ph, new Comparator<PhongHoc>() {

            @Override
            public int compare(PhongHoc o1, PhongHoc o2) {
                return o1.getDayNha().compareTo(o2.getDayNha());
            }
        });
    }

    public void sapGiamDanTheoDienTich() {
        Collections.sort(ph, new Comparator<PhongHoc>() {

            @Override
            public int compare(PhongHoc o1, PhongHoc o2) {
                return o1.getDienTich() < o2.getDienTich() ? 1 : -1;
            }
        });
    }

    public void sapTangDanTheoBongDen() {
        Collections.sort(ph, new Comparator<PhongHoc>() {

            @Override
            public int compare(PhongHoc o1, PhongHoc o2) {
                return o1.getSoBongDen() > o2.getSoBongDen() ? 1 : -1;
            }
        });
    }

    public boolean capnhatPhongMayTinh(String maph, int maymoi) {
        for (PhongHoc phongHoc : ph) {
            if (phongHoc instanceof PhongMayTinh)
                if(phongHoc.getMaPhong().equalsIgnoreCase(maph)){
                    ((PhongMayTinh)phongHoc).setMayTinh(maymoi);
                    return true;
                }      
        }
        return false;
    }

    public boolean xoa(String maph) {
        return ph.removeIf(ph1 -> ph1.getMaPhong().equalsIgnoreCase(maph));
    }

    public int tinhTongPhongHoc() {
        return ph.size();
    }

    public  QuanLyDanhSachPhongHoc getDanhSachPhongMayCo60May() {
        QuanLyDanhSachPhongHoc ql = new QuanLyDanhSachPhongHoc();
        for (PhongHoc phongHoc : ph) {
            if(phongHoc instanceof PhongMayTinh  )
                if(((PhongMayTinh)phongHoc).getMayTinh()>=60)
                    ql.them(phongHoc);
        }
        return ql;
    }
}