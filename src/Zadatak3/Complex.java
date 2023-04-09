package Zadatak3;

public class Complex {
    private int real;
    private int imaginary;

    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(final int real, final int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int Re() {
        return real;
    }

    public int Im() {
        return imaginary;
    }

    public Complex add(Complex z1) {
        return new Complex(this.real + z1.Re(), this.imaginary + z1.Im());
    }

    public Complex subtract(Complex z1) {
        return new Complex(this.real - z1.Re(), this.imaginary - z1.Im());
    }

    public void printComplex() {
        if (this.real != 0 && this.imaginary == 0) {
            System.out.println(this.real);
        } else if (this.real == 0 && this.imaginary != 0) {
            System.out.println(this.imaginary + "i");
        } else if (this.real == 0 && this.imaginary == 0) {
            System.out.println("0");
        } else if (this.real != 0 && this.imaginary != 0) {
            System.out.println(this.real + " + " + this.imaginary + "i");
        }
    }
}
