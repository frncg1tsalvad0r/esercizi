public class Studente extends Object {
    public static int id;
    private int matricola;
    private String nome;
    private String cognome;
    private int eta;

    /**
     * 
     * @param matricola
     * @param nome
     * @param cognome
     * @param eta
     */
    public Studente(int matricola, String nome, String cognome, int eta) {
        this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public Studente() {
        this.matricola = 0;
        this.nome ="";
        this.cognome ="";
        this.eta = 0;
    }

    public Studente(Studente other) {
        this.matricola = other.matricola;
        this.nome = other.nome;
        this.cognome = other.cognome;
        this.eta = other.eta;
    }

    
    // Getter e setter degli attributi
    public int getMatricola() {
        return matricola;
    }
    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public int getEta() {
        return eta;
    }
    public void setEta(int eta) {
        if (eta < 0)
            return;
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "Studente [matricola=" + matricola + ", nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + "]" + super.toString();
    }

    public Studente clone() {
        return new Studente(this.matricola, this.nome, this.cognome, this.eta);
    }
    

}
