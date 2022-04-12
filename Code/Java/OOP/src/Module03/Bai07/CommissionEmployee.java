package Module03.Bai07;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
            double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    public CommissionEmployee() {
        super();
        this.grossSales = 0;
        this.commissionRate = 0;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales >= 0)
            this.grossSales = grossSales;
        else
            this.grossSales = 0;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate >= 0)
            this.commissionRate = commissionRate;
        else
            this.commissionRate = 0;
    }

    public static String getTieuDe() {
        return String.format("%s%-15s%-25s",Employee.getTieuDe(),"grossSales"," commissionRate");
    }
    @Override
    public double earnings() {
        return commissionRate*grossSales;
    }
    @Override
    public String toString() {
        return String.format("%s%-15.1f%-25.1f",super.toString(),grossSales,commissionRate);
    }

}
