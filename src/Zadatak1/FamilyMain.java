package Zadatak1;

public class FamilyMain {
    public static void main (String[] args) {
        final Family family = new Family("Hodzic", 4);
        final Family family1 = new Family("Smith", 3, 1876.39);

        family.printFamilySpend();
        family1.printFamilySpend();

        family.setFamilyName ();
        family.setNrOfMembers ();
        System.out.println("If family spends 111.65 KM more, their monthly spend will increase to " + family1.increaseSpend() + " KM");

    }
}
