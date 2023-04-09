package Zadatak2;

public class Rectangle {
    private double a;
    private double b;

    public Rectangle(final double a, final double b) {
        this.a = a;
        this.b = b;
    }

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

    public double getCircumference() {
        return 2 * a + 2 * b;
    }

    public double getArea() {
        return a * b;
    }

    public boolean isSquare() {
        return a == b;
    }

    public void printCircumference() {
        System.out.println("Rectangle circumference is: " + getCircumference());
    }

    public void printArea() {
        System.out.println("Rectangle area is: " + getArea());
    }
}

