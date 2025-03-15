import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {

        Queue q = new LinkedList();
        Deque d = new LinkedList();
        /*
         * L'ArrayList è una classe nativa Java
         * molto utilizzata. Nella nostra progettazione
         * ne faremo con un'interfaccia simile 
         * che 
         * ll.size(); // dimensione della lista
         * ll.get(int indice);
         * ll.remove(indice):
         * ll.addFirst(ll);
         * ll.addLast();
         * ll.toString();
         */
        ArrayList<String> al = new ArrayList<>();
        al.add("Ciao");


        ListaLincataInt lii = new ListaLincataInt();
        lii.addFirst(15);
        lii.addFirst(20);
        lii.addFirst(30);
        lii.addLast(999);

        System.out.println(lii.toString());
        System.out.println("Il numero di elementi è " + lii.size());

        lii.removeFirst();
        System.out.println("Rimosso l'elemento in testa");
        System.out.println(lii.toString());

        lii.removeLast();
        System.out.println("Rimosso l'elemento in coda");
        System.out.println(lii.toString());

        System.out.println("Posizione 0");
        System.out.println(lii.get(0));

        System.out.println("Posizione 1");
        System.out.println(lii.get(1));

        /*
         * Questo lancerebbe un'eccezione perchè sforo la dimensione della lista
         * System.out.println("Posizione 2");
         * System.out.println(lii.get(2));
         */

        System.out.println("Aggiungi 10 alla fine");
        lii.addLast(10);
        System.out.println(lii.toString());

        System.out.println("Rimuovi l'elemento nella posizione 2");
        System.out.println(lii.remove(2));
        System.out.println(lii.toString());

        System.out.println("Aggiungi 33 alla fine");
        lii.addLast(33);
        System.out.println(lii.toString());

        System.out.println("Rimuovi l'elemento nella posizione 1");
        System.out.println(lii.remove(1));
        System.out.println(lii.toString());

        System.out.println("Aggiungi 44 alla fine");
        lii.addLast(44);
        System.out.println(lii.toString());
        

        System.out.println("Rimuovi l'elemento nella posizione 0");
        System.out.println(lii.remove(0));
        System.out.println(lii.toString());
        

        System.out.println("Inserisci un elemento nella posizione 0");
        lii.add(0, 555);
        System.out.println(lii.toString());

        System.out.println("Inserisci un elemento nella posizione 1");
        lii.add(1, 111);
        System.out.println(lii.toString());

        System.out.println("Inserisci un elemento nella posizione 2");
        lii.add(2, 222);
        System.out.println(lii.toString());

        System.out.println("Inserisci un elemento nella posizione 4");
        lii.add(4, 333);
        System.out.println(lii.toString());

        System.out.println("Inserisci un elemento nella posizione 6 ovvero in coda");
        lii.add(6, 888);
        System.out.println(lii.toString());
    }
}
