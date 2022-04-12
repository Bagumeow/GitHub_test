package codechovui;

import java.time.LocalDate;

public class NormalStudent extends Student{
    private float englishScore;
    private float entryTestScore;
    public NormalStudent(String fullName, LocalDate doB, char sex, String phoneNumber, String universityName,
            String gradeLevel, float englishScore, float entryTestScore) throws Exception {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        setEnglishScore(englishScore);
        setEntryTestScore(entryTestScore);
    }
    public NormalStudent() throws Exception {
        super();
        this.englishScore = 0;
        this.entryTestScore = 0;
    }
    public float getEnglishScore() {
        return englishScore;
    }
    public void setEnglishScore(float englishScore) {
        if (englishScore>0 && englishScore<=1000)
            this.englishScore = englishScore;
        else
            this.englishScore= 0;
    }
    public float getEntryTestScore() {
        return entryTestScore;
    }
    public void setEntryTestScore(float entryTestScore) {
        if ( entryTestScore>0 && entryTestScore<10)
            this.entryTestScore=entryTestScore;
        else
            this.entryTestScore=0;
    }

    @Override
    public String showMyInfor() {
        return String.format("%s,%-10f,%-15f", super.showMyInfor(),englishScore,entryTestScore);
    }
    
}
