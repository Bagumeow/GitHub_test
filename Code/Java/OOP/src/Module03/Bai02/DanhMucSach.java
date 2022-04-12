package Module03.Bai02;

import java.util.ArrayList;
import java.util.List;

public class DanhMucSach {
	private Sach[] list;
	private int count;

	public DanhMucSach(int n) {
		list = new Sach[n];
		count = 0;
	}

	public boolean them(Sach s) {
		if (count < list.length) {
			list[count++] = s;
			return true;
		}
		return false;
	}

	 double tinhTongThanhTienSGK() {
		double sum = 0;
		for (Sach sach : list)
			if (sach instanceof SachGiaoKhoa)
				sum += sach.tinhThanhTien();
		return sum;

	}

	 double tinhTongThanhTienSTK() {
		double sum = 0;
		for (Sach sach : list)
			if (sach instanceof SachThamKhao)
				sum += sach.tinhThanhTien();
		return sum;
	}

	 List<Sach> timSachGKCuaNXB( String nxb) {
		List<Sach> kq = new ArrayList<Sach>();
		for (Sach sach : list)
			if (sach instanceof SachGiaoKhoa && sach.getNhaXuatBan().equalsIgnoreCase(nxb))
				kq.add(sach);
		return kq;
	}

	 double timThanhTienMax() {
		double t = 0;
		for (int i = 0; i < count; i++) 
		{
			if (t <  list[i].tinhThanhTien())
				t = list[i].tinhThanhTien();
		}
		return t;
	}

	@Override
	public String toString() {
		String s = SachGiaoKhoa.getTieuDe() + "\n";
		for (int i = 0; i < list.length; i++) {
			if (list[i] instanceof SachGiaoKhoa)
				s += list[i] + "\n";
		}
		s += SachThamKhao.getTieuDe() + "\n";
		for (int i = 0; i < list.length; i++) {
			if (list[i] instanceof SachThamKhao)
				s += list[i] + "\n";
		}
		return s;
	}
}
