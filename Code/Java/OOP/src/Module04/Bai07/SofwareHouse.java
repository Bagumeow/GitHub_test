package Module04.Bai07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SofwareHouse {
    private String theName;
    private List<Employee> e;

    public SofwareHouse(String theName) {
        this.theName = theName;
        e = new ArrayList<Employee>();
    }

    public boolean addEmployee(Employee emp) {
        if (e.contains(emp))
            return false;
        e.add(emp);
        return true;
    }

    public String displayAllStaff() {
        String s = "List Employy is of " + this.theName+":\n";
        s +="Admin list:"+"\n"+ Administrator.getTieuDe() + "\n";
        for (Employee employee : e) {
            if (employee instanceof Administrator)
                s += employee + "\n";
        }
        s +="Programmer and ProjectLeader list:"+"\n"+ Programmer.getTieuDe()+"\n";
        for (Employee employee : e) {
            if (employee instanceof Programmer )
                s += employee + "\n";
        }
        return s;
    }

    public double getMonthlySalaryBill() {
        double s = 0;
        for (Employee employee : e) {
            s += employee.getMonthlySalary();
        }
        return s;
    }

    public void sortAllStaffByName() {
        Collections.sort(e, new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getTheName().compareTo(o2.getTheName());
            }
        });
    }

    public String displayListProgrammers() {
        String s = Programmer.getTieuDe() + "\n";
        for (Employee employee : e) {
            if (employee instanceof Programmer )
                s += employee + "\n";
        }
        return s;
    }

    public boolean updateDepartmentForAdmin(int aPayrollNo, String deptNew) {
        for (Employee employee : e) {
            if (employee instanceof Administrator)
                if (employee.getThePayrollnumber() == aPayrollNo) {
                    ((Administrator) employee).setTheDepartment(deptNew);
                    return true;
                }
        }
        return false;
    }

    public boolean deleteEmployee(int id) {
        return e.removeIf(emp -> emp.getThePayrollnumber() == id);
    }
}
