public class App {
    public static void main(String[] args) throws Exception {
        Veicolo v = new Auto();
        ((Bici)v).pedala();
    }
}
