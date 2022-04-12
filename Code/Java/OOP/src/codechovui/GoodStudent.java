package codechovui;

import java.time.LocalDate;

public class GoodStudent extends Student{
    private int gpa;
    private String bestRewardName;
   
    public GoodStudent(String fullName, LocalDate doB, char sex, String phoneNumber, String universityName,
            String gradeLevel, int gpa, String bestRewardName) throws Exception {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        setGpa(gpa);
        setBestRewardName(bestRewardName);
    }
    public GoodStudent() throws Exception {
        super();
        this.gpa = 0;
        this.bestRewardName = "Unknown";
    }
    public int getGpa() {
        return gpa;
    }
    public void setGpa(int gpa) {
        if (gpa>=0 && gpa <=10)
            this.gpa = gpa;
        else
            this.gpa=0;
    }
    public String getBestRewardName() {
        return bestRewardName;
    }
    public void setBestRewardName(String bestRewardName) {
        if (!bestRewardName.equals(""))
            this.bestRewardName=bestRewardName;
        else
            this.bestRewardName="Unknown";
    }
    
    @Override
    public String showMyInfor() {
        return String.format("%s,%-10d,%-15s", super.showMyInfor(),gpa,bestRewardName);
    }
    
}
