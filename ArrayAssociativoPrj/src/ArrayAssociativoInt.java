import javax.management.RuntimeErrorException;

/**
 * Implementazione triviale di un array associativo con dimensione finita
 */
public class ArrayAssociativoInt {
    private String[] chiavi;
    private int[] valori;

    /**
     * Costruttore
     * @param la dimensione dell'array associativo
     */
    public ArrayAssociativoInt(int dim) {
        this.chiavi = new String[dim];
        this.valori = new int[dim];
    }

    /**
     * Inserisce la coppia chiave valore. 
     * Se la chiave esiste, sostituisce il valore.
     * Se la chiave non esiste allora inserisce la coppia chiave valore
     * @param chiave
     * @param valore
     * @throws RuntimeErrorException se il contenitore è pieno
     */
    public void put(String chiave, int valore) {
        for(int i = 0; i < this.chiavi.length; i++) {

            if(this.chiavi[i] != null && this.chiavi[i].equals(chiave)) {
                // Trovata la chiave
                this.valori[i] = valore;
                return;
            }

        }

        // La chiave non è stata trovata. Cerco di inserirla nel primo posto disponibile
        for(int i = 0; i < this.chiavi.length; i++) {

            if(this.chiavi[i] == null) {
                // Trovato un posto libero
                this.chiavi[i] = chiave;
                this.valori[i] = valore;
                return;
            }

        }

        // Purtroppo tutti i posti sono occupati
        throw new RuntimeException();
    }

    /**
     * Ritorna il valore corrispondente alla chiave
     * @param chiave
     * @return valore
     * @throws RuntimeErrorException se la chiave non è stata trovata
     */
    public int get(String chiave) {

        for(int i = 0; i < this.chiavi.length; i++) {

            if(this.chiavi[i] != null && this.chiavi[i].equals(chiave)) {
                // Trovata la chiave
                return this.valori[i];
            }

        }

        // Purtroppo la chiave non è stata trovata
        throw new RuntimeException();
    }

    /**
     * Funzione di utilità per vedere la situazione degli array di chiavi e di valori
     * per monitorare come funziona il tutto
     */
    public void stampa() {
        for(int i = 0; i < this.chiavi.length; i++) {
            System.out.println(i + ": " + this.chiavi[i] + "->" + this.valori[i]);
        }
    }
}
