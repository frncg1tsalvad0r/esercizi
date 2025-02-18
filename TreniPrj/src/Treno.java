public class Treno {
    Vagone[] vagoni;
    protected int numeroVagoni;

    /**
     * 1) inserimento in una determinata posizione, restituire true o false. 
     * 2) metodo di rimozione data la posizione, restituisce l'oggetto rimosso (se trovato) , 
     * altrimenti null. 
     * 3) ricerca di un vagone dato il codice : "se è un vagone passeggeri" restituire la "classe" 
     * , se invece è un "vagone merci" restituire l'azienda costruttrice. 
     * 4) calcolo della quantità di posti liberi che ci sono per ogni vagone.
     */
    /**
     * Costruttore. Il treno ha al massimo 100 vagoni
     */
    public Treno() {
        this.numeroVagoni = 0;
        this.vagoni = new Vagone[100];
    }

    /**
     * Aggiuta in coda al treno di un vagone generico
     * @param vagono da inserire nell'aggregato
     * @return true se correttamente inserito
     */
    public boolean aggiugiVagone(Vagone v) {
        if(numeroVagoni >= 100) {
            return false;
        }
        this.vagoni[this.numeroVagoni] = v;
        this.numeroVagoni++;
        return true;
    }

    @Override
    public String toString() {
        String t = "";
        for(int i = 0; i < this.numeroVagoni; i++) {
            t += this.vagoni[i].getFigurina();
            /* 
            if(this.vagoni[i] instanceof Merci) {
                t += "Merci("  + this.vagoni[i].codice + ")<-";
            } else if(this.vagoni[i] instanceof Passeggeri){
                t += "Passeggeri("  + this.vagoni[i].codice + ")<-";
            }
            */
        }
        return t;
        
    }

    public double getPesoComplessivo() {
        double pesoComplessivo = 0;
        for(int i = 0; i < this.numeroVagoni; i++) {
            pesoComplessivo += this.vagoni[i].getPesoEffettivo();
        }
        return pesoComplessivo;
    }

    /**
     * Inserimento in una determinata posizione, restituire true o false. 
     * Se ha senso ritorno true
     * Se non ha senso ritono false
     * 
     */
    public boolean inserisciVagone(int posizione, Vagone vagone) {
        if (posizione < 0 || posizione > this.numeroVagoni)
            return false;
        
        // Ricordatevi di partire dalla fine altrimenti perdo i riferimenti dei successivi
        // Sposta avanti tutti gli elementi
        for (int i = this.numeroVagoni-1; i >= posizione; i--) {
                this.vagoni[i+1] = this.vagoni[i];
        }   
        this.vagoni[posizione] =vagone;
        this.numeroVagoni++;
        return true;
    }

    /**
     * Rimozione data la posizione, restituisce l'oggetto rimosso 
     * (se trovato) altrimenti null.
     */
    Vagone rimuoviVagone(int posizione) {
        if (posizione < 0 || posizione > this.numeroVagoni)
            return null;

        Vagone rimosso = this.vagoni[posizione];

        // Sposto tutti i riferimenti in avanti di uno a
        // partire dalla posizione
        for(int i = posizione; i < this.numeroVagoni; i++) {
            this.vagoni[i] = this.vagoni[i+1];
        }
        this.numeroVagoni--;
        return rimosso;
    }

    void salvaSuFile() {
        //TODO: da implementare
    }
}
