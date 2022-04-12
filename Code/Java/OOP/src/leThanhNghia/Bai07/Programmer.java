package leThanhNghia.Bai07;

import java.text.DecimalFormat;

public class Programmer extends Employee{
    protected String theLanguage;

    public Programmer(int thePayrollnumber, String theName, double theBasicMonthlySalary, String theLanguage) {
        super(thePayrollnumber, theName, theBasicMonthlySalary);
        setTheLanguage(theLanguage);
    }

    public Programmer() {
        super();
        this.theLanguage = "Unknown";
    }

    public String getTheLanguage() {
        return theLanguage;
    }

    public void setTheLanguage(String theLanguage) {
        if(!theLanguage.equals(""))
        this.theLanguage = theLanguage;
        else
        this.theLanguage="Unknown";
    }

    @Override
    public double getMonthlySalary() {
        if(theLanguage.equalsIgnoreCase("Java"))
            return theBasicMonthlySalary+theBasicMonthlySalary*20/100;
        return theBasicMonthlySalary;
    }
    public static String getTieuDe() {
        return String.format("%s%-20s%-20s", Employee.getTieuDe(),"Language","MonthlySalary");
    }
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###" + " USD");
        return String.format("%s%-20s%-20s", super.toString(),theLanguage,df.format(getMonthlySalary()));
    }
    
}
