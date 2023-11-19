import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final var produktHanterare = new ProduktHanterare();

        while (true) {
            System.out.println("Välkommen till Multifabriken!");
            System.out.println("1. Skapa en bil");
            System.out.println("2. Skapa godis");
            System.out.println("3. Skapa ett rör");
            System.out.println("4. Lista alla produkter");
            System.out.println("5. Avsluta");

            int val = scanner.nextInt();
            scanner.nextLine();

            switch (val) {
                case 1:
                    produktHanterare.skapaBil(scanner);
                    break;
                case 2:
                    produktHanterare.skapaGodis(scanner);
                    break;
                case 3:
                    produktHanterare.skapaRör(scanner);
                    break;

                case 4:
                    produktHanterare.listaAllaProdukter();
                    break;
                case 5:
                    System.out.println("Programmet avslutas. Hej då!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ogiltigt val. Försök igen.");
            }
        }
    }
}