public class Bil extends Produkt {
    private String registreringsnummer;
    private String farg;
    private String bilmärke;

    public Bil(String registreringsnummer, String farg, String bilmärke) {
        this.namn = "Bil";
        this.registreringsnummer = registreringsnummer;
        this.farg = farg;
        this.bilmärke = bilmärke;
    }

    @Override
    public void skrivInfo() {
        System.out.println("Produkt: " + namn);
        System.out.println("Registreringsnummer: " + registreringsnummer);
        farg = farg.replace("å", "\u00e5");
        System.out.println("Färg: " + farg);

        System.out.println("Bilmärke: " + bilmärke);
    }
}
