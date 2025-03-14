public class ListaLincata<T> {
    private Nodo<T> testa = null;
    private int contaNodi;
    
    public ListaLincata() {
        this.testa = null;
        this.contaNodi = 0;
    }

    /**
     * Inserisce un elemento in testa alla lista lincata
     * @param dato
     */
    public void addFirst(T dato){
        Nodo<T> nuovo = new Nodo<>();
        nuovo.valore = dato;
        nuovo.successivo = testa;
        testa = nuovo;

        this.contaNodi++;
    }

    @Override
    public String toString() {
        String s = "";
        Nodo<T> corrente = this.testa;

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
        Nodo<T> corrente = null;
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
    void addLast(T dato) {
        Nodo<T> nuovo = new Nodo<>();
        nuovo.valore = dato;
        nuovo.successivo = null;

        if(this.testa == null){
            this.testa = nuovo;
        } else {
            Nodo<T> corrente = this.testa;
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
    public Object removeFirst() {
        if(this.testa == null) {
            // la lista è vuota e decido cosa fare
            throw new RuntimeException("Lista vuota");

        }
        Object tmp =this.testa.valore;
        this.testa = this.testa.successivo;
        this.contaNodi--;
        return tmp;

    }

    /**
     * Rimuove l'elemento in coda alla lista lincata
     * @return
     */
    public Object removeLast() {
        if(this.testa == null) {
            // la lista è vuota e decido cosa fare
            throw new RuntimeException("Lista vuota");

        }
        // Ho almeno un elemento nella lista


        if(this.testa.successivo == null) {
            // Sono nel caso in cui ho un sol valore
            Object tmp =  this.testa.valore;
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

        
        Nodo<T> corrente = this.testa;
        while(corrente.successivo.successivo != null) {
            corrente = corrente.successivo;
        }
        //Punta al penultimo
        Object tmp = corrente.successivo.valore;
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
    public T get(int posizione) {
        int conta = 0;
        Nodo<T> corrente = this.testa;
        
        
        while(true) {
            if(corrente == null)
                throw new RuntimeException();

            if(conta == posizione) {
                return corrente.valore;
            }
            corrente = corrente.successivo;
            conta++;
            
        }

    }

    
    /**
     * Rimuove un nodo dalla lista  nella posizione indicata e restituisce il 
     * valore del nodo
     * @param posizione
     * @return valore alla posisione indicata
     */
    public Object remove(int posizione) {

        if (this.testa == null)
            throw new RuntimeException();
        
        if(posizione == 0) {
            Object tmp = this.testa.valore;
            this.testa = this.testa.successivo;
            this.contaNodi--;
            return tmp;
        }

        Nodo<T> prima = this.testa;
        int indice = 1;
        while(true) {
            if(prima.successivo == null)
                throw new RuntimeException();

            if(posizione == indice) {
                Object tmp = prima.successivo.valore;
                prima.successivo = prima.successivo.successivo;
                this.contaNodi--;
                return tmp;
            }
            prima = prima.successivo;
            indice++;
        }
        

    }

    /**
     * Aggiunge un nodo nella posizone indicata con il valore passato come parametro
     * @param posizione
     * @param valore
     */
    public void add(int posizione, T valore) {

        if (posizione < 0 || posizione > size())
            throw new RuntimeException();

        // Aggiungo in testa
        if(posizione == 0) {
            Nodo<T> nuovo = new Nodo<>();
            nuovo.valore = valore;
            nuovo.successivo = testa;
            testa = nuovo;
            this.contaNodi++;
            return;
        }

        Nodo<T> corrente = testa;
        int i = 1;
        // Caso generale
        while(true) {
            if(posizione == i) {
                Nodo<T> nuovo = new Nodo<T>();
                nuovo.valore = valore;
                nuovo.successivo = corrente.successivo;
                corrente.successivo = nuovo;

                this.contaNodi++;
                return;
            }
            i++;
            corrente = corrente.successivo;
        }
    }
    
}
