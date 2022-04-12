    package Module04.Bai06;

public class Main {
    public static void main(String[] args) {
        PhongHoc[] p = new PhongHoc[5];
        p[0]=new PhongHocThiNghiem("112","3D",30,2,"May",30,true);
        p[1]=new PhongHocLyThuyet("132", "2A", 13, 2, true);
        p[2]=new PhongMayTinh("145", "1C", 6, 5, 3);
        p[3]=new PhongHocThiNghiem("315", "1D", 35,4, "KHDL", 56, true);
        p[4]=new PhongMayTinh("153", "2C", 80, 8, 60);
        QuanLyDanhSachPhongHoc ql = new QuanLyDanhSachPhongHoc();
        ql.them(p[0]);
        ql.them(p[1]);
        ql.them(p[2]);
        ql.them(p[3]);
        ql.them(p[4]);
        System.out.println(ql);
        if (ql.tim("315")!=null){
            System.out.println("Phong hoc can tim la:");
            System.out.println(ql.tim("315"));
        }
        else
            System.out.println("Khong co phong hoc can tim");
        QuanLyDanhSachPhongHoc b = ql.getDanhSachPhongHocDatChuan();
        System.out.println("Danh sach phong hoc dat chuan la :");
        if(b.tinhTongPhongHoc()!=0)
            System.out.println(b);
        else
            System.out.println("Khong co phong hoc dat chuan!!");
        System.out.println("Sau khi sap xep tang dan theo Day nha");
        ql.sapTangDanTheoDayNha();
        System.out.println(ql);
        System.out.println("Sau khi sap xep giam dan theo dien tich");
        ql.sapGiamDanTheoDienTich();
        System.out.println(ql);
        System.out.println("Sau khi sap xep tang dan theo bong den");
        ql.sapTangDanTheoBongDen();
        System.out.println(ql);
        if (ql.capnhatPhongMayTinh("145", 10)){
            System.out.println("Danh sach phong sau khi cap nhat phong may tinh la:");
            System.out.println(ql);
        }
        else
            System.out.println("Khong cap nhat duoc!!");
        if (ql.xoa("112")){
            System.out.println("Danh sach phong sau khi xoa la:");
            System.out.println(ql);
        }
        else
            System.out.println("Khong xoa duoc!!");
        System.out.printf("So luong phong hoc hien tai la: %d\n",ql.tinhTongPhongHoc());
        QuanLyDanhSachPhongHoc c = ql.getDanhSachPhongMayCo60May();
        System.out.println("Danh sach phong may co tren 60 may la");
        if (c.tinhTongPhongHoc()!=0)
            System.out.println(c);
        else
            System.out.println("Khong co phong may nao tren 60 may!!");
    } 
}
