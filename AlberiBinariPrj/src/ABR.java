public class ABR {
    private Nodo radice;

    /**
     * L'albero binario di ricerca è un albero binario in cui i valori associati ai nodi
     * sono tali per cui per ogno nodo, i valori del sottoalbero di sinstra sono tutti minori
     * e i valori del sottoalbero di destra sono tutti maggiori.
     */
    public ABR() {
        this.radice = null;
    }

     /**
     * Stampa dell'albero nel formato nodo (figli sinistro, figlio destro)
     * @param radice del sottoalbero
     */
    public void stampa() {
        stampaNodo(this.radice);
    }

    /**
     * Stampa dell'albero nel formato nodo (figli sinistro, figlio destro)
     * @param radice del sottoalbero
     */
    private void stampaNodo(Nodo nodo) {
        if (nodo == null) {
            System.out.print("-");
            return;
        }

        System.out.print(nodo.valore);
        System.out.print("(");
        stampaNodo(nodo.sinistro);
        System.out.print(",");
        stampaNodo(nodo.destro);
        System.out.print(")");

    }

    /**
     * Inserisce il nodo nell'ABR
     * Forma ricorsiva di inserimento
     * @param valore
     */
    public void inserisciRicorsivo(int valore) {
        if(this.radice == null) {
            radice = new Nodo(valore);
        } else {
            inserisciNodoRicorsivo(valore, this.radice);
        }
    }

    private void inserisciNodoRicorsivo(int valore, Nodo padre) {

        if (padre.valore > valore) {
            // vado a sinistra
            if (padre.sinistro == null) {
                padre.sinistro = new Nodo(valore);
                return;
            } 
            inserisciNodoRicorsivo(valore, padre.sinistro);
            

        }
        if (padre.valore < valore) {
            // vado a destra
            if (padre.destro == null) {
                padre.destro = new Nodo(valore);
                return;
            } 
            inserisciNodoRicorsivo(valore, padre.destro);
        } 

        
    }

     /**
     * Inserisce il nodo nell'ABR
     * Forma iterativa di inserimento
     * @param valore
     */
    public void inserisci(int valore) {
        if(this.radice == null) {
            this.radice = new Nodo(valore);
        }

        Nodo corrente = this.radice;
        while(true) {
            if(corrente.valore > valore) {
                // vado a sinistro
                if(corrente.sinistro == null) {
                     corrente.sinistro = new Nodo(valore);
                     return;
                }
                corrente = corrente.sinistro;
            }
            else {
               
                // vado a destra
                if(corrente.destro == null) {
                     corrente.destro = new Nodo(valore);
                     return;
                }
                corrente = corrente.destro;
            }
        }
        
    }

}
