package Vidu;

public class Test {
    public static void main(String[] args) {
        PolyLine pl = new PolyLine(10);
        pl.appendPoint(new Point(1, 5));
        pl.appendPoint(new Point(1, 3));
        System.out.println(pl);
    }
    
}
