package Module03.Bai07;

public class Main {
    public static void main(String[] args) {
        Employee[] e= new Employee[5];
        e[0]= new CommissionEmployee("Parker", "Peter", "31513", 255, 355);
        e[1]= new BasePlusCommissionEmployee("Tony", "Stark", "135315", 1516, 25532, 151);
        e[2]= new SalariedEmployee("Bruce", "Banner", "24525", 25);
        e[3]= new HourlyEmployee("Bruce", "Wayne", "135315", 325, 44);
        e[4]= new HourlyEmployee("FM", "ASF", "2351", 5, 12);
        xuatDanhSach(e);
    }
    public static void xuatDanhSach(Employee[] e) {
        System.out.println(SalariedEmployee.getTieuDe());
        for (int i = 0; i < e.length; i++) {
            if(e[i] instanceof SalariedEmployee)
                System.out.println(e[i]);
        }
        System.out.println(HourlyEmployee.getTieuDe());
        for (int i = 0; i < e.length; i++) {
            if(e[i] instanceof HourlyEmployee)
                System.out.println(e[i]);
        }
        System.out.println(CommissionEmployee.getTieuDe());
        for (int i = 0; i < e.length; i++) {
            if(e[i] instanceof CommissionEmployee)
                System.out.println(e[i]);
        }
        System.out.println(BasePlusCommissionEmployee.getTieuDe());
        for (int i = 0; i < e.length; i++) {
            if(e[i] instanceof BasePlusCommissionEmployee)
                System.out.println(e[i]);
        }
        // for (int i = 0; i < e.length; i++) {
        //     System.out.println(e[i]);
        // }
    }
}
