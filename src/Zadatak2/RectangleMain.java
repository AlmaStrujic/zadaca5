package Zadatak2;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12.5, 19.46);

        rectangle.printCircumference();
        rectangle.printArea();
        rectangle.isSquare();

        if (rectangle.isSquare()){
            System.out.println("The shape is a square");
        } else {
            System.out.println("The shape is not a square");}

    } }
