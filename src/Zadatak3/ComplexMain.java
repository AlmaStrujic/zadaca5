package Zadatak3;

public class ComplexMain {
    public static void main (String[] args) {
        final Complex z = new Complex(2,-3);

        System.out.println(z.Re());
        System.out.println(z.Im());

        final Complex z1 = new Complex ( 10, -1);

        final Complex z2 = z.add(z1);
        z2.printComplex();

        final Complex z3 = z.subtract(z1);
        z3.printComplex();
    }
}
