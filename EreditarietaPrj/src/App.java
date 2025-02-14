public class App {
    public static void main(String[] args) throws Exception {
        Veicolo veicoli[] = new Veicolo[3];

        veicoli[0] = new Auto();
        veicoli[1] = new Bici();
        veicoli[2] = new Veicolo();


        for (int i = 0; i < veicoli.length; i++) {
            veicoli[i].muovi();
        }

        /*
        for (Veicolo veicolo : veicoli) {
            veicolo.muovi();
        }
            */
    }
}
