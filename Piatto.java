import java.util.Scanner;

public class Piatto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Benvenuto al nostro ristorante");

        System.out.println("Nome del piatto:");
        String nomepiatto = sc.nextLine();

        System.out.println("descrizione del piatto:");
        String descrizione= sc.nextLine();

        System.out.println("prezzo:");
        double prezzo = sc.nextDouble();
        
        System.out.println("disponibilità:");
        boolean disponibilità = sc.nextBoolean();

        System.out.println("tipologia(antipasto,primo,secondo,contorno,dessert):");
        String tipologia= sc.nextLine();

        System.out.println("allergeni:");
        String allergeni= sc.nextLine();

        System.out.println("calorie:");
        short calorie = sc.nextShort();
        sc.nextLine(); // Consumo il carattere di fine riga

        System.out.println("foto:");
        String foto = sc.nextLine();

        System.out.println("variazioni:");
        String variazioni = sc.nextLine();
    

        sc.close();

        // ------------------------------------------------------------------

        System.out.println("Il piatto che hai scelto:");

        // VERSIONE 1
        System.out.println("Nome del piatto: " + nomepiatto);
        System.out.println("descrizione del piatto:" + descrizione);

        // VERSIONE 2
        // System.out.println("Titolo: " + titolo + "\n" + Autore: " + autore);

        System.out.println("prezzo: " + prezzo);
        System.out.println("disponibilità: " + disponibilità);
        System.out.println("tipologia(antipasto,primo,secondo,contorno,dessert): " + tipologia);
        System.out.println("allergeni: " + allergeni);
        System.out.println("calorie: " + calorie);
        System.out.println("foto: " + foto);
        System.out.println("variazioni: " + variazioni);
    
    }
}