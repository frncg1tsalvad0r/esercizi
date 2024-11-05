public class Libro {
    // Attributi della classe
    private String titolo;
    private String autore;
    private int numeroPagine;
    private static double costoPagina = 0.05;
    final double COSTO_FISSO = 5.5;

    /**
     * Costruttore con parametri 
     * @param titolo
     * @param autore
     * @param numeroPagine
     */
    public Libro(String titolo, String autore, int numeroPagine) {
        this.titolo = titolo;
        this.autore = autore;
        this.numeroPagine = numeroPagine;
    }

    /**
     * Costruttore di copia
     * @param other Libro 
     */
    public Libro(Libro other) {
        this.autore = other.autore;
        this.titolo = other.titolo;
        this.numeroPagine = other.numeroPagine;
    }

    // SETTER
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public static void setCostoPagina(double costoPagina) {
        Libro.costoPagina = costoPagina;
    }

    // GETTER
    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public static double getCostoPagina() {
        return costoPagina;
    }

    @Override
    public String toString() {
        return "Libro [titolo=" + titolo + ", autore=" + autore + ", numeroPagine=" + numeroPagine + "]";
    }
   
    
}
