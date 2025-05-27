public class App {
    public static void main(String[] args) {
        /*
        GrafoPesato gp = new GrafoPesato(4);
        gp.addArco(0, 3, 6);
        gp.addArco(0, 1, 9);
        gp.addArco(1, 2, 8);
        gp.stampa();
        */

        GrafoPesato g = new GrafoPesato(4);
        g.carica();
        g.stampa();

        
        Percorso p = new Percorso(g);
        p.visitaDFS(0);
        p.stampa();
        
        int[] passi = p.percorso(5, 0);
        for (int i : passi) {
            System.out.println(i);
        }

    }
}
