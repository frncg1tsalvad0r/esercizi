import java.util.Scanner;

public class Principale {
    public static void stampaMenu() {
        System.out.println("**********************");
        System.out.println("0) Esci");
        System.out.println("1) Visualizza Treno");
        System.out.println("2) Aggingi Vagone in posizione");
        System.out.println("3) Salva");
        System.out.println("**********************");

    }
    public static void main(String[] args) {
        // Stampare un menu
        Scanner sc = new Scanner(System.in);
        Treno treno = new Treno();
        while(true) {
            Principale.stampaMenu();
            try {
                int opzione = sc.nextInt();

                switch(opzione) {
                    case 0:
                    // Esco
                        System.out.println("Ciao, grazie per aver viaggiato con noi");
                        return;
                        
                    case 1:
                    // Visualizza treno
                        System.out.println("Treno");
                        System.out.println(treno.toString());
                        break;
                    case 2:
                    // Inserisci vagone in posizione
                        System.out.println("Inserimento vagone");
                        System.out.println("Scegli la posizione");
                        int posizione = sc.nextInt();

                        System.out.println("Scegli il tipo 1=MERCI, 2=PASSEGGERI");
                        int tipo = sc.nextInt();

                        if(tipo == 1) {
                            // Inserirò un vagone merci
                            System.out.println("Dammi il codice");
                            int codice = sc.nextInt();

                            System.out.println("Dammi il peso a vuoto");
                            double pesoAVuoto = sc.nextDouble();

                            System.out.println("Dammi azienda costruttice");
                            String aziendaCostruttrice = sc.next();
                            
                            System.out.println("Dammi anno costruzione");
                            int annoCostruzione = sc.nextInt();

                            System.out.println("Dammi volume Carico");
                            double volumeDiCarico = sc.nextDouble();

                            System.out.println("Dammi Peso Effettivo Carico");
                            double pesoEffettivoCarico = sc.nextDouble();

                            System.out.println("Dammi Peso Massimo Carivo");
                            double pesoMassimoCarico = sc.nextDouble();

                            Merci m = new Merci(codice, pesoAVuoto, aziendaCostruttrice, annoCostruzione, volumeDiCarico, pesoEffettivoCarico, pesoMassimoCarico);

                            if(treno.inserisciVagone(posizione, m) == true) {
                                System.out.println("Vagone inserito");
                            } else {
                                System.out.println("Vagone non inserito per qualche oscuro motivo");
                            }

                        } else if(tipo == 2) {
                            // Inserirò passeggeri
                        } else{
                            System.out.println("tipo di treno non contemplato");
                        }
                        break;
                    case 3:
                        treno.salvaSuFile();
                        break;
                }   
                /*
                if(opzione == 0) {
                    // Esco
                } else if(opzione == 1) {
                    // Visualizza treno
                } else if(opzione == 2) {
                    // Inserisci vagone in posizione
                }
                */
            } catch(Exception e) {
                System.out.println("Qualcosa è andato storto");
            }
        } 
    }
}
