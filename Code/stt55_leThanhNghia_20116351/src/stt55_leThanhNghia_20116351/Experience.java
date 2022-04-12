package stt55_leThanhNghia_20116351;

import java.time.LocalDate;

public class Experience extends Employee {
    private int expInYear;

    public Experience(String id, FullName fullname, LocalDate birthday, String phone, int expInYear) throws Exception {
        super(id, fullname, birthday, phone);
        setExpInYear(expInYear);
    }

    public Experience() throws Exception {
        super();
        this.expInYear = 0;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        if (expInYear > 0)
            this.expInYear = expInYear;
        else
            expInYear = 0;
    }

    @Override
    public boolean kiemtraTotNghiep() {
        return true;
    }

    public static String getTieuDe() {
        return String.format("%s%-15s%-15s",Employee.getTieuDe(),"TT tot nghiep","So Nam Kinh nghiem");
    }

    @Override
    public String toString() {
        String s="";
        if(kiemtraTotNghiep())
            s = "Da Tot Nghiep";
        else
            s= "Chua Tot Nghiep";
        return String.format("%s%-15s%-15s", super.toString(),s,expInYear);
    }

}
