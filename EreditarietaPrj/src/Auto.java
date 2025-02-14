public class Auto extends Veicolo {

    public void accendi() {
        System.out.println("Auto accendi");
    }

    @Override
    public void muovi() {
        System.out.println("Gira motore");
    }
}
