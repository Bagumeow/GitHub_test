package Module2;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
    private String mahang;
    private String tenhang;
    private double dongia;
    private LocalDate ngaysx;
    private LocalDate hsd;
    private void setMahang(String mahang)  throws Exception{
        if (mahang.equals("")){
            throw new Exception("Phai Nhap ma hang !!");
        }
        else 
            this.mahang = mahang;
    }
    public String getMahang() {
        return mahang;
    }
    public void setTenhang(String tenhang) {
        if (tenhang.equals(""))
            this.tenhang="xxx";
        else
            this.tenhang = tenhang;
    }
    public String getTenhang() {
        return tenhang;
    }
    public void setDongia(double dongia) {
        if (dongia <0)
            this.dongia=0;
        else 
            this.dongia = dongia;
    }
    public double getDongia() {
        return dongia;
    }
    public void setNgaysx(LocalDate ngaysx) {
        if (ngaysx.isAfter(LocalDate.now()) )
            this.ngaysx = ngaysx;
        else
            this.ngaysx = LocalDate.now();
    }
    public LocalDate getNgaysx() {
        return ngaysx;
    }
    public void setHsd(LocalDate hsd) {
        if (hsd.isBefore(LocalDate.now()))
            this.hsd = hsd;
        else
            this.hsd = LocalDate.now();
    }
    public LocalDate getHsd() {
        return hsd;
    }
    public HangThucPham(String mahang,String tenhang,double dongia,LocalDate ngaysx,LocalDate hsd)throws Exception{
        setMahang(mahang);
        setTenhang(tenhang);
        setDongia(dongia);
        setNgaysx(ngaysx);
        setHsd(hsd);
    }
    public  HangThucPham(String mahang ) throws Exception{
        this(mahang,"xxx",0,LocalDate.now(),LocalDate.now());
    }
    public boolean ktraHetHan() {
        return hsd.isBefore(LocalDate.now()) ? true : false;
    }
    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String gia = df.format(dongia);
        String ghichu="";
        if (ktraHetHan()){
            ghichu = "Hang het han";
        }
        return String.format("%-8s %-10s %-15s %-15s %-15s %-10s",mahang,tenhang,df.format(dongia) ,dtf.format(ngaysx),dtf.format(hsd),ghichu);
    }
}
