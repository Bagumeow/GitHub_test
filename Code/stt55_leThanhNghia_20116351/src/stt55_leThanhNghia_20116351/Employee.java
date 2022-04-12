package stt55_leThanhNghia_20116351;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Employee {
    private String id;
    private FullName fullname;
    private LocalDate birthday;
    private String phone;

    public Employee(String id, FullName fullname, LocalDate birthday, String phone) throws Exception {
        setId(id);
        setFullname(fullname);
        setBirthday(birthday);
        setPhone(phone);
    }

    public Employee() throws Exception {
        this("Unknown", new FullName(), LocalDate.now(), "Unknown");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (!id.equals(""))
            this.id = id;
        else
            this.id = "Unknown";
    }

    public FullName getFullname() {
        return fullname;
    }

    public void setFullname(FullName fullname) {
        this.fullname = fullname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        Employee other = (Employee) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    public void setBirthday(LocalDate birthday) throws Exception {
        if (LocalDate.now().getYear() - birthday.getYear() >= 20)
            this.birthday = birthday;
        else
            throw new Exception("Nhan vien chua du 20 tuoi!!");
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone.length() == 10 && phone.charAt(0) == '0')
            this.phone = phone;
        else
            this.phone = "Unknown";
    }

    public static String getTieuDe() {
        return String.format("%-15s%-20s%-15s%-15s", "Ma NV","Ho ten","Ngay sinh","So dien thoai");
    }
    public abstract boolean kiemtraTotNghiep();
    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%-15s%-20s%-15s%-15s", id,fullname.toString(),dtf.format(birthday),phone);
    }
}
