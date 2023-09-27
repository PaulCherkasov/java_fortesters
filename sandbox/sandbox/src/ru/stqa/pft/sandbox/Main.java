package ru.stqa.pft.sandbox;

public class Main {
    public static void main(String[] args) {
        hello("world");

        double len = 6;
        System.out.println("Площадь равна " + len + " * " + len + " = " + area(len));

        double a = 6;
        double b = 8;
        System.out.println("Reactangle area " + a + " * " + b + " = " + area(a,b));
    }
    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }
    public static double area(double l) {
        return l * l;
    }
    public static double area(double a, double b) {
        return a * b;
    }
}