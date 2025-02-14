import java.time.LocalDate;

public class Switch {
    static final int NUMERO_PORTE = 24;
    String modello;
    static final String MARCA = "CISCO";
    double prezzo;
    LocalDate dataDiAcquisto;
    int anniDiGaranzia;
  
    /**
     * Costruttore semplice
     * @param modello
     * @param prezzo
     * @param dataDiAcquisto
     * @param anniDiGaranzia
     */ 
    public Switch(String modello, double prezzo, LocalDate dataDiAcquisto, int anniDiGaranzia) {
        this.modello = modello;
        this.prezzo = prezzo;
        this.dataDiAcquisto = dataDiAcquisto;
        this.anniDiGaranzia = anniDiGaranzia;
    }

    /**
     * Getter e setter
     */
    public String getModello() {
        return modello;
    }
    
    public double getPrezzo() {
        return prezzo;
    }
    public LocalDate getDataDiAcquisto() {
        return dataDiAcquisto;
    }
    public int getAnniDiGaranzia() {
        return anniDiGaranzia;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setDataDiAcquisto(LocalDate dataDiAcquisto) {
        this.dataDiAcquisto = dataDiAcquisto;
    }

    public void setAnniDiGaranzia(int anniDiGaranzia) {
        this.anniDiGaranzia = anniDiGaranzia;
    }

    /**
     * Metodo toString
     * @return String la stringa descrittiva
     */
    @Override
    public String toString() {
        return "Switch [modello=" + modello + ", prezzo=" + prezzo + ", dataDiAcquisto=" + dataDiAcquisto
                + ", anniDiGaranzia=" + anniDiGaranzia + "]";
    }

    
    
}
