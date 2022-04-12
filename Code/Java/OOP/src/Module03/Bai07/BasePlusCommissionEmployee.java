package Module03.Bai07;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
            double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        setBaseSalary(baseSalary);
    }

    public BasePlusCommissionEmployee() {
        super();
        this.baseSalary = 0;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0)
            this.baseSalary = baseSalary;
        else
            this.baseSalary = 0;
    }

    @Override
    public double earnings() {
        return super.earnings()+baseSalary;
    }
    public static String getTieuDe() {
        return String.format("%s%-15s", CommissionEmployee.getTieuDe(),"BaseSalary");
    }
    @Override
    public String toString() {
        return String.format("%s%-15.1f",super.toString(),baseSalary);
    }
}
