import java.util.Scanner;


public class EntryPoint {
    public static void main(String[] args) {
        // Legge dalla tastiera dei dati
        // Crea dei libri 
        // Inserisce nella mensola
        Mensola m = new Mensola();

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci i dati del libro");

        System.out.println("Inserisci il numero di pagine");
        int numeroPagine = sc.nextInt();
        sc.nextLine(); // Toglie il ritono a capo che era rimasto dentro
        System.out.println("Inserisci il titolo");
        String titolo = sc.nextLine();
        System.out.println("Inserisci il autore");
        String autore = sc.next();




        // Creeremo un oggetto di tipo libro 
        Libro l = new Libro(titolo, autore, numeroPagine);

        // Inseriremo dentro una mensola.
        int errcode = m.setLibro(l, 4);
        if(errcode >=0 ) {
            System.out.println("Libro inserito con successo");
        } else {
            System.out.println("Qualcosa è andato storto");
        }

        // Stampiamo la lista dei libri presenti
        System.out.println("*********LISTA LIBRI***********");
        for(int i = 0; i<m.getMaxNumLibri(); i++) {
            Libro libroTemp = m.getLibro(i);
            if(libroTemp != null) {
                // Stampiamo il libro
                System.out.println(libroTemp.toString());
            }

        }
        System.out.println("********************************");
    }
}
