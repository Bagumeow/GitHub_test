package hinh;

public class HinhChuNhat {
    private float cDai;
    private float cRong;
    public HinhChuNhat(){
        
    }
    public HinhChuNhat(float cDai,float cRong){
        setChieuDai(cDai);
        setChieuRong(cRong);
    }
    public void setChieuDai(float cDai) {
        if(cDai>0)
            this.cDai=cDai;
        else 
            this.cDai=0;
    }
    public float getChieuDai() {
        return cDai;
    }
    public void setChieuRong(float cRong){
        if(cRong>0)
            this.cRong = cRong;
        else 
            this.cRong= 0;
    }
    public float getChieuRong() {
        return cRong;
    }
    public float tinhChuVi() {
        if (cDai == 0 || cRong == 0){
            return 0;
        } else {
            return (cDai+cRong)*2;
        }
    }
    public float tinhDienTich() {
            return cDai*cRong;
    }
    public String toString() {
        return String.format("Hinh Chu Nhat, cdai =%5.2f ,crong =%5.2f",cDai,cRong);
    }
}
