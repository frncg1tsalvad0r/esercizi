public class App {
    public static void main(String[] args) throws Exception {
        ABR abr = new ABR();

        abr.inserisciRicorsivo(10);
        abr.inserisciRicorsivo(20);
        abr.inserisciRicorsivo(5);
        abr.inserisciRicorsivo(1);
        abr.inserisciRicorsivo(4);
        abr.inserisci(50);
        abr.inserisci(0);
        abr.stampa();
    }
}
