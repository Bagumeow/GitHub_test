package leThanhNghia.Bai07;

import java.text.DecimalFormat;

public class Entry {
    public static void main(String[] args) {
        Employee[] e = new Employee[5];
        e[0] = new Administrator(35, "Parker", 3000, "ABC");
        e[1] = new Programmer(12, "Lee Chaok", 3000,"Java" );
        e[2] = new ProjectLeader(13, "Yasuo", 4000, "Java");
        e[3] = new Administrator(42, "MinHo", 3560, "Nambook");
        e[4] = new Programmer(31, "Nam", 2500, "Python");
        SofwareHouse s = new SofwareHouse("FPT");
        s.addEmployee(e[0]);
        s.addEmployee(e[1]);
        s.addEmployee(e[2]);
        s.addEmployee(e[3]);
        s.addEmployee(e[4]);
        System.out.println(s.displayAllStaff());
        DecimalFormat df = new DecimalFormat("#,###" + " USD");
        System.out.printf("Tong so tien luong phai tra cho cac nhan vien la :%s\n",df.format(s.getMonthlySalaryBill()));
        System.out.println("Danh sach nhan vien sau khi sap xep theo ten la:");
        s.sortAllStaffByName();
        System.out.println(s.displayAllStaff());
        System.out.println("Danh sach cac lap trinh vien la:");
        System.out.println(s.displayListProgrammers());
        s.updateDepartmentForAdmin(35, "Dev");
        System.out.println("Danh sach nhan vien sau khi cap nhat la:");
        System.out.println(s.displayAllStaff());
        if(s.deleteEmployee(31)){
            System.out.println("Danh sach nhan vien sau khi xoa la:");
            System.out.println(s.displayAllStaff());
        }else  
            System.out.println("Khong co nhan vien de xoa!!");
    }
}
