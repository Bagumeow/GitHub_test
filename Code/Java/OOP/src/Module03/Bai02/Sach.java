package Module03.Bai02;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Sach {
	private String maSach;
	private LocalDate ngayNhap;
	private double donGia;
	private int soLuong;
	private String nhaXuatBan;

	public Sach(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan) throws Exception {
		setMaSach(maSach);
		setNgayNhap(ngayNhap);
		setDonGia(donGia);
		setSoLuong(soLuong);
		setNhaXuatBan(nhaXuatBan);
	}

	public Sach() throws Exception {
		// super();
		this("", LocalDate.now(), 0, 0, "");
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) throws Exception {
		if (!maSach.trim().equals(""))
			this.maSach = maSach;
		else
			throw new Exception("Lỗi: mã sách trống");
	}

	public LocalDate getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(LocalDate ngayNhap) {
		if (ngayNhap.isBefore(LocalDate.now()))
			this.ngayNhap = ngayNhap;
		else
			this.ngayNhap = LocalDate.now();
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		if (donGia > 0)
			this.donGia = donGia;
		else
			this.donGia = 0;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		if (soLuong > 0)
			this.soLuong = soLuong;
		else
			this.soLuong = 0;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) throws Exception {
		if (!nhaXuatBan.trim().equals(""))
			this.nhaXuatBan = nhaXuatBan;
		else
			throw new Exception("Lỗi:nhà xuất bản trống");

	}

	public double tinhThanhTien() {
		return 0;
	}

	public static String getTieuDe() {
		return String.format("%-11s%-17s%-15s%-15s%-20s", "Mã sách", "Ngày nhập", "Đơn Giá", "Số lượng",
				"Nhà xuất bản");
	}

	@Override
	public String toString() {
		Locale local = new Locale("vi", "vn");
		NumberFormat df = NumberFormat.getCurrencyInstance(local);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-11s%-17s%-15s%-15d%-20s", maSach, dtf.format(ngayNhap), df.format(donGia), soLuong,
				nhaXuatBan);
	}
}
