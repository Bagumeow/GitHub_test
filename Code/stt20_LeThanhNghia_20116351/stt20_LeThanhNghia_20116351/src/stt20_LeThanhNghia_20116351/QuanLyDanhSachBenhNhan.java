package stt20_LeThanhNghia_20116351;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class QuanLyDanhSachBenhNhan {
    private List<BenhNhan> bn;

    public QuanLyDanhSachBenhNhan() {
        bn = new ArrayList<BenhNhan>();
    }

    public boolean themBenhNhan(BenhNhan a) {
        if (bn.contains(a))
            return false;
        bn.add(a);
        return true;
    }

    @Override
    public String toString() {
        String s ="Danh sach benh nhan Ngoai Tru:\n"+ BenhNhanNgoaiTru.getTieuDe() + "\n";
        for (BenhNhan benhNhan : bn) {
            if (benhNhan instanceof BenhNhanNgoaiTru)
                s += benhNhan + "\n";
        }
        s +="Danh sach benh nhan Noi Tru:\n"+ BenhNhanNoiTru.getTieuDe() + "\n";
        for (BenhNhan benhNhan : bn) {
            if (benhNhan instanceof BenhNhanNoiTru)
                s += benhNhan + "\n";
        }
        return s;
    }

    public int demSoLuongNoiTruTren7() {
        int count = 0;
        for (BenhNhan benhNhan : bn) {
            if (benhNhan instanceof BenhNhanNoiTru)
                if (((BenhNhanNoiTru) benhNhan).getSoNgayNam() > 7)
                    count += 1;
        }
        return count;
    }

    public void sapxepTheoMaGiamDan() {
        Collections.sort(bn, new Comparator<BenhNhan>() {

            @Override
            public int compare(BenhNhan o1, BenhNhan o2) {
                return o2.getMaBN().compareTo(o1.getMaBN());
            }

        });
    }

    public boolean capnhatNgayTaiKham(String maBenhNhan, LocalDate newday) {
        for (BenhNhan benhNhan : bn) {
            if (benhNhan instanceof BenhNhanNgoaiTru)
                if (benhNhan.getMaBN().equalsIgnoreCase(maBenhNhan)) {
                    ((BenhNhanNgoaiTru) benhNhan).setNgayTaiKham(newday);
                    return true;
                }
        }
        return false;
    }
}
