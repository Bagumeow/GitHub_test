package hinh;

import java.util.Scanner;

public class MainCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.print("Nhap Radius :");
        double radius = sc.nextDouble();
        System.out.print("Nhap color :");
        String color = sc.nextLine();
        Circle c1 = new Circle(radius, color);*/
        Circle c1 = new Circle(10,"pink");
        System.out.println(c1.toString());
    }

}
