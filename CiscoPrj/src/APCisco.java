import java.time.LocalDate;

public class APCisco {
    Switch[] switches;

    public APCisco(int dim) {
        switches = new Switch[dim];
    }

    public boolean aggiungiSwitchInPosizione(Switch s, int posizione){
        
        if(posizione >=0 && posizione < switches.length && 
                this.switches[posizione] != null)
            this.switches[posizione] = s;
        else
            return false;
        
        return true;
    }

    public int aggiungiSwitchInPosizioneLibera(Switch s){
        
        for (int i = 0; i < switches.length; i++) {
            if(this.switches[i] == null) {
                this.switches[i] = s;
                return i;
            }

        }
        return -1;
        
    }


    public boolean rimuoviSwitchInPosizione(Switch s, int posizione){
        
        if(posizione >=0 && posizione < switches.length && 
            this.switches[posizione] != null) {
            this.switches[posizione] = null;
            return true;
        }
        return false;
    }

    public String listaDaModello(String modello){
        String lista = "";
        boolean trovato = false;
        for (int i = 0; i < switches.length; i++) {
            if(this.switches[i] != null &&
            this.switches[i].getModello().equals(modello)) {
                lista += this.switches[i].toString();
                lista += "\n";
                trovato = true;
            }

        }
        if(trovato == true) {
            return lista;
        }
        else {
            return "“non trovato nessun oggetto con il modello: " + modello + "\n";
        }
    }

    public Switch switchInPosizione(int posizione){
        if(posizione >=0 && posizione < switches.length)
            return this.switches[posizione];
        else
            return null;
    }

    public Switch rimuoviSwitchDaModelloEData(String modello, LocalDate dataDiAcquisto){
        Switch s = null;
        for (int i = 0; i < switches.length; i++) {
            
            if(this.switches[i] != null &&
                this.switches[i].modello.equals(modello) &&
                this.switches[i].dataDiAcquisto.equals(dataDiAcquisto)){
                    s = this.switches[i];
                    this.switches[i] = null;
                }
        }
        return s;
        
    }

    /**
     * Elenco degli oggetti ancora in garanzia. Restituire la data di acquisto, il modello e
     * il prezzo degli oggetti in garanzia.
     */
    public String listaOggettiInGaranzia() {
        String lista ="";
        for (int i = 0; i < switches.length; i++) {
            
            if(this.switches[i] != null &&
                this.switches[i].dataDiAcquisto.plusYears(this.switches[i].getAnniDiGaranzia()).isAfter(LocalDate.now())){
                    lista += this.switches[i].getPrezzo() + "\n";
            }
    
        }
        return lista;
    }
}
