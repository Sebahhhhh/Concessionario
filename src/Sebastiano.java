import java.util.Scanner;

public class Sebastiano {

    static String[] marche = new String[100];
    static String[] modelli = new String[100];
    static double[] prezzi = new double[100];
    static int numAuto = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        aggiungiAuto(scanner);
    }

    private static void aggiungiAuto(Scanner scanner) {
        if (numAuto < marche.length) {
            System.out.print("Inserisci la marca dell'auto: ");
            marche[numAuto] = scanner.nextLine();

            System.out.print("Inserisci il modello dell'auto: ");
            modelli[numAuto] = scanner.nextLine();

            System.out.print("Inserisci il prezzo dell'auto: ");
            prezzi[numAuto] = scanner.nextDouble();
            scanner.nextLine();

            numAuto++;
            System.out.println("Auto aggiunta correttamente.");
        } else {
            System.out.println("La concessionaria è piena.");
        }
    }
}

