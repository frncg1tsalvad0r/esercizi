import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    
    
    public static void menu(){
        
        System.out.println("Scegli un'opzione tra quelle disponibili... ");
        System.out.println("0) esci...");
        System.out.println("1) inserisci in una determinata posizione");
        System.out.println("2) inserisci nella prima posizione libera");
        System.out.println("3) rimozione data una determinata posizione");
        System.out.println("4) rimozione fornita la targa");
        System.out.println("5) ricerca fornita la targa");
        System.out.println("6) descrizione delle auto presenti");

        System.out.print("scegli: ");

    }


    public static int inserisciIntero(Scanner sc){
        int f=0;
        while(true){
            try {
            
                f=sc.nextInt();
                sc.nextLine();//pulisco..    
                return f;
            } catch ( InputMismatchException e ) {
                System.out.println("errore... re-inserisci: ");
                continue;    
    
            }
        }
        
    }



    
    
    public static void main(String[] args) throws Exception {
       
        Scanner sc=new Scanner(System.in);
        
        App.menu();
        int dimensione=inserisciIntero(sc);
        while(dimensione>1000 || dimensione<950){
            dimensione=inserisciIntero(sc);
        }

        Noleggio n=new Noleggio(0);
        int scelta=inserisciIntero(sc);

        /* while --> per scelta continua */

        switch(scelta){
            case 0: 
                System.out.println("hai scelto di uscire... bye bye");
                break;
            case 1:
            /* int numeroPosti,String marca, String modello, String targa */
                System.out.println("hai scelto di inserire un auto in una posizione nota...");
                System.out.print("inserisci il numero dei posti: ");
                int numPosti=inserisciIntero(sc);

                System.out.print("inserisci la marca: ");
                String marca=sc.nextLine();

                System.out.print("inserisci il modello: ");
                String modello=sc.nextLine();

                System.out.print("inserisci la targa: ");
                String targa=sc.nextLine();

                Auto a= new Auto(numPosti,marca,modello,targa);


                System.out.print("scegli la posizione: ");
                int pos=inserisciIntero(sc);

                n.inserisciPos(pos, a);


                break;
            /* altri case */

        }
        

        

        //chiusura dello stram
        sc.close();
    }
}
