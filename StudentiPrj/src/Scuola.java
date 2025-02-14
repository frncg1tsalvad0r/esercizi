public class Scuola {
    
    private Studente[] studenti;
    
    /**
     * Costruttore senza parametri
     */
    public Scuola() {
        this.studenti = new Studente[100];
    }

    /**
     * Costruttore dove definisco la dimensione dell'array di studenti
     * @param dim
     */
    public Scuola(int dim) {
        this.studenti = new Studente[dim];
    }

    /**
     * Inserire uno studente in un posto vuoto all'interno della scuola
     * @param studente
     * @return true se lo studente è stato inserito, false altrimenti
     * @return la posizione di inserimento o -1 se errore
     */
    public int inserisciStudente(Studente studente) {
        for(int i = 0; i < this.studenti.length; i++) {
            if(studenti[i] == null) {
                studenti[i] = studente;
                return i;
            }
        }
        return -1;
    }

    /**
     * Inserire uno studente in un posto vuoto all'interno della scuola
     * @param studente
     * @return true se lo studente è stato inserito, false altrimenti
     * @return la posizione di inserimento o lancia eccezione
     */
    public int inserisciStudenteEcc(Studente studente)  {
        for(int i = 0; i < this.studenti.length; i++) {
            if(studenti[i] == null) {
                studenti[i] = studente;
                return i;
            }
        }
        throw new RuntimeException();
    }

    /**
     * 
     * Ricerca studente dato il nome
     * @param nome
     * @return lo studente trovato
     */
    public Studente ricercaStudenteByName(String nome) {
        for(int i = 0; i < this.studenti.length; i++) {
            if(this.studenti[i] != null && this.studenti[i].getNome().equals(nome)) {
                return this.studenti[i];
            }
        }
        return null;
    }

    /**
     * 
     * @return un array di studenti
     */
    public Studente[] getStudenti() {
        int numeroStudentiPresenti = 0;
        for(int i = 0; i < this.studenti.length; i++) {
            if(this.studenti[i] != null) {
                numeroStudentiPresenti++; 
            }
        }
        Studente[] studentiPresenti = new Studente[numeroStudentiPresenti];
        int j = 0;
        for(int i = 0; i < this.studenti.length; i++) {
            if(this.studenti[i] != null) {
                studentiPresenti[j] = this.studenti[i];
                j++;
            }
        }

        return studentiPresenti;

    }

    /**
     * Rimuovere uno studente dalla scuola dato la sua matricola
     */
    public Studente rimuoviStudenteByMatricola(int matricola) {
        Studente tmp = null;
        for(int i = 0; i < this.studenti.length; i++) {
            if(this.studenti[i] != null && this.studenti[i].getMatricola() == matricola) {
                tmp = this.studenti[i];
                this.studenti[i] = null;
            }
        }

        return tmp;
    }

    /**
     * Stampa sulla console una lista di tutti gli studenti presenti nella scuola
     */
    public void stampaScuola() {
        for(int i = 0; i < this.studenti.length; i++) {
            if(this.studenti[i] != null) {
                System.out.println(this.studenti[i].toString());
            }
        }
    }
}
