// Package
 package concessionaria;

//Import dello scanner
import java.util.Scanner;

// Classe main
public class Main {

    // Array paralleli
    static String[] marche = new String[100];
    static String[] modelli = new String[100];
    static double[] prezzi = new double[100];
    static int numAuto = 0;
    static String marca;
    static String modello;
    static double prezzo = 0;


    // Menù
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int scelta;
        do {
            System.out.println("\nMENU'");
            System.out.println("1. Aggiungi un'auto");
            System.out.println("2. Visualizza tutte le auto");
            System.out.println("3. Cerca un'auto");
            System.out.println("4. Cancella un'auto");
            System.out.println("5. Modifica i dati di un'auto");
            System.out.println("6. Visualizza le auto in ordine crescente");
            System.out.println("7. Visualizza i modelli diesel");
            System.out.println("0. Esci");
            System.out.print("Inserisci la tua scelta: ");
            scelta = in.nextInt();
            in.nextLine();

            // Switch
            switch (scelta) {
                case 1:
                    System.out.print("Inserisci la marca dell'auto: ");
                    marca = in.nextLine();
                    System.out.print("Inserisci il modello dell'auto: ");
                    modello = in.nextLine();
                    System.out.print("Inserisci il prezzo dell'auto: ");
                    prezzo = in.nextDouble();
                    in.nextLine();

                    int aggiungi = Funzioni.aggiungiAuto(marche, modelli,prezzi,numAuto,modello,marca,prezzo);
                    System.out.println("auto aggiunta con successo");
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 0:
                    System.out.println("Chiusura del menù");
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
            // Chiusura menù
        } while (scelta != 0);
    }
}
