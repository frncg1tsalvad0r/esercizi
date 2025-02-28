
public class App {
    public static void main(String[] args) throws Exception {

        /*
        ll.size(); // dimensione della lista
        ll.get(int indice); 
        ll.remove(indice):
        ll.addFirst(ll);
        ll.addLast();
        ll.toString();
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

        System.out.println("Posizione 2");
        System.out.println(lii.get(2));
    }
}
