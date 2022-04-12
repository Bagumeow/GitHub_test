package stt20_LeThanhNghia_20116351.bt;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class HocSinh {
    private String sbd;
    private String name;
    private String address;
    private int prioritized;
    private LocalDate testDay;

    public HocSinh() throws Exception {
        this("Unkown", "Unkown", "Unkown", 0, LocalDate.now());
    }

    public HocSinh(String sbd, String name, String address, int prioritized, LocalDate testDay) throws Exception {
        setSbd(sbd);
        setName(name);
        setAddress(address);
        setPrioritized(prioritized);
        setTestDay(testDay);
    }

    public String getSbd() {
        return sbd;
    }
    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((sbd == null) ? 0 : sbd.hashCode());
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
        HocSinh other = (HocSinh) obj;
        if (sbd == null) {
            if (other.sbd != null)
                return false;
        } else if (!sbd.equals(other.sbd))
            return false;
        return true;
    }

    public void setSbd(String sbd) throws Exception {
        if (sbd.equals(""))
            throw new Exception("Sbd rong khong them vao duoc!!");
        else
            this.sbd = sbd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.equals(""))
            this.name = name;
        else
            this.name = "Unknown";
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (!address.equals(""))
            this.address = address;
        else
            this.address = "Unkown";
    }

    public int getPrioritized() {
        return prioritized;
    }

    public void setPrioritized(int prioritized) {
        if(prioritized>=1 && prioritized <=4)
        this.prioritized = prioritized;
        else
        this.prioritized = 1;
    }

    public LocalDate getTestDay() {
        return testDay;
    }

    public void setTestDay(LocalDate testDay) {
        this.testDay = testDay;
    }
    public abstract double getAvg() ;
    public static String getTieuDe() {
        return String.format("|%-10s|%-15s|%-15s|%-10s|%-17s|%-15s|%-15s|", "SBD","Ho ten","Dia chi","MucUT","Ngay thi","Khoi thi","Diem TB");
    }
    
    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("|%-10s|%-15s|%-15s|%-10d|%-17s", sbd,name,address,prioritized,dtf.format(testDay));
    }
}
