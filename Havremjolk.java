public class Havremjolk extends Produkt {
    private double fetthalt;
    private double litermängd;

    public Havremjolk(double fetthalt, double litermängd) {
        this.namn = "Havremjölk";
        this.fetthalt = fetthalt;
        this.litermängd = litermängd;
    }

    public Havremjolk(String fetthalt2, String litermängd2) {
    }

    @Override
    public void skrivInfo() {
        System.out.println("Produkt: " + namn);
        System.out.println("Fetthalt: " + fetthalt);
        System.out.println("Litermängd: " + litermängd);
    }
}