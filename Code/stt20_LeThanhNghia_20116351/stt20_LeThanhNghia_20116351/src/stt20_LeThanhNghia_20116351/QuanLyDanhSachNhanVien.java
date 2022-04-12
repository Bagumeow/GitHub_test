package stt20_LeThanhNghia_20116351;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class QuanLyDanhSachNhanVien {
    private List<NhanVien> nv;

    public QuanLyDanhSachNhanVien() {
        nv = new ArrayList<NhanVien>();
    }

    public boolean them(NhanVien a) {
        if (nv.contains(a))
            return false;
        nv.add(a);
        return true;
    }

    @Override
    public String toString() {
        String s = "Danh Sach Giang vien :\n" + GiangVien.getTieuDe() + "\n";
        for (NhanVien nhanVien : nv) {
            if (nhanVien instanceof GiangVien)
                s += nhanVien + "\n";
        }
        s += "Danh Sach Nhan Vien Hanh Chinh :\n" + NhanVienHanhChinh.getTieuDe() + "\n";
        for (NhanVien nhanVien : nv) {
            if (nhanVien instanceof NhanVienHanhChinh)
                s += nhanVien + "\n";
        }
        return s;
    }

    public boolean xoa(String manhanvien) {
        return nv.removeIf(nv1 -> nv1.getMaNV().equalsIgnoreCase(manhanvien));
    }

    public void sapXepGiamDanTheoMa() {
        Collections.sort(nv, new Comparator<NhanVien>() {

            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o2.getMaNV().compareTo(o1.getMaNV());
            }

        });
    }
    public int getSoLuongNV() {
        return nv.size();
    }
    public QuanLyDanhSachNhanVien getDanhSachGiangVienTS() {
        QuanLyDanhSachNhanVien ql = new QuanLyDanhSachNhanVien();
        for (NhanVien nhanVien : nv) {
            if (nhanVien instanceof GiangVien)
                if(((GiangVien)nhanVien).getTrinhDo().equals("TS"))
                    ql.them(nhanVien);
        }
        return ql;
    }
}
