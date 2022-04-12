package Module03.Bai07;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        setWage(wage);
        setHours(hours);
    }

    public HourlyEmployee() { 
        super();
        this.wage = 0;
        this.hours = 0;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage >= 0)
            this.wage = wage;
        else
            this.wage = 0;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours >= 0)
            this.hours = hours;
        else
            this.hours = 0;
    }

    @Override
    public double earnings() {
        if(hours<=40)
            return wage*hours;
        else
            return 40*wage+(hours-40)*wage*1.5;
    }
    public static String getTieuDe() {
        return String.format("%s%-15s%-15s",Employee.getTieuDe(), "wage","hours");
    }
    @Override
    public String toString() {
        return String.format("%s%-15.1f%-15.1f", super.toString(),wage,hours);
    }
}
