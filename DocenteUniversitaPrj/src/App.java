
import java.util.InputMismatchException;
import java.util.Scanner;


public class App {

    public static void menu(){
        System.out.println("");
    }


    public static int inserisciInt(Scanner sc){
        int val=0;

        while (true) { 
            try {
                val=sc.nextInt();
                sc.nextLine();
                return val;
            }catch (InputMismatchException e) {
                System.out.print("errore - reinserisci... ");
                sc.nextLine();
                continue;
            }
        }

    }


    public static void main(String[] args) throws Exception {
        
        App.menu();



    }
}
