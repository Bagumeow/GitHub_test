package stt55_leThanhNghia_20116351;

import java.time.LocalDate;

public class Testing {
    public static void main(String[] args) {
        try {
            QuanLyNhanVien ql = new QuanLyNhanVien();
            ql.themNv(new Experience("1001", new FullName("Nghia", "Le Thanh"), LocalDate.of(2000, 11, 15), "0812971915", 5));
            ql.themNv(new Fresher("1004", new FullName("Dat", "Le Thanh"), LocalDate.of(1989, 4, 2), "0124567890", 2021, 'A'));
            ql.themNv(new Intern("1003", new FullName("Nam", "Le Thanh"), LocalDate.of(1998, 4, 2), "0124767890","CNTT", 7));
            ql.themNv(new Fresher("1002", new FullName("Toan", "Tran Ba"), LocalDate.of(1995, 4, 2), "0124567890", 2021, 'B'));
            ql.themNv(new Experience("1006", new FullName("Nga", "Vu Thanh"), LocalDate.of(2000, 11, 15), "0812353915", 8));
            ql.themNv(new Experience("1007", new FullName("An", "Le Van"), LocalDate.of(1997, 11, 15), "0812364915", 9));
            ql.themNv(new Experience("1005", new FullName("Tram", "Le Nguyen"), LocalDate.of(2000, 3, 15), "0812971913", 6));
            ql.themNv(new Experience("1008", new FullName("Minh", "Le "), LocalDate.of(1990, 2, 15), "0812765413", 10));
            System.out.println(ql);
            System.out.println("So luong nhan vien tot nghiep trong nam nay la :"+ql.demNhanVienTotNghiepNamNay());
            if(ql.suaNgaySinh("1001", LocalDate.of(1990, 4, 2))){
                System.out.println("Sua ngay sinh thanh cong , danh sach sau khi sua la:");
                System.out.println(ql);
            }else
                System.out.println("Khong co nhan vien theo ma can sua");
            QuanLyNhanVien c = ql.getNhanVienCotren5Kn();
            System.out.println("Danh sach nhan vien tren 5 nam kinh nghiem la:");
            if (c.getSoLuongnv() != 0){
                System.out.println(c);
            }else
                System.out.println("Khong co nhan vien");
            
        } catch (Exception e) {
           System.err.println(e.getMessage());
        }
    }
}
