
public class Merci extends Vagone {
    protected double volumeDiCarico;
    protected double pesoEffettivoCarico;
    protected double pesoMassimoCarico;

    /**
     * 
     * @param codice
     * @param pesoAVuoto
     * @param aziendaCostruttrice
     * @param annoDiCostruzione
     * @param volumeDiCarico
     * @param pesoEffettivoCarico
     * @param pesoMassimoCarico
     */
    public Merci(int codice, double pesoAVuoto, String aziendaCostruttrice, int annoDiCostruzione,
            double volumeDiCarico, double pesoEffettivoCarico, double pesoMassimoCarico) {
        super(codice, pesoAVuoto, aziendaCostruttrice, annoDiCostruzione);
        this.volumeDiCarico = volumeDiCarico;
        this.pesoEffettivoCarico = pesoEffettivoCarico;
        this.pesoMassimoCarico = pesoMassimoCarico;
    }
    @Override 
    public String getFigurina(){
        return "Merci(" + this.codice + ")<-";
    }

    @Override
    public double getPesoEffettivo() {// TODO Auto-generated method stub
        return this.pesoEffettivoCarico;
    }
}
