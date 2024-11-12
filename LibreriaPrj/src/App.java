import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //System.out  // Flusso verso la console
        //System.in   // Flusso dalla tastiera
        
        // Butta il byte grezzo di valore 49 sullo stream di output
        System.out.write(49);

        // Butta il byte grezzo di valore 49 sullo stream di output
        System.out.write(49);

        // Butta il byte grezzo di valore 49 sullo stream di output
        System.out.write(56);

        // Butta il byte grezzo di valore 0x0A(esadecimale) sullo 
        // stream di output (è il ritorno a capo)
        System.out.write(0x0A);

        // Metodo sovraccaricato che stampa un numero intero
        System.out.print(110);

        // Metodo sovraccaricato che stampa un numero float
        System.out.print(118.6); 

        // Metodo sovraccaricato che stampa una stringa
        System.out.print("Ciao");
        
        // Legge un byte grezzo dallo stream di ingresso System.in 
        // (che arriva dalla tastiera)
        int carattere1 = System.in.read();
        // Legge un byte grezzo dallo stream di ingresso System.in 
        // (che arriva dalla tastiera)
        int carattere2 = System.in.read();
        int carattere3 = System.in.read();

        // 
        System.out.print(carattere1);
        System.out.print(carattere2);
        System.out.print(carattere3);
        
        // La classe scanner legge da uno stream e
        // interpreta i byte grezzi come caratteri alfanumerici
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ITALIAN);

        // nextFloat interpreta i byte che codificano dei caratteri
        // alfanumerici in un numero float
        float valore = sc.nextFloat();
        System.out.println(valore);


        // Creo un libro
        Libro l1 = new Libro("Il conte di Montecristo", "Dumas", 400);
        
        // Creo un altro libro
        Libro l2 = new Libro("La divina commedia", "Dante", 800);

        Mensola m1 = new Mensola();
        if(m1.setLibro(l1, 0) < 0)
            System.out.println("Errore di inserimento del libro " + l1);
        if(m1.setLibro(l2, 4) < 0)
            System.out.println("Errore di inserimento del libro " + l2);

        // *******************************
        // Stampare i libri della mensola
        // utilizzando i metodi a disposizione
        // di mensola.
        // *******************************

        // Primo metodo
        for(int i=0;i<m1.getLibri().length;i++){
            if(m1.getLibri()[i]!=null){
                System.out.println(m1.getLibri()[i]);
            }
        }

        // Secondo metodo
        for(int i=0;i<m1.getMaxNumLibri();i++){
            if(m1.getLibro(i)!=null){
                System.out.println(m1.getLibro(i));

            }
        }

        // Terzo metodo
        Libro[] presenti = m1.getLibriPresenti();
        for(int i = 0; i<presenti.length; i++) {
            System.out.println(presenti[i]);
        }
            
    }
}
