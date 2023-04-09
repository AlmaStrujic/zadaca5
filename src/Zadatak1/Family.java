package Zadatak1;

public class Family {
    private String familyName;
    private int NrOfMembers;
    private double monthSpend;

    public Family(final String familyName, final int NrOfMembers) {
        this.familyName = familyName;
        this.NrOfMembers = NrOfMembers;
        this.monthSpend = 0;
    }

    public Family(final String familyName, final int NrOfMembers, final double monthSpend) {
        this.familyName = familyName;
        this.NrOfMembers = NrOfMembers;
        this.monthSpend = monthSpend;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName() {
        this.familyName = familyName;
    }

    public int getNrOfMembers() {
        return NrOfMembers;
    }

    public void setNrOfMembers() {
        this.NrOfMembers = NrOfMembers;
    }

    public double getMonthSpend() {
        return monthSpend;
    }

    public void setMonthSpend() {
        this.monthSpend = monthSpend;
    }

    public double increaseSpend (){
        return monthSpend + 111.65;
    }

    public void printFamilySpend() {
        System.out.println("Family spend in a month = " + this.monthSpend + " KM");
    }
}
