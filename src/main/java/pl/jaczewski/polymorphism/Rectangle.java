package pl.jaczewski.polymorphism;

public class Rectangle extends Figure {

    @Override
    double area() {
        return getA() * getB();
    }

    @Override
    double doubleSides() {
        return getA() * 2 * getB() * 2;
    }
}
