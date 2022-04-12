package stt55_leThanhNghia_20116351;

import java.time.LocalDate;

public class Fresher extends Employee {
    private int gradYear;
    private char gradRank;

    public int getGradYear() {
        return gradYear;
    }

    public Fresher(String id, FullName fullname, LocalDate birthday, String phone, int gradYear, char gradRank)
            throws Exception {
        super(id, fullname, birthday, phone);
        this.gradYear = gradYear;
        this.gradRank = gradRank;
    }

    public Fresher() throws Exception {
        super();
        this.gradYear = 0;
        this.gradRank = '0';
    }

    public void setGradYear(int gradYear) throws Exception {
        if (LocalDate.now().getYear() > gradYear)
            this.gradYear = gradYear;
        else
            throw new Exception("Nam tot nghiep phai truoc hien tai");
    }

    public char getGradRank() {
        return gradRank;
    }

    public void setGradRank(char gradRank) {
        if (gradRank == 'A' || gradRank == 'B' || gradRank == 'C')
            this.gradRank = gradRank;
        else
            this.gradRank = '0';
    }

    @Override
    public boolean kiemtraTotNghiep() {
        return true;
    }

    public static String getTieuDe() {
        return String.format("%s%-15s%-20s%-15s", Employee.getTieuDe(), "TT tot nghiep", "Nam tot nghiep",
                "Loai Tot Nghiep");
    }

    @Override
    public String toString() {
        String s = "";
        if (kiemtraTotNghiep())
            s = "Da Tot Nghiep";
        else
            s = "Chua Tot Nghiep";
        return String.format("%s%-15s%-20d%-15s", super.toString(), s, gradYear, gradRank);
    }
}
