public class Docente {

    private String nome;
    private String cognome;
    private int eta;
    private int codice;
    private static int nc=10;
    private String materia;


    public Docente(String nome,String cognome,int eta,String materia){
        this.nome=nome;
        this.cognome=cognome;
        this.materia=materia;
        this.eta=eta;
        this.codice=Docente.nc;
        Docente.nc++;
    }

    public Docente(Docente d){
        this.nome=d.nome;
        this.cognome=d.cognome;
        this.materia=d.materia;
        this.eta=d.eta;
        this.codice=Docente.nc;
        Docente.nc++;
    }


    //getter
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getEta() {
        return eta;
    }

    public int getCodice() {
        return codice;
    }

    public String getMateria() {
        return materia;
    }


    //setter

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }


    public String descrizione(){
        return "Docente [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", codice=" + codice + ", materia="
            + materia + "]";
    }

    
    


}
