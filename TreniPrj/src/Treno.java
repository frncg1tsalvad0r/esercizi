public class Treno {
    Vagone[] vagoni;
    protected int numeroVagoni;

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

}
