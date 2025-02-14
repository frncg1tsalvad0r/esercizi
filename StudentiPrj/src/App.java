
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       
        Scuola scuola = new Scuola();
        Scanner sc = new Scanner(System.in);

        int matricola = sc.nextInt();
        String nome = sc.next();
        String cognome = sc.next();
        int eta = sc.nextInt();

        Studente st = new Studente(matricola,nome, cognome,eta);


        int matricola1 = sc.nextInt();
        String nome1 = sc.next();
        String cognome1 = sc.next();
        int eta1 = sc.nextInt();
        
        Studente st1 = new Studente(matricola1,nome1, cognome1,eta1);

        scuola.inserisciStudente(st);
        scuola.inserisciStudente(st1);
        scuola.stampaScuola();

        System.out.println("Dammi la matricola da rimuovere: ");
        int matricolaDaRimuovere = sc.nextInt();
        if(scuola.rimuoviStudenteByMatricola(matricolaDaRimuovere) != null) {
            System.out.println("Studente rimosso ");
        } else {
            System.out.println("Studente NON trovato ");
        }
        System.out.println("-----------------------------------");
        scuola.stampaScuola();
        

    }
}
