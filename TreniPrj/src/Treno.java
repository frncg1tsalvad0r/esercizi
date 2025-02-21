import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Treno {
    Vagone[] vagoni;
    protected int numeroVagoni;

    /**
     * 1) inserimento in una determinata posizione, restituire true o false. 
     * 2) metodo di rimozione data la posizione, restituisce l'oggetto rimosso (se trovato) , 
     * altrimenti null. 
     * 3) ricerca di un vagone dato il codice : "se è un vagone passeggeri" restituire la "classe" 
     * , se invece è un "vagone merci" restituire l'azienda costruttrice. 
     * 4) calcolo della quantità di posti liberi che ci sono per ogni vagone.
     */
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

    /**
     * Inserimento in una determinata posizione, restituire true o false. 
     * Se ha senso ritorno true
     * Se non ha senso ritono false
     * 
     */
    public boolean inserisciVagone(int posizione, Vagone vagone) {
        if (posizione < 0 || posizione > this.numeroVagoni)
            return false;
        
        // Ricordatevi di partire dalla fine altrimenti perdo i riferimenti dei successivi
        // Sposta avanti tutti gli elementi
        for (int i = this.numeroVagoni-1; i >= posizione; i--) {
                this.vagoni[i+1] = this.vagoni[i];
        }   
        this.vagoni[posizione] =vagone;
        this.numeroVagoni++;
        return true;
    }

    /**
     * Rimozione data la posizione, restituisce l'oggetto rimosso 
     * (se trovato) altrimenti null.
     */
    Vagone rimuoviVagone(int posizione) {
        if (posizione < 0 || posizione > this.numeroVagoni)
            return null;

        Vagone rimosso = this.vagoni[posizione];

        // Sposto tutti i riferimenti in avanti di uno a
        // partire dalla posizione
        for(int i = posizione; i < this.numeroVagoni; i++) {
            this.vagoni[i] = this.vagoni[i+1];
        }
        this.numeroVagoni--;
        return rimosso;
    }

    /**
     * Svuota il treno dai vagoni
     */
    public void clear() {
        this.numeroVagoni = 0;
    }
    public void salvaSuFile() {
        File f = new File(".\\treno.csv");
        try {
            FileWriter fw = new FileWriter(f);

            for(int i = 0; i < this.numeroVagoni; i++) {
                fw.write(this.vagoni[i].toCSV() + "\n");
            }
            fw.close();
        } catch (Exception e) {
            System.out.println("Eccezione");
        }
       
    }

    public void caricaDaFile() {

        this.clear();
        File f = new File(".\\treno.csv");
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String riga = "";
            riga = br.readLine();
            while(riga != null) {
                String[] campi = riga.split(";");
                if(campi[0].equals("Merci")) {
                    Merci m = new Merci(Integer.parseInt(campi[1]), 
                                        Double.parseDouble(campi[2]), 
                                        campi[3], 
                                        Integer.parseInt(campi[4]), 
                                        Double.parseDouble(campi[5]), 
                                        Double.parseDouble(campi[6]), 
                                        Double.parseDouble(campi[7]));
                    this.aggiugiVagone(m);
                } else if(campi[0].equals("Passeggeri")) {
                    Passeggeri p = new Passeggeri(Integer.parseInt(campi[1]), 
                                        Double.parseDouble(campi[2]), 
                                        campi[3], 
                                        Integer.parseInt(campi[4]), 
                                        Integer.parseInt(campi[5]), 
                                        Integer.parseInt(campi[6]), 
                                        Integer.parseInt(campi[7]));
                    this.aggiugiVagone(p);
                }

                riga = br.readLine();
            }
            
            br.close();
        } catch (Exception e) {
            System.out.println("Eccezione");
        }
       
    }
}
