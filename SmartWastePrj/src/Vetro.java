import java.time.LocalDate;

public class Vetro extends Cassonetto {
    private int numeroBottiglie;


    public Vetro(int codice, double latitudine,double longitudine, LocalDate dataInstallazione) {
        super(codice, latitudine, longitudine, dataInstallazione);
        this.numeroBottiglie = 0;
    }

    public Vetro() {
        super(0,0,0,LocalDate.now());
        this.numeroBottiglie = 0;
    }

    @Override
    public double getLatitudine() {
        return this.latitudine + 1;
    }
}
