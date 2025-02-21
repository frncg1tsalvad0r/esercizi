

abstract public class Vagone {
    protected int codice;
    protected double pesoAVuoto;
    protected String aziendaCostruttrice;
    protected int annoDiCostruzione;

    /**
     * Costruttore
     * @param codice
     * @param pesoAVuoto
     * @param aziendaCostruttrice
     * @param annoDiCostruzione
     */
    public Vagone(int codice, double pesoAVuoto, String aziendaCostruttrice, int annoDiCostruzione) {
        this.codice = codice;
        this.pesoAVuoto = pesoAVuoto;
        this.aziendaCostruttrice = aziendaCostruttrice;
        this.annoDiCostruzione = annoDiCostruzione;
    }

    @Override
    public String toString() {
        return "Treno [codice=" + codice + ", pesoAVuoto=" + pesoAVuoto + ", aziendaCostruttrice=" + aziendaCostruttrice
                + ", annoDiCostruzione=" + annoDiCostruzione + "]";
    }

    abstract public String toCSV();
    
    abstract public String getFigurina();

    abstract public double getPesoEffettivo();
    
}
