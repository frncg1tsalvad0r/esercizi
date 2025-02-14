
public class Passeggeri extends Vagone {
    protected int classe;
    protected int numeroPostiDisponibili;
    protected int numeroPostiOccupati;

    /**
     * Costruttore
     * @param codice
     * @param pesoAVuoto
     * @param aziendaCostruttrice
     * @param annoDiCostruzione
     * @param classe
     * @param numeroPostiDisponibili
     * @param numeroPostiOccupati
     */
    public Passeggeri(int codice, double pesoAVuoto, String aziendaCostruttrice, int annoDiCostruzione,
            int classe, int numeroPostiDisponibili, int numeroPostiOccupati) {

        super(codice, pesoAVuoto, aziendaCostruttrice, annoDiCostruzione);
        this.classe = classe;
        this.numeroPostiDisponibili = numeroPostiDisponibili;
        this.numeroPostiOccupati = numeroPostiOccupati;
    }
    
    @Override
    public String getFigurina() {
        return "Passeggeri("+ this.codice + ")<-";
    }

    @Override
    public double getPesoEffettivo() {
        
        return this.pesoAVuoto + this.numeroPostiOccupati*65;
    }
}
