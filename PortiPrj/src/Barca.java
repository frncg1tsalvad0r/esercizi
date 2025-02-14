import java.time.LocalDate;

public class Barca {
    public final static int VELA = 0;
    public final static int MOTORE = 1;
    private String nome;
    private String nazionalita;
    private double lunghezza;
    private double stazza; 
    private int tipologia; // 0 = VELA 1= MOTORE
    private LocalDate dataOrmeggio;

    /**
     * Costruttore con parametri per la creazione dell'oggetto
     * @param nome
     * @param nazionalita
     * @param lunghezza
     * @param stazza
     * @param tipologia
     * @param dataOrmeggio
     */
    public Barca(String nome, String nazionalita, double lunghezza, double stazza, int tipologia,
            LocalDate dataOrmeggio) {
        super();
        this.nome = nome;
        this.nazionalita = nazionalita;
        this.lunghezza = lunghezza;
        this.stazza = stazza;
        this.tipologia = tipologia;
        this.dataOrmeggio = dataOrmeggio;
    }

    public Barca() {
        this.nome = "";
        this.nazionalita = "";
        this.lunghezza = 1;
        this.stazza = 1;
        this.tipologia = 1;
        this.dataOrmeggio = LocalDate.now();
    }

    // GETTER
    public String getNome() {
        return nome;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public double getStazza() {
        return stazza;
    }

    public int getTipologia() {
        return tipologia;
    }

    public LocalDate getDataOrmeggio() {
        return dataOrmeggio;
    }

        
    // SETTER
    public void setDataOrmeggio(LocalDate dataOrmeggio) {
        this.dataOrmeggio = dataOrmeggio;
    }

    @Override
    public String toString() {
        return "Barca [nome=" + nome + ", nazionalita=" + nazionalita + ", lunghezza=" + lunghezza + ", stazza="
                + stazza + ", tipologia=" + tipologia + ", dataOrmeggio=" + dataOrmeggio + "]";
    }

    
    
}
