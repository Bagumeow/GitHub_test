package Module04.Bai07;

public class ProjectLeader extends Programmer{

    public ProjectLeader(int thePayrollnumber, String theName, double theBasicMonthlySalary, String theLanguage) {
        super(thePayrollnumber, theName, theBasicMonthlySalary, theLanguage);
    }

    public ProjectLeader() {
        super();
    }
    @Override
    public double getMonthlySalary() {
        return super.getMonthlySalary()+theBasicMonthlySalary*20/100;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
