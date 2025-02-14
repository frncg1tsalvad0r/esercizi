public class Auto {

    /* codice, targa, marca e modello, numero di posti.  */

    private int codice;
    private String targa;
    private String marca;
    private String modello;
    private int numeroPosti;

    private static int newCodice=111;


    
    public Auto(int numeroPosti,String marca, String modello, String targa){
        this.codice=Auto.newCodice;
        Auto.newCodice++;
        this.marca=marca;
        this.modello=modello;
        this.targa=targa;
        this.numeroPosti=numeroPosti;
    }

    /* oggetto copia , ma il codice differisce da quello precedente */
    public Auto(Auto a){
        this.codice=Auto.newCodice;
        Auto.newCodice++;
        this.marca=a.marca;
        this.modello=a.modello;
        this.numeroPosti=a.numeroPosti;
        this.targa=a.targa;

    }
    
    
    
    /* setter solo per la targa */
    public void setTarga(String targa) {
        this.targa = targa;
    }

    /* getter */
    public int getCodice() {
        return codice;
    }
    public String getTarga() {
        return targa;
    }
    public String getMarca() {
        return marca;
    }
    public String getModello() {
        return modello;
    }
    public int getNumeroPosti() {
        return numeroPosti;
    }

    @Override
    public String toString() {
        return "Auto [codice=" + getCodice() + ", targa=" + getTarga() + ", marca=" + getMarca() + ", modello=" + getModello()
                + ", numeroPosti=" + getNumeroPosti() + "]";
    }


    


    




}
