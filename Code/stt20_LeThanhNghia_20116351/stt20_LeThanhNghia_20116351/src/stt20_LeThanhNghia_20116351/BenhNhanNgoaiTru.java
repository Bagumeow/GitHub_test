package stt20_LeThanhNghia_20116351;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BenhNhanNgoaiTru extends BenhNhan {
    private LocalDate ngayTaiKham;

    public BenhNhanNgoaiTru(String maBN, String hoTen, double tienKham, LocalDate ngayTaiKham) {
        super(maBN, hoTen, tienKham);
        setNgayTaiKham(ngayTaiKham);
    }

    public BenhNhanNgoaiTru() {
        super();
        this.ngayTaiKham = LocalDate.now();
    }

    public LocalDate getNgayTaiKham() {
        return ngayTaiKham;
    }

    public void setNgayTaiKham(LocalDate ngayTaiKham) {
        if (ngayTaiKham.isBefore(LocalDate.now()))
            this.ngayTaiKham = ngayTaiKham;
        else
            this.ngayTaiKham = LocalDate.now();
    }

    @Override
    public double tinhChiPhiKham() {
        return getTienKham();
    }

    public static String getTieuDe() {
        return String.format("%s%-17s%-20s", BenhNhan.getTieuDe(), "Ngay tai kham", "Chi phi kham");
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,##0.00" + "VND");
        return String.format("%s%-17s%-20s", super.toString(),dtf.format(ngayTaiKham),df.format(tinhChiPhiKham()) );
    }
}
