
public class App {
    public static void main(String[] args) throws Exception {

        /*
         * ll.size(); // dimensione della lista
         * ll.get(int indice);
         * ll.remove(indice):
         * ll.addFirst(ll);
         * ll.addLast();
         * ll.toString();
         */
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

        lii.remove(5);
    }
}
