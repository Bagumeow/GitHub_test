package stt20_LeThanhNghia_20116351;



public class Testing {
    public static void main(String[] args) {
        QuanLyDanhSachNhanVien ql = new QuanLyDanhSachNhanVien();
        ql.them(new GiangVien("1004", (float)4.5, 100000, "TS", 30));
        ql.them(new GiangVien("111", 3, 500, "TS", 10));
        ql.them(new NhanVienHanhChinh("1102", (float)2.7, 6000, 2));
        ql.them(new GiangVien("1103", (float)3.5, 10000, "THS", 20));
        ql.them(new GiangVien("1005", (float)4.9, 10000, "CN", 24));
        System.out.println(ql);
        if (ql.them(new GiangVien("111", 3, 500, "TS", 10))) {
            System.out.println("Them Thanh Cong");
            System.out.println("Danh Sach Sau Khi Them:");
            System.out.println(ql);
        } else
            System.out.println("Ma trung !! them khong thanh cong!!");
        if (ql.xoa("1005")){
            System.out.println("Xoa Thanh Cong");
            System.out.println("Danh Sach Sau Khi Xoa:");
            System.out.println(ql);
        } else
            System.out.println("Khong co nhan vien de xoa!!");
        ql.sapXepGiamDanTheoMa();
        System.out.println("Danh sach sau khi sap xep la:");
        System.out.println(ql);
        QuanLyDanhSachNhanVien c = ql.getDanhSachGiangVienTS();
        System.out.println("Danh sach TS la :");
        if (c.getSoLuongNV()!=0)
            System.out.println(c);
        else
            System.out.println("Khong co TS!!");
    }
}
