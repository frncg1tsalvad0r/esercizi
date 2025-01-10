import java.time.LocalDate;
import java.util.Scanner;

public class App {

    public static int leggiInt(Scanner sc) {
        int valore = 0;
        while(true) {
            try {
                valore = sc.nextInt();
                sc.nextLine();
                return valore;
            } catch (Exception e) {
                System.out.println("@@@@ valore non valido");
                sc.nextLine();
                continue;
            }
        }
    }

    /**
     * Leggo un valore double dalla tastiera e insisto finchè è un valore valido
     * @param sc
     * @return double valido
     */
    public static double leggiDouble(Scanner sc) {
        double valore = 0;
        while(true) {
            try {
                valore = sc.nextDouble();
                sc.nextLine();
                return valore;
            } catch (Exception e) {
                System.out.println("@@@@ valore non valido");
                sc.nextLine();
                continue;
            }
        }
    }
    public static double leggiStazza(Scanner sc) {
        double stazza = 0;
        while(true) {
            try {
                stazza = sc.nextDouble();
                sc.nextLine();
                return stazza;
            } catch (Exception e) {
                System.out.println("@@@@ stazza non valida");
                sc.nextLine();
                continue;
            }
        }
    }

    public static double leggiLunghezza(Scanner sc) {
        double lunghezza = 0;
        while(true) {
            try {
                lunghezza = sc.nextDouble();
                sc.nextLine();
                return lunghezza;
            } catch (Exception e) {
                System.out.println("@@@@ lunghezza non valida");
                sc.nextLine();
                continue;
            }
        }
    }

    /** 
     * Legge una data in formato AAAA-MM-GG e inisite finchè la data è valida
     * @param sc scanner 
     * @return LocalDate data valida inserita
     */
    public static LocalDate leggiData(Scanner sc) {
        LocalDate data = null;
        while(true) {
            try {
                String dataInFormatoStringa = sc.nextLine();
                data = LocalDate.parse(dataInFormatoStringa);
                return data;
            } catch(Exception e ) {
                System.out.println("@@@@ data non valida");
                
            }
        }

    }

    /**
     * Legge la tipologia di barca che si deve inserire nel porto
     * @param sc
     * @return il valore del tipo di barca
     */
    public static int leggiTipologia(Scanner sc) {
        int tipo = 0;
        while(true) {
            System.out.println("Inserisci la tipologia 0 = VELA 1= MOTORE: ");
            try {
                tipo = sc.nextInt();
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("@@@@@ Tipologia di barca non valida");
                continue;
            }
            sc.nextLine();
            if(tipo != Barca.MOTORE && tipo != Barca.VELA) {
                System.out.println("@@@@@ Tipologia di barca non valida");
                continue;
            }
            return tipo;    
        }
    }
    public static void stampaMenu() {
        System.out.println("*******************************************");
        System.out.println("0) ESCI");
        System.out.println("1) VISUALIZZA PORTO");
        System.out.println("2) INSERISCI BARCA IN AUTOMATICO");
        System.out.println("3) INSERISCI BARCA IN POSIZIONE SPECIFICATA");
        System.out.println("4) RIMUOVI BARCA DALLA POSIZIONE SPECIFICATA");
        System.out.println("5) LISTA BARCHE");
        System.out.println("10) SALVA SU FILE");
        System.out.println("11) CARICA DA FILE");
        System.out.println("*******************************************");
    }

