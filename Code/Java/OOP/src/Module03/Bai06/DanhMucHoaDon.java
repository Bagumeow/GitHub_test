package Module03.Bai06;

public class DanhMucHoaDon {
    private HoaDonKhachSan[] hd;
    private int count;

    public DanhMucHoaDon(int n) {
        hd = new HoaDonKhachSan[n];
        count = 0;
    }

    public boolean them(HoaDonKhachSan a) {
        if (count < hd.length) {
            hd[count++] = a;
            return true;
        }
        return false;
    }

    int thongKeSoLuongHDTheoGio() {
        int a = 0;
        for (HoaDonKhachSan hoaDonKhachSan : hd) {
            if (hoaDonKhachSan instanceof HoaDonTheoGio)
                a += 1;
        }
        return a;
    }

    int thongKeSoLuongHDTheoNgay() {
        int a = 0;
        for (HoaDonKhachSan hoaDonKhachSan : hd) {
            if (hoaDonKhachSan instanceof HoaDonTheoNgay)
                a += 1;
        }
        return a;
    }
    double tinhTongThanhTien(int thang,int nam) throws Exception{
        double s=0;
        for (HoaDonKhachSan hoaDonKhachSan : hd) {
            if (hoaDonKhachSan.getNgayLap().getMonthValue()==thang && hoaDonKhachSan.getNgayLap().getYear()==nam)
                s+=hoaDonKhachSan.tinhThanhTien();
        }
        return s;
    }
    @Override
    public String toString() {
        String s = HoaDonTheoGio.getTieuDe() + "\n";
        for (HoaDonKhachSan hoaDonKhachSan : hd) {
            if (hoaDonKhachSan instanceof HoaDonTheoGio)
                s += hoaDonKhachSan + "\n";
        }
        s += HoaDonTheoNgay.getTieuDe() + "\n";
        for (HoaDonKhachSan hoaDonKhachSan : hd) {
            if (hoaDonKhachSan instanceof HoaDonTheoNgay)
                s += hoaDonKhachSan + "\n";
        }
        return s;
    }
}
