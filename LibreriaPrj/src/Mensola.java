public class Mensola {
    private Libro[] libri;
    private static final int MAX_NUM_LIBRI = 25;

    /**
     * Costruttore della classe mensola
     */
    public Mensola() {
        this.libri = new Libro[MAX_NUM_LIBRI];
    }

    /**
     * Costruttore di copia. Copia oltre alle caratteristiche della 
     * mensola anche i libri della mensola stessa
     * @param other
     */
    /*
    public Mensola(Mensola other) {
        this.libri = new Libro[MAX_NUM_LIBRI];
        for (int i = 0; i < other.libri.length; i++) {
            if(other.libri[i] != null) {
                // Nella mensola che devo copiare c'è un libro nella posizione indicata
                this.libri[i] = new Libro(other.libri[i]);
            }
        }
    }
        */

    public Mensola(Mensola other) {
        this.libri = new Libro[MAX_NUM_LIBRI];
        for (int i = 0; i < other.libri.length; i++) {
            if(other.libri[i] != null) {
                // Nella mensola prendo i libri dell'altra mensola
                this.libri[i] = other.libri[i];
            }
        }
    }

    /**
     * Inserisco un libro nella posizione indicata
     * @param Libro da inserire
     * @param int posizione da inserire
     * @return -1 posizione non valida, -2 posizione occupata, >=0 posizione in cui 
     * viene inserito
     */
    public int setLibro(Libro libro, int posizione) {
        if(posizione >= this.libri.length || posizione < 0) {
            return -1;
        }
        if(this.libri[posizione] != null) {
            return -2;
        }

        this.libri[posizione] = libro;
        return posizione;
    }

    /**
     * Ritorna un libro nella posizione indicata
     * @param int posizione del libro da estrarre
     * @return null se errore (se il range non è valido sia se non c'è il libro)
     */
    public Libro getLibro(int posizione) {
        if(posizione < 0 || posizione >= this.libri.length){
            return null;
        }
        return this.libri[posizione];
    }

    /**
     * Rimuovi il libro in base alla posizione
     * @param int posizione
     * @return il libro rimosso
     */
    public Libro rimuoviLibro(int posizione) {
        if(posizione < 0 || posizione >= this.libri.length) {
            return null;
        }
        Libro tmp = this.libri[posizione];
        this.libri[posizione] = null;
        return tmp;
    }

    /**
     * Ritrona il numero massimo di volumi
     * @return il numero massimo di libri 
     */
    public int getMaxNumLibri() {
        return MAX_NUM_LIBRI;
    }

    /**
     * Conta il numero di libri che ci sono nella mensola
     * @return int numero di libri
     */
    public int getNumLibri() {
        int contaLibri = 0;
        for(int i = 0; i < this.libri.length; i++) {
            if(this.libri[i] != null)
                contaLibri++;
        }
        return contaLibri;
    }

    /**
     * Ritorna i riferimenti ai libri nella mensola
     * @return Array di libri con valori null dove non ci sono libri
     */
    public Libro[] getLibri() {
        return libri;
    }

    /**
     * Ritorna un array di riferimenti a libro grande 
     * quanto il numero di libri presenti nella mensola
     * @return Libro[] array di libri presenti
     */
    public Libro[] getLibriPresenti() {
        int n = this.getNumLibri();
        Libro[] presenti = new Libro[n];
        int j = 0;
        for (int i = 0; i < this.libri.length; i++) {
            if(libri[i] != null) {
                presenti[j] = this.libri[i];
                j++;
            }
        }
        return presenti;

    }

}
