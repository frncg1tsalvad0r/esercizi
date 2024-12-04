public class Porto {

    private Barca[] barche;

    /**
     * Costruttore che definisce la dimensione del porto
     * @param dim
     */
    public Porto(int dim) {
        if(dim < 50) {
            dim = 50;
        }
        this.barche = new Barca[dim];
    }

    /**
     * Inserisce scegliendo in modo automatico la posizione
     * della barca in base alle caratteristiche
     * @param barca
     * @return la posizione della barca inserita e -1 se errore
     */
    public int assegnaPostoAutomatico(Barca barca){

        // Le barche a vela vanno dalla posizione 30 in poi
        if(barca.getTipologia() == Barca.VELA) {
            for(int i = 30; i < barche.length; i++) {
                if(barche[i] == null) {
                    // Trovato un buco e posso inserire una barca
                    barche[i] = barca;
                    return i;
                }
            }
            return -1;
        }

        // Guardo se è una barca più lunga di 10 m
        if(barca.getLunghezza() >= 10){
            for(int i = 20; i < barche.length; i++) {
                if(barche[i] == null) {
                    // Trovato un buco e posso inserire una barca
                    barche[i] = barca;
                    return i;
                }
            }
            return -1;
        }
        // Sono sicuro che non sono barche a vela o barche 
        // più lunghe di 10m
        for(int i = 0; i < barche.length; i++) {
            if(barche[i] == null) {
                // Trovato un buco e posso inserire una barca
                barche[i] = barca;
                return i;
            }
        }
        return -1;
    }

    /**
     * 
     * @param barca
     * @param posizione (valore negativo se errore)
     * @return valore di ritorno.
     */
    public int assegnaPostoFisso(Barca barca, int posizione){
        // Le barche a vela vanno dalla posizione 30 in poi
        if(barca.getTipologia() == Barca.VELA) {
            if(posizione >= 30 && posizione < barche.length) {
                if(barche[posizione] == null) {
                    // Trovato un buco e posso inserire una barca
                    barche[posizione] = barca;
                    return posizione;
                }
            }
            return -1;
        }

         // Guardo se è una barca più lunga di 10 m che vanno dopo la posizione 20
        if(barca.getLunghezza() >= 10){
            if(posizione >= 20 && posizione <= barche.length) {
                if(barche[posizione] == null) {
                    // Trovato un buco e posso inserire una barca
                    barche[posizione] = barca;
                    return posizione;
                }
            }
            return -1;
        }
        // Sono sicuro che non sono barche a vela o barche 
        // più lunghe di 10m
        if(posizione < barche.length) {
            if(barche[posizione] == null) {
                // Trovato un buco e posso inserire una barca
                barche[posizione] = barca;
                return posizione;
            }
        }
        return -1;

    }
    
    // Stampa del porto
    public void stampaSituazionePorto() {
       
        for(int i = 0; i < this.barche.length; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
            if(this.barche[i] != null) {
                if(this.barche[i].getTipologia() == Barca.VELA) {
                    System.out.print("MOT");
                } else if(this.barche[i].getTipologia() == Barca.MOTORE) {
                    System.out.print("VEL");
                } else {
                    // Niente
                }
            } else {
                System.out.print("___");
            }
            
        }
        System.out.println();
    }
}
