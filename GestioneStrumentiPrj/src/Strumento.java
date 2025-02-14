public class Strumento {

    private int numId;
    private String descrizione;
    private double costo;
    private int annoAcquisto;
    private int anniGaranzia;
    private static int newId = 0;
    
    public Strumento(String descrizione, double costo, int annoAcquisto, int anniGaranzia){
        this.descrizione = descrizione;
        this.costo = costo;
        this.anniGaranzia = anniGaranzia;
        this.annoAcquisto = annoAcquisto;
        Strumento.newId++;
        this.numId = Strumento.newId;
    }

}
