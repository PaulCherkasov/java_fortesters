package ru.stqa.pft.sandbox;

public class Main {
    public static void main(String[] args) {
        hello("world");

        Square s = new Square(6);
        System.out.println("Площадь равна " + s.l + " * " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(6,9);
        System.out.println("Rectangle area " + r.a + " * " + r.b + " = " + r.area());
    }
    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }


}