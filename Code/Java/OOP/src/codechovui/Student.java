package codechovui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    private String fullName;
    private LocalDate doB;
    private char sex;
    private String phoneNumber;
    private String universityName;
    private String gradeLevel;
    public Student(String fullName, LocalDate doB, char sex, String phoneNumber, String universityName,
            String gradeLevel) throws Exception {
        setFullName(fullName);
        setDoB(doB);
        setSex(sex);
        setPhoneNumber(phoneNumber);
        setUniversityName(universityName);
        setGradeLevel(gradeLevel);
    }
    public Student() throws Exception{
        this("Unkown",LocalDate.now(),'0',"Unknown","Unknown","Unknown");
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) throws Exception {
        if (fullName.length()>10 && fullName.length()<50)
            this.fullName=fullName;
        else 
            throw new Exception("InvalidFullNameException");

    }
    public LocalDate getDoB() {
        return doB;
    }
    public void setDoB(LocalDate doB) throws Exception {
        if(doB.isBefore(LocalDate.now()))
            this.doB=doB;
        else
            throw new Exception("InvalidDOBException");
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) throws Exception {
        if (sex =='B' || sex =='G')
            this.sex=sex;
        else
            throw new Exception("Input files have errors !!!");
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) throws Exception {
        String sub=phoneNumber.substring(0,3);
        if (sub.equals("090")|| sub.equals("098")||sub.equals("091")|| sub.equals("031")|| sub.equals("035")||sub.equals("038"))
            this.phoneNumber=phoneNumber;
        else
            throw new Exception("InvalidPhoneNumberExcepttion");
    }
    public String getUniversityName() {
        return universityName;
    }
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    public String getGradeLevel() {
        return gradeLevel;
    }
    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
    public String showMyInfor(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%-10s %-10s %-5c %-15s %-15s %-10s",fullName,phoneNumber,sex,universityName ,dtf.format(doB),gradeLevel);
    }

}
