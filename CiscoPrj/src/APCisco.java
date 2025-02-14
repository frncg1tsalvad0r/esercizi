
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Classe che gestisce il contenitore degli switch
 */
public class APCisco {
    Switch[] switches;

    public APCisco(int dim) {
        switches = new Switch[dim];
    }

    /**
     * Aggiunge uno switch in una posizione indicata
     * 
     * @param Il        riferimento allo switch. Salva il riferimento all'oggetto
     * @param posizione
     * @return true se l'operazione va a buon fine (non è possibile inserire uno
     *         switch
     *         in uno posto occupato o fuori dal range del contenitore)
     */
    public boolean aggiungiSwitchInPosizione(Switch s, int posizione) {

        if (posizione >= 0 && posizione < switches.length &&
                this.switches[posizione] == null)
            this.switches[posizione] = s;
        else
            return false;

        return true;
    }

    /**
     * Aggiunge uno switch nella prima posizione libera
     * 
     * @param s
     * @return La posizione in cui è stato inserito lo switch o -1 se errore
     */
    public int aggiungiSwitchInPosizioneLibera(Switch s) {

        for (int i = 0; i < switches.length; i++) {
            if (this.switches[i] == null) {
                this.switches[i] = s;
                return i;
            }

        }
        return -1;

    }

    /**
     * Rimuove lo switch che si trova nella posizione indicata.
     * Resti
     * 
     * @param posizione
     * @return true se l'oggetto è stato rimosso
     */
    public boolean rimuoviSwitchInPosizione(int posizione) {

        if (posizione >= 0 && posizione < switches.length &&
                this.switches[posizione] != null) {
            this.switches[posizione] = null;
            return true;
        }
        return false;
    }

    /**
     * Ritorna una stringa con la lista degli switch di un modello specificato
     * La stringa
     * 
     * @param modello
     * @return
     */
    public String listaDaModello(String modello) {
        String lista = "";
        boolean trovato = false;
        for (int i = 0; i < switches.length; i++) {
            if (this.switches[i] != null &&
                    this.switches[i].getModello().equals(modello)) {
                lista += this.switches[i].toString();
                lista += "\n";
                trovato = true;
            }

        }
        if (trovato == true) {
            return lista;
        } else {
            return "Non trovato nessun oggetto con il modello: " + modello + "\n";
        }
    }

     /**
     * Ritorna una stringa con la lista di tutti gli switch
     * La stringa
     * 
     * @return
     */
    public String listaSwitch() {
        String lista = "";

        for (int i = 0; i < switches.length; i++) {
            if(this.switches[i] != null) {
                lista += this.switches[i].toString();
                lista += "\n";
            }
        }
        return lista;
    }

    /**
     * Restituisce lo switch che si trova nella posizione indicata
     * 
     * @param posizione
     * @return Switch o null se non esiste nella posizione indicata
     */
    public Switch switchInPosizione(int posizione) {
        if (posizione >= 0 && posizione < switches.length)
            return this.switches[posizione];
        else
            return null;
    }

    /**
     * Rimuove uno switch dato il modello e la data di acquisto
     * 
     * @param modello
     * @param dataDiAcquisto
     * @return null se non presente o lo switch rimosso se presente
     */
    public Switch rimuoviSwitchDaModelloEData(String modello, LocalDate dataDiAcquisto) {
        Switch s = null;
        for (int i = 0; i < switches.length; i++) {

            if (this.switches[i] != null &&
                    this.switches[i].modello.equals(modello) &&
                    this.switches[i].dataDiAcquisto.equals(dataDiAcquisto)) {
                s = this.switches[i];
                this.switches[i] = null;
            }
        }
        return s;

    }

    /**
     * Elenco degli oggetti ancora in garanzia. Restituire la data di acquisto, il
     * modello e
     * il prezzo degli oggetti in garanzia.
     * 
     * @return Una lista con gli oggetti ancora in garanzia
     */
    public String listaOggettiInGaranzia() {
        String lista = "";
        for (int i = 0; i < switches.length; i++) {

            if (this.switches[i] != null &&
                    this.switches[i].dataDiAcquisto.plusYears(this.switches[i].getAnniDiGaranzia())
                            .isAfter(LocalDate.now())) {
                lista += "Switch: Data acquisto:" + this.switches[i].getDataDiAcquisto() + " "
                        + "Pos:" + i
                        + " Modello: " + this.switches[i].getModello() + " " 
                        + " Prezzo: " + this.switches[i].getPrezzo() + "\n";
            }

        }
        return lista;
    }

    /**
     * Salva i dati su file in formati CSV
     */
    public void salvasuFile() {
        try {
            FileOutputStream fos = new FileOutputStream("switches.csv");
            PrintStream ps = new PrintStream(fos);
            
            for(int i = 0; i < switches.length; i++) {
                if(switches[i] != null) {
                    String s = 
                            i + "," +
                            switches[i].getModello() + "," +
                            switches[i].getPrezzo() + "," + 
                            switches[i].getDataDiAcquisto() + "," +
                            switches[i].getAnniDiGaranzia();
                    ps.println(s);
                }
            }


        } catch(Exception e) {
            System.out.println("Errore nella scrittura del file");
        }

    }

    public void caricaDaFile() {
        Scanner sc = null;
        try (FileInputStream fis = new FileInputStream("switches.csv")) {
            for(int i = 0; i < switches.length; i++) {
                switches[i] = null;
            }
            
            sc = new Scanner(fis);
            while(sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] campi = linea.split(",");
                String modello = campi[1];
                double prezzo = Double.parseDouble(campi[2]);
                LocalDate dataDiAcquisto = LocalDate.parse(campi[3]);
                int anniDiGaranzia = Integer.parseInt(campi[4]);
                Switch s = new Switch(modello, prezzo, dataDiAcquisto, anniDiGaranzia);
                switches[Integer.parseInt(campi[0])] = s;
            }
            
        } catch (Exception e) {
    
            System.out.println("EECCEZIONE");
        } finally {
            sc.close();
            System.out.println("FINALLy");
        }

    }
}
