package Vidu;

public class DanhMucHoaDon {
    private HoaDon[] list;
    private int count;
    public DanhMucHoaDon(int n){
        list = new HoaDon[n];
        count =0;
    }
    public boolean themHoaDon(HoaDon hd1) {
        if (count>=list.length){
            return false;
        }else {
            list[count++]=hd1;
            return true;
        }
    }
}
