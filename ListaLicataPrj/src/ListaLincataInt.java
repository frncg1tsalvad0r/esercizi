public class ListaLincataInt {
    private Nodo testa = null;
    private int contaNodi;
    
    public ListaLincataInt() {
        this.testa = null;
        this.contaNodi = 0;
    }

    /**
     * Inserisce un elemento in testa alla lista lincata
     * @param dato
     */
    public void addFirst(int dato){
        Nodo nuovo = new Nodo();
        nuovo.valore = dato;
        nuovo.successivo = testa;
        testa = nuovo;

        this.contaNodi++;
    }

    @Override
    public String toString() {
        String s = "";
        Nodo corrente = this.testa;

        while(true) {
            if(corrente == null)
                break;
            
            s += corrente.valore + " ";
            
            corrente = corrente.successivo;
        }

        /*
        while(corrente == null) {
            s += corrente.valore + " ";
            corrente = corrente.successivo;
        }
         */
        return s;
    }

    /** 
     * Ritorna il numero di elementi della lista lincata
     * @return la dimensione della lista lincata
     */
    public int size() {
        /*
        Non uso il contatore aggiornato ma
        conto i nodi uno ad uno
        return this.contaNodi;
         */
        int conta = 0;
        Nodo corrente = null;
        corrente = this.testa;
        
        
        while(true) {
            if (corrente == null) {
                break;
            }
            conta++;
            corrente = corrente.successivo;
        }   
        return conta;
    }

    /**
     * Aggiunge un elemento in coda alla lista
     * @param dato
     */
    void addLast(int dato) {
        Nodo nuovo = new Nodo();
        nuovo.valore = dato;
        nuovo.successivo = null;

        if(this.testa == null){
            this.testa = nuovo;
        } else {
            Nodo corrente = this.testa;
            while(true){
                if(corrente.successivo == null)
                    break;
                corrente = corrente.successivo;
            }
            corrente.successivo = nuovo;
        }
        this.contaNodi++;
    }

    /**
     * Rimuovere l'elemento in testa alla lista
     * @return
     */
    public int removeFirst() {
        if(this.testa == null) {
            // la lista è vuota e decido cosa fare
            throw new RuntimeException("Lista vuota");

        }
        int tmp =this.testa.valore;
        this.testa = this.testa.successivo;
        this.contaNodi--;
        return tmp;

    }

    /**
     * Rimuove l'elemento in coda alla lista lincata
     * @return
     */
    public int removeLast() {
        if(this.testa == null) {
            // la lista è vuota e decido cosa fare
            throw new RuntimeException("Lista vuota");

        }
        // Ho almeno un elemento nella lista


        if(this.testa.successivo == null) {
            // Sono nel caso in cui ho un sol valore
            int tmp =  this.testa.valore;
            this.testa = null;
            return tmp;
        } 

        /*
        Nodo corrente = this.testa;

        while(true) {
            if (corrente.successivo.successivo == null) {
                //Punta al penultimo
                int tmp = corrente.successivo.valore;
                corrente.successivo = null;
                return tmp;
            }
            corrente = corrente.successivo;
        }
        */

        
        Nodo corrente = this.testa;
        while(corrente.successivo.successivo != null) {
            corrente = corrente.successivo;
        }
        //Punta al penultimo
        int tmp = corrente.successivo.valore;
        corrente.successivo = null;
        this.contaNodi--;
        return tmp;
        
    }

    /**
     * Ritorna l'elemento in posizione data di una lista
     * Ovviamente se la lista è vuota dovrebbe dare una eccezione
     * Se la posizione è fuori range dovrebbe dare una eccezione
     * @param posizione
     * @return
     */
    public int get(int posizione) {
        return 0;
    }


    
}
