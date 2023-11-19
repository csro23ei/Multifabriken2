public class Godis extends Produkt {
    private String smak;
    private String antal;

    public Godis(String smak, String form) {
        this.namn = "Godis";
        this.smak = smak;
        this.antal = form;
    }

    @Override
    public void skrivInfo() {
        System.out.println("Produkt: " + namn);
        System.out.println("Smak: " + smak);
        System.out.println("Antal: " + antal);
    }
}
