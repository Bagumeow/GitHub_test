package stt20_LeThanhNghia_20116351.bt;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            HocSinh[] hs = new HocSinh[4];
            hs[1] = new HocSinhKhoiA("124", "Lee Nam", "Da Lat", 1, LocalDate.of(2021, 4, 2), 7, (float)8.5, 9);
            hs[2] = new HocSinhKhoiB("125", "ASm am", "ThaiLand", 3, LocalDate.of(2022, 5, 6), 7, 9, 6);
            hs[3] = new HocSinhKhoiC("126", "gangnam hi", "Cambo", 6,LocalDate.of(2022, 5, 6) , 5, 8, 5);
            QuanLyThiSinh ql = new QuanLyThiSinh();
            ql.themsv(hs[1]);
            ql.themsv(hs[2]);
            ql.themsv(hs[3]);
            System.out.println(ql);
            if(ql.xoasv("126")){
                System.out.println("Xoa Thanh cong , Danh sach sau khi xoa la:");
                System.out.println(ql);
            }else{
                System.out.println("Khong co sv nhu ma can xoa!!");
            }
            if(ql.timHocSinh("124")!=null){
                System.out.println("Hs can tim la :");
                System.out.println(HocSinh.getTieuDe());
                System.out.println(ql.timHocSinh("124"));
            } else {
                System.out.println("Khong co hoc sinh theo ma do !!");
            }
        } catch (Exception e) {
        System.err.println(e.getMessage());
        }
    }
}
