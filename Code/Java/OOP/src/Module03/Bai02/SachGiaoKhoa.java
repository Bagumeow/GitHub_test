package Module03.Bai02;


import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class SachGiaoKhoa extends Sach {
	private boolean tinhTrang;

	public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan,
			boolean tinhTrang) throws Exception {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		setTinhTrang(tinhTrang);
	}

	public SachGiaoKhoa() throws Exception {
		super();
		setTinhTrang(true);
	}

	public boolean isTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	@Override
	public double tinhThanhTien() {
		if (tinhTrang)
			return super.getSoLuong() * super.getDonGia();
		else
			return super.getSoLuong() * super.getDonGia() * 0.5;
	}

	public static String getTieuDe() {
		return String.format("%s%-17s%-10s", Sach.getTieuDe(), "Tình trạng", "Thành tiền");
	}

	@Override
	public String toString() {
		String s = "";
		if (tinhTrang)
			s = "Mới";
		else
			s = "Cũ";
		Locale local = new Locale("vi", "vn");
		NumberFormat df = NumberFormat.getCurrencyInstance(local);
		return String.format("%s%-17s%-10s ", super.toString(), s, df.format(tinhThanhTien()));
	}
}
