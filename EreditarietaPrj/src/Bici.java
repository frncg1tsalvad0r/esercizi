public class Bici  extends Veicolo {
    public void pedala() {
        System.out.println("Bici pedala");
    }

    @Override
    public void muovi() {
        System.out.println("Gira pedali");
    }
}
