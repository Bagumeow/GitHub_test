package stt55_leThanhNghia_20116351;

import java.time.LocalDate;
import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
import java.util.List;

public class QuanLyNhanVien {
    private List<Employee> em;

    public QuanLyNhanVien() {
        em = new ArrayList<Employee>();
    }

    public boolean themNv(Employee a) {
        if (em.contains(a))
            return false;
        em.add(a);
        return true;
    }

    @Override
    public String toString() {
        String s ="Danh Sach nhan vien Kinh nghiem lau nam:"+"\n"+ Experience.getTieuDe() + "\n";
        for (Employee employee : em) {
            if (employee instanceof Experience)
                s+= employee +"\n";
        }
        s +="Danh Sach nhan vien moi ra truong:"+"\n"+ Fresher.getTieuDe() + "\n";
        for (Employee employee : em) {
            if (employee instanceof Fresher)
                s+= employee +"\n";
        }
        s +="Danh Sach nhan vien thuc tap:"+"\n"+ Intern.getTieuDe() + "\n";
        for (Employee employee : em) {
            if (employee instanceof Intern)
                s+= employee +"\n";
        }
        return s;
    }
    public int demNhanVienTotNghiepNamNay(){
        int s =0;
        for (Employee employee : em) {
            if (employee instanceof Fresher)
                if (((Fresher)employee).getGradYear() == LocalDate.now().getYear())
                    s+=1;
        }
        return s;
    }
    public boolean suaNgaySinh(String maNvsua,LocalDate ngayMoi) throws Exception {
        for (Employee employee : em) {
            if(employee.getId().equalsIgnoreCase(maNvsua)){
                employee.setBirthday(ngayMoi);
                return true;
            }
        }
        return false;
    }
    // public void sapTheoTenTangDan() {
    //     Collections.sort(em, new Comparator<Employee>() {

    //         @Override
    //         public int compare(Employee o1, Employee o2) {
    //             return o1.getFullname().;
    //         }
            
    //     });
    // }
    public int getSoLuongnv(){
        return em.size();
    }
    public QuanLyNhanVien getNhanVienCotren5Kn() {
        QuanLyNhanVien ql = new QuanLyNhanVien();
        for (Employee employee : em) {
            if(employee instanceof Experience)
                if(((Experience)employee).getExpInYear()>5)
                    ql.themNv(employee);
        }
        return ql;
    }
}
