package Vidu;

public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] xy = new float[2];
        xy[0] = this.x;
        xy[1] = this.y;
        return xy;
    }

    public double distance() {
        double s = 0;
        s = Math.sqrt(x * x + y * y);
        return s;
    }
    public double distance(int x, int y) {
        double s = 0;
        s = Math.sqrt((this.x - x)*(this.x - x) + (this.y - y)*(this.y - y));
        return s;
    }
    public double distance(Point p) {
        double s = 0;
        s = Math.sqrt(Math.pow((p.x - x),2) + Math.pow((p.y - y), 2));
        return s;
    }

    public String toString() {
        return String.format("(%d,%d)", x, y);
    }

}
