package Module03.Bai02;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		try {
			DanhMucSach a = new DanhMucSach(110);
			a.them(new SachGiaoKhoa("A00", LocalDate.of(2016, 01, 01), 250000f, 5, "Kim Dong", true));
			a.them(new SachGiaoKhoa("A01", LocalDate.of(2002, 12, 01), 20000f, 10, "IUH", true));
			a.them(new SachGiaoKhoa("A02", LocalDate.of(2015, 10, 01), 450000f, 7, "BGD&DT", false));
			a.them(new SachThamKhao("B00", LocalDate.of(2023, 07, 01), 300000, 10, "TS NVD", 10000f));
			a.them(new SachThamKhao("B01", LocalDate.of(2021, 12, 01), 60000, 12, "AGMS", 50000f));
			a.them(new SachThamKhao("B02", LocalDate.of(2021, 12, 03), 25000, 4, "MMASG", 76000f));
			System.out.println(a);
			Scanner nhap = new Scanner(System.in);
			Locale local = new Locale("vi", "vn");
			NumberFormat df = NumberFormat.getCurrencyInstance(local);
			System.out.println("Tổng thành tiền sách giáo khoa là: " + df.format(a.tinhTongThanhTienSGK()));
			System.out.println("Tổng thành tiền sách tham khảo: " + df.format(a.tinhTongThanhTienSTK()));
			System.out.println("Nhập nhà xuất bản cần tìm:");
			String s;
			s = nhap.nextLine();
			List<Sach> kq = a.timSachGKCuaNXB(s);
			if (kq.size() != 0)
				for (Sach sach : kq) {
					System.out.println(sach);
				}
			else
				System.out.println("Không có cuốn sách nào có nhà xuất bản là:" + s);
			System.out.println("Thành tiền sách cao nhất là: " + df.format(a.timThanhTienMax()));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
