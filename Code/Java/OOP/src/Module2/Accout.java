package Module2;

import java.text.DecimalFormat;




public class Accout {
    private long accoutNumber;
    private String name;
    private double balance;
    private static final double RATE =0.035 ;
    public Accout(){
        this(999999,"Chua Xac Dinh",50000);
    }
    public  Accout(long accoutNumber,String name , double balance) {
        setAccoutNumber(accoutNumber);
        setBalance(balance);
        setName(name);
    }
    public Accout(long accoutNumber, double balance){
        this(accoutNumber,"k biet ",50000);
    }
    public void setAccoutNumber(long accoutNumber) {
        if (accoutNumber>0)
            this.accoutNumber = accoutNumber;
        else 
            this.accoutNumber=999999;
    }
    public long getAccoutNumber() {
        return accoutNumber;
    }
    public void setName(String name) {
        if (!name.equals(""))
            this.name = name;
        else 
            this.name = "Chua xac dinh";
    }
    public String getName() {
        return name;
    }
    public void setBalance(double balance) {
        if (balance > 50000)
            this.balance = balance;
        else 
            this.balance = 50000;
    }
    public double getBalance() {
        return balance;
    }
    public boolean deposit(double amount) {
        if (amount>0){
            this.balance+=amount;
            return true;
        }
        else 
            return false;
    }
    public boolean withdraw(double amount, double fee  ) {
        if (amount >0 && (amount+fee)<= this.balance){
            this.balance-=(amount+fee);
            return true;
        }
        else  
            return false;
        
    }
    public void addInterest() {
        this.balance=this.balance+this.balance*RATE;
    }
    public boolean transfer(Accout acc2, double amount ) {
        if (amount<this.balance){
            this.withdraw(amount, 0);
            acc2.deposit(amount);
            return true;
        }
        else 
            return false;
    }
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String sbalance = df.format(balance);
        return String.format("{%s , %d ,%s}",name ,accoutNumber ,sbalance);
    }
}
