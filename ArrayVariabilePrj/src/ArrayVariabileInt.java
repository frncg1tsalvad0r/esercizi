public class ArrayVariabileInt
{

    private int[] array;
    private int lunghezza;

    /**
     * Costruttore senza parametri. Inizializza un
     * array generico di 10 elementi
     */
    public ArrayVariabileInt() {
        this.array = new int[5];
        this.lunghezza = 0;
    }

    /**
     * Metodo che ritorna l'elemento alla posizione specificata
     * @param posizione
     */
    public int get (int posizione) {
        if(posizione < 0 || posizione >= lunghezza) {
            throw new RuntimeException();
        }
        return array[posizione];
    }

    /**
     * Ritorna la lunghezza dell'array
     * @return
     */
    public int size() {
        return lunghezza;
    }

    /**
     * Setta il valore nella posizone specificata
     * @param valore
     * @param posizione
     */
    public void set(int posizione, int valore) {
        if (posizione < 0 || posizione >= lunghezza) {
            throw new RuntimeException();
        }
        this.array[posizione] = valore;
    }

    /**
     * Aggiunge un valore in coda all'array
     */
    public void add(int valore) {
        array[lunghezza] = valore;
        lunghezza++;

        if(lunghezza == this.array.length) {
            int[] nuovoArray = new int[array.length * 2];

            for(int i = 0; i < array.length; i++) {
                nuovoArray[i] = array[i];
            }

            this.array = nuovoArray;
        }
    }

    /**
     * Ritorna la stringa descrittiva dell'array
     */
    public String toString() {
        String s="[";
        for(int i=0; i<lunghezza; i++) {
            s += array[i];
            if(i<lunghezza-1) {
                s += ", ";
            }
        }
        s+="]";
        return s;
    }

    /**
     * Svuota l'array
     */
    public void clear() {
        this.array = new int[5];
        this.lunghezza = 0;
    }

    public void add(int index, int dato) {
        if(index < 0 || index > lunghezza) {
            throw new RuntimeException();
        }

        if(lunghezza == this.array.length) {
            int[] nuovoArray = new int[array.length * 2];

            for(int i = 0; i < array.length; i++) {
                nuovoArray[i] = array[i];
            }

            this.array = nuovoArray;
        }

        for(int i = lunghezza; i > index; i--) {
            array[i] = array[i-1];
        }

        array[index] = dato;
        lunghezza++;

    }

    /**
     * Rimuove l'elemento alla posizione specificata
     * @param index
     * @return elemento rimosso
     */
    public int remove(int index) {
        if(index < 0 || index >= lunghezza) {
            throw new RuntimeException();
        }

        int valore = array[index];

        for(int i = index; i < lunghezza-1; i++) {
            array[i] = array[i+1];
        }

        lunghezza--;
        

        return valore;
    }

    /**
     * Rimuove l'elemento in testa
     * @return elemento rimosso
     */
    public int removeFirst() {
        if(lunghezza == 0) {
            throw new RuntimeException();
        }

        int valore = array[0];

        for(int i = 0; i < lunghezza-1; i++) {
            array[i] = array[i+1];
        }

        lunghezza--;

        return valore;
    }

    /**
     * Rimuove l'elemento in coda
     * @return elemento rimosso
     */
    public int removeLast() {
        if(lunghezza == 0) {
            throw new RuntimeException();
        }

        int valore = array[lunghezza];

        lunghezza--;

        return valore;
    }

}
