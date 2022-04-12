package Module2;

public class ToaDo {
    private String ten;
    private float x;
    private float y;

    public ToaDo() {
        this("chua xac dinh",0, 0);
    }

    public ToaDo(String ten ,float x, float y) {
        setTen(ten);
        setX(x);
        setY(y);
    }   
    public void setTen(String ten) {
        if (!ten.equals(""))
            this.ten = ten;
        else 
            this.ten="chua xac dinh";
    }
    public String getTen() {
        return ten;
    }
    public void setX(float x) {
        this.x = x;
    }

    public float getX() {
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public String toString() {
        return String.format("%s(%.0f,%.0f)",ten, x, y);
    }

}
