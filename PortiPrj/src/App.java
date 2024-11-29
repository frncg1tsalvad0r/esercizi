import java.time.LocalDate;
import java.util.Scanner;

public class App {

    public static void stampaMenu() {
        System.out.println("**********************************");
        System.out.println("0) ESCI");
        System.out.println("1) VISUALIZZA PORTO");
        System.out.println("2) INSERISCI BARCA");
        System.out.println("**********************************");
    }

    public static void main(String[] args) throws Exception {
        Porto porto = new Porto(55);
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
            if(scelta == 0) {
                // Esco 
                break;
            } else if(scelta == 1) {
                porto.stampaSituazionePorto();
            }
        }
    }        
}
