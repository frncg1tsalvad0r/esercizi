import javax.management.RuntimeErrorException;

public class HashAssociativoInt {
   private String[] chiavi;
    private int[] valori;

    /**
     * Costruttore
     * @param la dimensione dell'array associativo
     */
    public HashAssociativoInt(int dim) {
        this.chiavi = new String[dim];
        this.valori = new int[dim];
    }

    /**
     * Calcola un numero hash sulla chiave
     * @param chiave
     * @return hash della chiave
     */
    public int hash(String chiave) {
        /* 
         * La hash è calcolata come somma dei valori dei codice dei caratteri
         */
        int somma = 0;
        for(int i = 0; i < chiave.length(); i++) {
            somma = somma + chiave.charAt(i);
        }

        // Prendendo il resto della divisione con la dimensione del contenitore mi assicura che
        // la hash ha valore valido come indice del contenitore
        return somma % this.chiavi.length;
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

        int posizione = hash(chiave);
        
        int corrente = posizione;

        // La chiave esiste ma non è la stessa
        // nella posizione corrente può esserci un valore diverso da null con valore !=
        // da quello cercato
        // Può esserci un valore null
        while(true) {
            if(chiavi[corrente] != null && chiavi[corrente].equals(chiave)) {
                // La chiave esiste ed è la stessa
                this.valori[corrente] = valore;
                return;
    
            }

            if(this.chiavi[corrente] == null) {
                this.chiavi[corrente] = chiave;
                this.valori[corrente] = valore;
                return;
            }

            // Banalmente aumente l'indice e se esso sfora la dimensione dell'array
            // prendo il modulo dell'indice ovvero riparto da 0
            corrente++;
            corrente = corrente % this.chiavi.length;
            if(corrente == posizione)
                throw new RuntimeException();
        }

     }

    /**
     * Ritorna il valore corrispondente alla chiave
     * @param chiave
     * @return valore
     * @throws RuntimeErrorException se la chiave non è stata trovata
     */
    public int get(String chiave) {

        int posizione = hash(chiave);

        int corrente = posizione;

        while(true) {
            if(this.chiavi[corrente] != null && this.chiavi[corrente].equals(chiave)) {
                return this.valori[corrente];

            }

            // Banalmente aumente l'indice e se esso sfora la dimensione dell'array
            // prendo il modulo dell'indice ovvero riparto da 0
            corrente++;
            corrente = corrente % this.chiavi.length;
            if(corrente == posizione)
                throw new RuntimeException();
        }


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
