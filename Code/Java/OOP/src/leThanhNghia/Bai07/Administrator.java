package leThanhNghia.Bai07;

import java.text.DecimalFormat;

public class Administrator extends Employee {
    private String theDepartment;

    public Administrator(int thePayrollnumber, String theName, double theBasicMonthlySalary, String theDepartment) {
        super(thePayrollnumber, theName, theBasicMonthlySalary);
        setTheDepartment(theDepartment);
    }

    public Administrator() {
        super();
        this.theDepartment = "Unknown";
    }

    public String getTheDepartment() {
        return theDepartment;
    }

    public void setTheDepartment(String theDepartment) {
        if (!theDepartment.equals(""))
            this.theDepartment = theDepartment;
        else
            this.theDepartment = "Unknown";
    }

    @Override
    public double getMonthlySalary() {
        return theBasicMonthlySalary + theBasicMonthlySalary*40/100;
    }

    public static String getTieuDe() {
        return String.format("%s%-15s%-20s", Employee.getTieuDe(),"Department","MonthlySalary");
    }
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###" + " USD");
        return String.format("%s%-15s%-20s", super.toString(),theDepartment,df.format(getMonthlySalary()));
    }
}
