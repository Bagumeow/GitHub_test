package Module2;

public class MainAccout {
    public static void main(String[] args) {
        Accout acc1 = new Accout(72354,"Ted Murphy",100000);
        Accout acc2 = new Accout(69713,"Jane Smith", 40000);
        Accout acc3 = new Accout(93757,"Edward Demsey", 700000);
        acc1.deposit(250000);
        acc2.deposit(500000);
        acc2.withdraw(430000, 2000);
        acc3.addInterest();
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
        acc2.transfer(acc1, 100000);
        System.out.println();
        System.out.println(acc1);
        System.out.println(acc2);
    }
    
}
