package hinh;

public class Circle  {
    private double radius;
    private String color;
    public void setRadius(double radius) {
        if (radius <0)
            this.radius=1;
        else 
            this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setColor(String color){
        if (!color.equals(""))
            this.color = color ;
        else 
        this.color ="red";
    }
    public String getColor() {
        return color;
    }
    public Circle(){
        radius=1;
        color = "red";
    }
    public Circle(double radius){
        setRadius(radius);
    }
    public Circle(double radius,String color){
        setRadius(radius);
        setColor(color);
    }
    public double getArea() {
        return Math.PI*radius*radius;
    }
    public String toString() {
        return String.format("\nRadius ="+this.radius+"\nColor ="+this.color+"\nArea ="+this.getArea());
    }
    
    
}
