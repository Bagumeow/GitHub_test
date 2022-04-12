package Vidu;

import java.text.DecimalFormat;

public class HoaDon {
    private String maHoaDon;
    private String tenKhachHang;
    private String maPhong;
    private int soNgayThue;
    private double donGia;
    public HoaDon() throws Exception{
        this("xxx","xxx","xxx",1,1);
    }
 
    public HoaDon(String maHoaDon, String tenKhachHang, String maPhong, int soNgayThue, double donGia) {
        this.maHoaDon = maHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.maPhong = maPhong;
        this.soNgayThue = soNgayThue;
        this.donGia = donGia;
    }

    public double getDonGia() {
        return donGia;
    }
    public String getMaHoaDon() {
        return maHoaDon;
    }
    public String getMaPhong() {
        return maPhong;
    }
    public int getSoNgayThue() {
        return soNgayThue;
    }
    public String getTenKhachHang() {
        return tenKhachHang;
    }
    public void setMaHoaDon(String maHoaDon) {
        if(maHoaDon.equals(""))
            this.maHoaDon="xxx";
        else
            this.maHoaDon = maHoaDon;
    }
    public void setTenKhachHang(String tenKhachHang) {
        if(tenKhachHang.equals(""))
            this.tenKhachHang="xxx";
        else
            this.tenKhachHang = tenKhachHang;
    }
    public void setMaPhong(String maPhong) {
        if (!maPhong.equals(""))
            this.maPhong = maPhong;
        else 
            this.maPhong="xxx";
    }
    public void setSoNgayThue(int soNgayThue) throws Exception {
        if (soNgayThue<=0)
            throw new Exception("Ngay phai lon hon 0!!");
        else
        this.soNgayThue = soNgayThue;
    }
    public void setDonGia(double donGia) throws Exception {
        if (donGia<=0)
            throw new Exception("Don gia phai lon hon 0!!");
        else 
        this.donGia = donGia;
    }
    public double getThanhTien() {
        return soNgayThue*donGia;
    }
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return String.format("%10s %20s %15s %15d %15s %20s", maHoaDon,tenKhachHang,maPhong,soNgayThue,df.format(donGia),df.format(getThanhTien()));
    }
    public static String getTieuDe() {
        return String.format("%10s %20s %15s %15s %15s %20s","Ma HD","Ten KH","Ma Phong","So Ngay O","Don Gia","Thanh Tien");
    }
}
