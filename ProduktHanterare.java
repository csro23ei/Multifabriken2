import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProduktHanterare {
    private List<Produkt> produkter;

    public ProduktHanterare() {
        this.produkter = new ArrayList<>();
    }

    public void skapaBil(Scanner scanner) {
        System.out.println("Ange registreringsnummer:");
        String registreringsnummer = scanner.nextLine();
        System.out.println("Ange färg:");
        String farg = scanner.nextLine();
        System.out.println("Ange bilmärke:");
        String bilmärke = scanner.nextLine();

        Bil bil = new Bil(registreringsnummer, farg, bilmärke);
        produkter.add(bil);
        System.out.println("Bil skapad!");
    }

    public void skapaGodis(Scanner scanner) {
        System.out.println("Ange smak:");
        String smak = scanner.nextLine();
        System.out.println("Ange Antal:");
        String antal = scanner.nextLine();

        Godis godis = new Godis(smak, antal);
        produkter.add(godis);
        System.out.println("Mhh låter gott");
    }

    public void skapaRör(Scanner scanner) {
        System.out.println("OBS! ingen enhet krävs men ange måtten i milimeter");
        System.out.println("Ange diameter:");
        int diameter = scanner.nextInt();
        System.out.println("Ange längd:");
        int längd = scanner.nextInt();

        Rör rör = new Rör(diameter, längd);
        produkter.add(rör);
        System.out.println("Vi ska tillverka ditt rör");
    }

    public void skapaHavremjolk(Scanner scanner) {
        System.out.println("Ange fetthalt:");
        String fetthalt = scanner.nextLine();
        System.out.println("Ange litermängd:");
        String litermängd = scanner.nextLine();

        Havremjolk Havremjölk = new Havremjolk(fetthalt, litermängd);
        produkter.add(Havremjölk);
        System.out.println("Havremjölken blndas");
    }

    public void listaAllaProdukter() {
        if (produkter.isEmpty()) {
            System.out.println("Inga produkter har beställts ännu.");
        } else {
            System.out.println("Lista över alla produkter:");
            for (Produkt produkt : produkter) {
                if (produkt instanceof Bil) {
                    ((Bil) produkt).skrivInfo();
                } else if (produkt instanceof Godis) {
                    ((Godis) produkt).skrivInfo();
                } else if (produkt instanceof Rör) {
                    ((Rör) produkt).skrivInfo();
                }
                System.out.println("----------------------");
            }
        }
    }
}