package Module03.Bai07;

public class SalariedEmployee extends Employee {
    private double weeklySalary;
    
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        setWeeklySalary(weeklySalary);
    }

    public SalariedEmployee() {
        super();
        this.weeklySalary = 0;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary>=0)
            this.weeklySalary = weeklySalary;
        else
            this.weeklySalary=0;
    }

    @Override
    public double earnings() {
        return weeklySalary;
    }
    public static String getTieuDe() {
        return String.format("%s%-15s",Employee.getTieuDe(),"WeeklySalaRy");
    }
    
    @Override
    public String toString() {
        return String.format("%s%-15.1f", super.toString(),weeklySalary);
    }
}
