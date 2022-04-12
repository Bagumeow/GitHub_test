package hinh;

public class MainTamGiac {
    public static void main(String[] args) {
        TamGiac tg1 = new TamGiac(1,2,6);
        TamGiac tg2 = new TamGiac(-7,8,3);
        TamGiac tg3 = new TamGiac(3,4,5); tg3.setMc(20);
        TamGiac tg4 = new TamGiac(6,6,6);
        TamGiac tg5 = new TamGiac(7,5,7);
        System.out.printf("%-10s %-10s %-10s %-10s %-15s %-25s\n",
        "Canh a","Canh b","Canh c","Chu vi","Dien Tich","Loai Tam Giac");
        System.out.println(tg1);
        System.out.println(tg2);
        System.out.println(tg3);
        System.out.println(tg4);
        System.out.println(tg5);
    }
}
