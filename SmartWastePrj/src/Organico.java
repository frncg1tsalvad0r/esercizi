import java.time.LocalDate;

public class Organico extends Cassonetto {
    private double peso;

    public Organico(double peso, int codice, double latitudine,double longitudine, LocalDate dataInstallazione) {
        super(codice, latitudine, latitudine, dataInstallazione);
        this.peso = peso;

    }

    

}
