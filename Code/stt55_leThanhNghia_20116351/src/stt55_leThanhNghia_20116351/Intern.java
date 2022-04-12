package stt55_leThanhNghia_20116351;

import java.time.LocalDate;

public class Intern extends Employee {
    private String major;
    private int semester;

    public Intern(String id, FullName fullname, LocalDate birthday, String phone, String major, int semester)
            throws Exception {
        super(id, fullname, birthday, phone);
        setMajor(major);
        setSemester(semester);
    }

    public Intern() throws Exception {
        super();
        this.major = "Unknown";
        this.semester = 0;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        if (!major.equals(""))
            this.major = major;
        else
            this.major = "Unknown";
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        if (semester >= 6 && semester <= 10)
            this.semester = semester;
        else
            this.semester = 0;
    }

    @Override
    public boolean kiemtraTotNghiep() {
        return false;
    }

    public static String getTieuDe() {
        return String.format("%s%-20s%-20s%-15s", Employee.getTieuDe(), "TT tot nghiep", "Chuyen nganh",
                "Hoc ki");
    }

    @Override
    public String toString() {
         String s = "";
        if (kiemtraTotNghiep())
            s = "Da Tot Nghiep";
        else
            s = "Chua Tot Nghiep";
        return  String.format("%s%-20s%-20s%-15s", super.toString(),s,major,semester);
    }
}
