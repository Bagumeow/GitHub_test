package Module04.Bai07;

import java.text.DecimalFormat;

public abstract class Employee {
    protected int thePayrollnumber;
    protected String theName;
    protected double theBasicMonthlySalary;

    public Employee(int thePayrollnumber, String theName, double theBasicMonthlySalary) {
        setThePayrollnumber(thePayrollnumber);
        setTheName(theName);
        setTheBasicMonthlySalary(theBasicMonthlySalary);
    }

    public Employee() {
        this(0, "Unknown", 0);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + thePayrollnumber;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (thePayrollnumber != other.thePayrollnumber)
            return false;
        return true;
    }

    public int getThePayrollnumber() {
        return thePayrollnumber;
    }

    public void setThePayrollnumber(int thePayrollnumber) {
        if (thePayrollnumber >= 0)
            this.thePayrollnumber = thePayrollnumber;
        else
            this.thePayrollnumber = 0;
    }

    public String getTheName() {
        return theName;
    }

    public void setTheName(String theName) {
        if (!theName.equals(""))
            this.theName = theName;
        else
            this.theName = "Unknown";
    }

    public double getTheBasicMonthlySalary() {
        return theBasicMonthlySalary;
    }

    public void setTheBasicMonthlySalary(double theBasicMonthlySalary) {
        if (theBasicMonthlySalary >= 0)
            this.theBasicMonthlySalary = theBasicMonthlySalary;
        else
            this.theBasicMonthlySalary = 0;
    }

    public abstract double getMonthlySalary();

    public static String getTieuDe() {
        return String.format("%-15s%-15s%-20s", "PayRoll","Name" , "BasicSalary");
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###" + " USD");
        return String.format("%-15d%-15s%-20s", thePayrollnumber, theName, df.format(theBasicMonthlySalary));
    }
}
