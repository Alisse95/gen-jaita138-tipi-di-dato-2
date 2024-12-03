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
public class Ingredienti {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ecco gli ingredienti che abbiamo");

        System.out.println("Nome dell'ingrediente:");
        String nomeingrediente = sc.nextLine();

        System.out.println("descrizione dell'ingrediente:");
        String descrizione= sc.nextLine();

        System.out.println("tipologia:");
        byte tipologia = sc.nextByte();
        
        System.out.println("disponibilità:");
        boolean disponibilità = sc.nextBoolean();

        System.out.println("costo:");
        double costo= sc.nextDouble();

        System.out.println("allergeni:");
        String allergeni= sc.nextLine();

        System.out.println("modalità conservazione:");
        String conservazione = sc.nextLine();
        sc.nextLine(); // Consumo il carattere di fine riga

        System.out.println("foto:");
        String foto = sc.nextLine();
    

        sc.close();

        // ------------------------------------------------------------------

        System.out.println("Ingredienti:");

        // VERSIONE 1
        System.out.println("Nome dell'ingrediente: " + nomeingrediente);
        System.out.println("descrizione dell'ingrediente:" + descrizione);

        // VERSIONE 2
        // System.out.println("Titolo: " + titolo + "\n" + Autore: " + autore);

        System.out.println("tipologia: " + tipologia);
        System.out.println("disponibilità: " + disponibilità);
        System.out.println("costo " + costo);
        System.out.println("allergeni: " + allergeni);
        System.out.println("modalità conservazione: " + conservazione);
        System.out.println("foto " + foto);
    
    }
}
