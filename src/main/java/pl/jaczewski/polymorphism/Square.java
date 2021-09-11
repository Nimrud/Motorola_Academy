package pl.jaczewski.polymorphism;

public class Square extends Figure{

    @Override
    double area() {
        return getA() * getA();
    }

    @Override
    double doubleSides() {
        return getA() * getA() * 4;
    }
}
