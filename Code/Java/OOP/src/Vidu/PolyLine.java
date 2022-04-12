package Vidu;

public class PolyLine {
    private Point[] points;
    private int count;// so luong points hien tai

    public PolyLine(int n) {
        points = new Point[n];
        count = 0;
    }

    public PolyLine(Point[] p) {
        points = p;
        count = p.length;
    }

    /**
     * them point p vao polyline
     * 
     */
    public void appendPoint(Point p) {
        if (count < points.length)
            points[count++] = p;
    }

    public void appendPoint(int x, int y) {
        points[count++] = new Point(x, y);
    }

    public int getLength() {
        return count;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < count; i++) {
            s += points[i];
        }
        return String.format("{%s}", s);
    }
}
