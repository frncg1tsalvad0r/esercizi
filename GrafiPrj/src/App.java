public class App {
    public static void main(String[] args) {
        GrafoPesato gp = new GrafoPesato(4);
        gp.addArco(0, 3, 6);
        gp.addArco(0, 1, 9);
        gp.addArco(1, 2, 8);
        gp.stampa();
    }
}