    public static void main(String[] args) throws Exception {
        Porto porto = new Porto(55);

        // POPOLARE IL PORTO SENZA INSERIMENTO MANUALE
        Barca b1 = new Barca("Nina", "Spagna", 20, 20, Barca.VELA, LocalDate.now());
        Barca b2 = new Barca("Pinta", "Spagna", 20, 20, Barca.VELA, LocalDate.now());
        Barca b3 = new Barca("Santa Maria", "Spagna", 20, 20, Barca.VELA, LocalDate.now());
        Barca b4 = new Barca("Costa", "Italia", 50, 40, Barca.MOTORE, LocalDate.now());
        porto.assegnaPostoAutomatico(b1);
        porto.assegnaPostoAutomatico(b2);
        porto.assegnaPostoAutomatico(b3);
        porto.assegnaPostoAutomatico(b4);



        Scanner sc = new Scanner(System.in);
        while(true) {
            App.stampaMenu();
            int scelta = 0;
            try {
                scelta = sc.nextInt(); // Può esplodere
                
            } catch(Exception e) {
                sc.nextLine();
                continue;
            }
            sc.nextLine();

            if(scelta == 0) {
                // Esco 
                break;
            } else if(scelta == 1) {
                // Stampa la situazione del porto
                porto.stampaSituazionePorto();

            } else if(scelta == 2) {
                // Inserire una nuova barca in automatico
                System.out.println("Inserisci il nome: ");
                String nome = sc.nextLine();
                System.out.println("Inserisci la nazionalità: ");
                String nazionalita = sc.nextLine();
                System.out.println("Inserisci la lunghezza: ");
                double lunghezza = App.leggiLunghezza(sc);
                System.out.println("Inserisci la stazza: ");
                double stazza = App.leggiStazza(sc);
                /*
                System.out.println("Inserisci la tipologia 0 = VELA 1= MOTORE: ");
                int tipologia = sc.nextInt();
                if(tipologia != Barca.MOTORE && tipologia != Barca.VELA)
                    throw new RuntimeException();
                sc.nextLine();
                */
                int tipologia = leggiTipologia(sc);
                
                System.out.println("Inserisci la data AAAA-MM-DD");
                /*
                String dataOrmeggioStringa = sc.nextLine();
                LocalDate dataOrmeggio = LocalDate.parse(dataOrmeggioStringa);
                */
                LocalDate dataOrmeggio = App.leggiData(sc);
                Barca nuovaBarca = new Barca(nome, nazionalita, lunghezza, stazza, tipologia, dataOrmeggio);
                
                if(porto.assegnaPostoAutomatico(nuovaBarca) >= 0) {
                    System.out.println(nuovaBarca);
                    System.out.println("Barca inserita con successo");
                } else {
                    System.out.println("Impossibile inserire la barca. Posti non disponibili");
                }

               
            } else if(scelta == 3) {
                // Inserimento barca in una postazione specifica

                System.out.println("Inserisci il nome: ");
                String nome = sc.nextLine();
                System.out.println("Inserisci la nazionalità: ");
                String nazionalita = sc.nextLine();
                System.out.println("Inserisci la lunghezza: ");
                double lunghezza = App.leggiLunghezza(sc);
                System.out.println("Inserisci la stazza: ");
                double stazza = App.leggiStazza(sc);
                
                int tipologia = leggiTipologia(sc);
                
                System.out.println("Inserisci la data AAAA-MM-DD");
                LocalDate dataOrmeggio = App.leggiData(sc);

                System.out.println("Inserisci la posizione della barca nel porto ");
                int posizione = App.leggiInt(sc);
                Barca nuovaBarca = new Barca(nome, nazionalita, lunghezza, stazza, tipologia, dataOrmeggio);
                
                if(porto.assegnaPostoFisso(nuovaBarca, posizione) >= 0) {
                    System.out.println(nuovaBarca);
                    System.out.println("Barca inserita con successo");
                } else {
                    System.out.println("Impossibile inserire la barca. Posto non disponibile");
                }
            } else if(scelta == 4) {
                // Rimuovo la barca dalla posizione specificata
                System.out.println("Inserisci la posizione della barca nel porto ");
                int posizione = App.leggiInt(sc);
                Barca b = porto.uscitaBarca(posizione);
                if(b != null) {
                    System.out.println("La barca rimossa è la seguente");
                    System.out.println(b);
                } else {
                    System.out.println("La barca non esiste nella posizione indicata: " + posizione);
                }
            }  else if(scelta == 5) {
                // Stampa lista barche nel porto
                porto.stampaListaBarche();
                
            } else if(scelta == 10) {
                // Salvare il porto su file
                porto.salvaSuFile();

            } else if(scelta == 11) {
                // Carico da file
                porto.caricaDaFile();
            }


        }
    }        
}
