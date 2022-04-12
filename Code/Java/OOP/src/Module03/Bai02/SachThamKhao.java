package Module03.Bai02;


import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class SachThamKhao extends Sach {
	private double thue;

	public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue)
			throws Exception {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		setThue(thue);
	}

	public SachThamKhao() throws Exception {
		super();
		setThue(0);
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		if (thue > 0)
			this.thue = thue;
		else
			this.thue = 0;
	}

	@Override
	public double tinhThanhTien() {
		return super.getSoLuong() * super.getDonGia() + thue;
	}

	public static String getTieuDe() {
		return String.format("%s%-10s%-10s", Sach.getTieuDe(), "Thuế", "Thành tiền");
	}

	@Override
	public String toString() {
		Locale local = new Locale("vi", "vn");
		NumberFormat df = NumberFormat.getCurrencyInstance(local);
		return String.format("%s%-10s%-10s", super.toString(), df.format(thue), df.format(tinhThanhTien()));
	}
}
