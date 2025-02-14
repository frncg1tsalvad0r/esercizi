import java.time.LocalDate;

public class Altro extends Cassonetto {
    private double volumeOccupato;

    public Altro (int codice, double latitudine,double longitudine, LocalDate dataInstallazione) {
        super(codice, latitudine, longitudine, dataInstallazione);
        volumeOccupato = 0;
    }


}
