public class ArrayVariabileInt
{

    private int[] arrayInt;
    private int lunghezza;

    /**
     * Costruttore senza parametri. Inizializza un
     * array generico di 10 elementi
     */
    public ArrayVariabileInt() {
        this.arrayInt = new int[5];
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
        return arrayInt[posizione];
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
        this.arrayInt[posizione] = valore;
    }

    /**
     * Aggiunge un valore in coda all'array
     */
    public void add(int valore) {
        arrayInt[lunghezza] = valore;
        lunghezza++;

        if(lunghezza == this.arrayInt.length) {
            int[] nuovoArray = new int[arrayInt.length * 2];

            for(int i = 0; i < arrayInt.length; i++) {
                nuovoArray[i] = arrayInt[i];
            }

            this.arrayInt = nuovoArray;
        }
    }

    /**
     * Ritorna la stringa descrittiva dell'array
     */
    public String toString() {
        String s="[";
        for(int i=0; i<lunghezza; i++) {
            s += arrayInt[i];
            if(i<lunghezza-1) {
                s += ", ";
            }
        }
        s+="]";
        return s;
    }
}
