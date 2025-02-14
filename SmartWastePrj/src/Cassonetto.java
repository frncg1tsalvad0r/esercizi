import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cassonetto extends Object {
    private int codice;
    protected double latitudine;
    private double longitudine;

    private LocalDate dataInstallazione;
    private LocalDateTime dataOraUltimoSvuotamento;

    /**
     * Costruttore con parametri
     * @param codice
     * @param latitudine
     * @param longitudine
     * @param dataInstallazione
     */
    public Cassonetto(int codice, double latitudine,double longitudine, LocalDate dataInstallazione) {
        super();
        this.codice = codice;
        this.latitudine = latitudine;
        this.longitudine = longitudine;
        this.dataInstallazione = dataInstallazione;
        this.dataOraUltimoSvuotamento = LocalDateTime.now();
    }


    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setLatitudine(double latitudine) {
        this.latitudine = latitudine;
    }

    public void setLongitudine(double longitudine) {
        this.longitudine = longitudine;
    }

    public void setDataInstallazione(LocalDate dataInstallazione) {
        this.dataInstallazione = dataInstallazione;
    }

    public void setDataOraUltimoSvuotamento(LocalDateTime dataOraUltimoSvuotamento) {
        this.dataOraUltimoSvuotamento = dataOraUltimoSvuotamento;
    }


    public int getCodice() {
        return codice;
    }


    public double getLatitudine() {
        return latitudine;
    }


    public double getLongitudine() {
        return longitudine;
    }


    public LocalDate getDataInstallazione() {
        return dataInstallazione;
    }


    public LocalDateTime getDataOraUltimoSvuotamento() {
        return dataOraUltimoSvuotamento;
    }


}
