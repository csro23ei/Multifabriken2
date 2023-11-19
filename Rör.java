public class Rör extends Produkt {
    private double diameter;
    private double längd;

    public Rör(double diameter, double längd) {
        this.namn = "Rör";
        this.diameter = diameter;
        this.längd = längd;
    }

    @Override
    public void skrivInfo() {
        System.out.println("Produkt: " + namn);
        System.out.println("Diameter: " + diameter + " mm");
        System.out.println("Längd: " + längd);
    }
}