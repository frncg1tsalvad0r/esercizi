// Il programma mostra un menù con varie opzioni
// 0 ESCI
// 1 Visualizza libri
// 2 Inserisci libro nella mensola
// 3 Rimuovi libro dalla mensola

import java.util.Scanner;

public class Principale {

    public static void stampaMenu() {
        System.out.println("**************************");
        System.out.println("0) ESCI");
        System.out.println("1) VISUALIZZA LIBRI");
        System.out.println("2) INSERISCI LIBRO NELLA MENSOLA");
        System.out.println("3) RIMUOVI LIBRO DALLA MENSOLA");
        System.out.println("**************************");
        System.out.print("SCELTA: ");
    }

    public static void main(String[] args) {
        Mensola mensola = new Mensola();

        Scanner sc = new Scanner(System.in);

        while (true) {
            stampaMenu();
            int scelta = sc.nextInt();
            sc.nextLine();  // Svuota il buffer dai \n
            if (scelta == 0) {
                // Esco
                break;
            } else if (scelta == 1) {
                // Viasualizza libri
                System.out.println("********VISUALIZZA LIBRI*********");
                Libro[] libriPresenti =mensola.getLibriPresenti();
                if(libriPresenti.length == 0) {
                    System.out.println("Nessun libro presente");
                } else {
                    for(int i =0; i < libriPresenti.length; i++) {
                        System.out.println(libriPresenti[i].toString());
                    }
                    System.out.println("**********************************");
                }

            } else if (scelta == 2) {
                // Inserisci libri
                System.out.println("*******INSERIMENTO LIBRO***********");
                System.out.print("Titolo: ");
                String titolo = sc.nextLine();
                System.out.print("Autore: ");
                String autore = sc.nextLine();
                System.out.print("Numero Pagine: ");
                int numeroPagine = sc.nextInt();
                Libro l = new Libro(titolo, autore, numeroPagine);

                System.out.print("Dammi la posizione nella mensola: ");
                int posizione = sc.nextInt();
                int errCodeInserimento = mensola.setLibro(l, posizione);
                if(errCodeInserimento == -1) {
                    System.out.println("Impossibile inserire un libro nella mensola: posizione non valida");
                } else if (errCodeInserimento == -2) {
                    System.out.println("Impossibile inserire un libro nella mensola: libro già presente nella posizione " + posizione);
                } else {
                    System.out.println("Libro inserito correttamente nella posizione "+ posizione);
                }

            } else if (scelta == 3) {
                // Rimuovi libri
                System.out.println("*******RIMOZIONE LIBRO***********");
                System.out.print("Dammi la posizione nella mensola: ");
                int posizione = sc.nextInt();
                Libro l = mensola.rimuoviLibro(posizione);
                if(l == null) {
                    System.out.println("Errore nella rimozione: posizione non corretta");
                } else {
                    System.out.println("Libro " + l.toString());
                    System.out.println("rimosso correttamente");
      
                }
            }
            
        }
        sc.close();
        
}}
