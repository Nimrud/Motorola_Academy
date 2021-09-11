package pl.jaczewski.polymorphism;

public class Main {
    public static void main(String[] args) {
        Figure square = new Square();
        square.setA(15);
        System.out.println("Area (square) = " + square.area());
        System.out.println("Double sides area (square) = " + square.doubleSides());

        System.out.println("====");

        Figure rectangle = new Rectangle();
        rectangle.setA(10);
        rectangle.setB(12);
        System.out.println("Area (rectangle) = " + rectangle.area());
        System.out.println("Double sides area (rectangle) = " + rectangle.doubleSides());
    }
}
