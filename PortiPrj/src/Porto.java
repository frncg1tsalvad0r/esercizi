import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Scanner;

public class Porto {

    private Barca[] barche;

    /**
     * Costruttore che definisce la dimensione del porto
     * 
     * @param dim
     */
    public Porto(int dim) {
        if (dim < 50) {
            dim = 50;
        }
        this.barche = new Barca[dim];
    }

    /**
     * Inserisce scegliendo in modo automatico la posizione
     * della barca in base alle caratteristiche
     * 
     * @param barca
     * @return la posizione della barca inserita e -1 se errore
     */
    public int assegnaPostoAutomatico(Barca barca) {

        // Le barche a vela vanno dalla posizione 30 in poi
        if (barca.getTipologia() == Barca.VELA) {
            for (int i = 30; i < barche.length; i++) {
                if (barche[i] == null) {
                    // Trovato un buco e posso inserire una barca
                    barche[i] = barca;
                    return i;
                }
            }
            return -1;
        }

        // Guardo se è una barca più lunga di 10 m
        if (barca.getLunghezza() >= 10) {
            for (int i = 20; i < barche.length; i++) {
                if (barche[i] == null) {
                    // Trovato un buco e posso inserire una barca
                    barche[i] = barca;
                    return i;
                }
            }
            return -1;
        }
        // Sono sicuro che non sono barche a vela o barche
        // più lunghe di 10m
        for (int i = 0; i < barche.length; i++) {
            if (barche[i] == null) {
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
    public int assegnaPostoFisso(Barca barca, int posizione) {
        // Le barche a vela vanno dalla posizione 30 in poi
        if (barca.getTipologia() == Barca.VELA) {
            if (posizione >= 30 && posizione < barche.length) {
                if (barche[posizione] == null) {
                    // Trovato un buco e posso inserire una barca
                    barche[posizione] = barca;
                    return posizione;
                }
            }
            return -1;
        }

        // Guardo se è una barca più lunga di 10 m che vanno dopo la posizione 20
        if (barca.getLunghezza() >= 10) {
            if (posizione >= 20 && posizione <= barche.length) {
                if (barche[posizione] == null) {
                    // Trovato un buco e posso inserire una barca
                    barche[posizione] = barca;
                    return posizione;
                }
            }
            return -1;
        }
        // Sono sicuro che non sono barche a vela o barche
        // più lunghe di 10m
        if (posizione < barche.length) {
            if (barche[posizione] == null) {
                // Trovato un buco e posso inserire una barca
                barche[posizione] = barca;
                return posizione;
            }
        }
        return -1;

    }

    // Stampa del porto
    public void stampaSituazionePorto() {

        for (int i = 0; i < this.barche.length; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
            if (this.barche[i] != null) {
                if (this.barche[i].getTipologia() == Barca.VELA) {
                    System.out.print("MOT");
                } else if (this.barche[i].getTipologia() == Barca.MOTORE) {
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

    // Stampa la lista delle barch
    public void stampaListaBarche() {
        System.out.println("***************************");
        System.out.println("**** LISTA BARCHE     *****");
        System.out.println("***************************");
        for (int i = 0; i < this.barche.length; i++) {
            if (this.barche[i] != null) {
                System.out.println("POS: " + i + this.barche[i].toString());
            }
        }
        System.out.println();
    }

    /**
     * metodo che permette di far uscire la barca (dal porto) dal posto
     * specificato e ritorna la barca rimossa.
     * 
     * @param posizione della barca da rimuovere
     * @return la barca o null se la barca non è presente nella posizione indicata
     */
    public Barca uscitaBarca(int posizione) {
        Barca b = this.barche[posizione];
        this.barche[posizione] = null;
        return b;
    }

    /**
     * metodo che permette di controllare se la barca è assegnabile ad un posto
     * barca libero. Ritorna:
     * il numero del posto barca assegnabile.
     * -1 se non è possibile assegnare alcun posto barca.
     * 
     * @return la posizione del posto libero o -1 se errore
     */
    public int checkLibero(int posizione) {
        try {
            if (this.barche[posizione] == null) {
                return posizione;
            }
        } catch (Exception e) {
            return -1;
        }
        return -1;
    }

    /**
     * Salvataggio su file
     */
    public void salvaSuFile() {
        try (// Salva su file porto.por
                FileOutputStream fos = new FileOutputStream("porto.csv")) {
            PrintStream fps = new PrintStream(fos);
            for (int i = 0; i < barche.length; i++) {

                if (barche[i] != null) {
                    fps.print(i);
                    fps.print(",");
                    fps.print(barche[i].getNome());
                    fps.print(",");
                    fps.print(barche[i].getNazionalita());
                    fps.print(",");
                    fps.print(barche[i].getLunghezza());
                    fps.print(",");
                    fps.print(barche[i].getStazza());
                    fps.print(",");
                    fps.print(barche[i].getTipologia());
                    fps.print(",");
                    fps.print(barche[i].getDataOrmeggio());
                    fps.println();

                }
            }
            fps.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return;
        }

        System.out.println("File scritto con successo!");
    }


    /**
     * Carica da file
     */
    public void caricaDaFile() {
        Scanner sc = null;
        try {// Salva su file porto.por

            // Pulisco il porto
            for (int i = 0; i < barche.length; i++) {
                barche[i] = null;
            }
            FileInputStream fis = new FileInputStream("porto.csv");
            sc = new Scanner(fis);
            while(sc.hasNextLine()) {
                String barcaFormatoStringaCSV = sc.nextLine();
                String[] campi = barcaFormatoStringaCSV.split(",");
                // Posizione nel porto campi[0] 
                // Nome Barca campi[1] 
                Barca b = new Barca(campi[1], 
                                campi[2], 
                                Double.parseDouble(campi[3]),
                                Double.parseDouble(campi[4]),
                                Integer.parseInt(campi[5]),
                                LocalDate.parse(campi[6]));
                int posizione = Integer.parseInt(campi[0]);
                barche[posizione] = b;
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return;
        } finally {
            // Chiudo il file
            sc.close();
        }   

        System.out.println("File caricato con successo!");
    }
}
