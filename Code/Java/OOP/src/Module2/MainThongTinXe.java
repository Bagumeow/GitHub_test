package Module2;

public class MainThongTinXe {
    public static void main(String[] args) {
        try {
            ThongTinDangKiXe[] xe = new ThongTinDangKiXe[3];
            xe[0] = new ThongTinDangKiXe("Duong Quan Manh", "SH", 35000000, 150);
            xe[1] = new ThongTinDangKiXe("Mai Hong Phuong", "Ford Ranger", 250000000, 3000);
            xe[2] = new ThongTinDangKiXe("Le Thanh Nghia", "Angela", 15000000, 50);
            System.out.printf("%-20s %-20s %-20s %-20s %-20s\n","Tên chủ xe","Loại xe","Dung tích","Trị giá","Thuế phải nộp");
            for (int i=0;i<105;i++){
                System.out.print("=");
            }
            System.out.println();
            for (int i=0;i<3;i++){
                System.out.println(xe[i].toString());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
