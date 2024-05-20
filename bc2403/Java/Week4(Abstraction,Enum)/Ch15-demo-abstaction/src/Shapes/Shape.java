package Shapes;

import java.math.BigDecimal;

public interface Shape {
    // 100% abstraction -> No any implementation in interface
    // Interface is a CONTRACT that the class should implement it
    // 啲個Contract一定要履行所有行為 先可以順利compile

    // No instance variable in interface
    // You can only define "public static final" variable in interface
    // public static final String s = "hello"; // or below - much elegant
    String s = "hello";
    BigDecimal PI = BigDecimal.valueOf(Math.PI);

    // Implicitly public
    double area();

    String print();

    // static method, with implementation class
    // public static double area(Square[] Squares) {

    // }

    // public static double area(Circle[] circles) {

    // }

    public static double area(Shape[] shapes) {
        BigDecimal sum = BigDecimal.valueOf(0.0);
        for(Shape shape : shapes) {
            sum = sum.add(BigDecimal.valueOf(shape.area()));
        }
        return sum.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(Shape.s);
        System.out.println(Shape.PI.doubleValue());

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Circle();

        System.out.println(shapes[0]);





    }


}
