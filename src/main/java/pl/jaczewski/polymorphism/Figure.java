package pl.jaczewski.polymorphism;

public abstract class Figure {
    double a;
    double b;
    abstract double area();
    abstract double doubleSides();

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
