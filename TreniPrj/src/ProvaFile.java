import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.Buffer;

public class ProvaFile {
    public static void main(String [] args) {
        /*
        File f = new File("c:\\D\\prova.txt");
        try {
            FileOutputStream fos = new FileOutputStream(f);
            fos.write(65);
            fos.write(66);
            fos.write(67);
            fos.write(0x0A);
        } catch (Exception e) {
            System.out.println("Eccezione");
        }
        try{
            File f1 = new File("c:\\D\\provaLettura.txt");
            FileInputStream fis = new FileInputStream(f1);
            int primo = fis.read();
            int secondo = fis.read();
            int terzo = fis.read();
        } catch (Exception e) {
            System.out.println("Eccezione");
        }
        

        /*
        System.out.write(65);
        System.out.write(66);
        System.out.write(67);
        System.out.write(0x0a);

        try {
            int primo = System.in.read();
            int secondo = System.in.read();
            int terzo = System.in.read();

        } catch (Exception e) {
            System.out.println("Eccezione");
        }
        */
        /*
        System.out.print("Ciao");
        System.out.print(123);
        System.out.print(123.45);
        */
        File f3 = new File("c:\\D\\testo.txt");
        try{
            FileWriter fw = new FileWriter(f3);

            fw.write("Ciao");
            fw.close();
        }catch(Exception e) {
            System.out.println("Eccezione");
        }

        File f4 = new File("c:\\D\\testoDaLeggere.txt");
        //BufferedReader br = new BufferedReader(f4);
        //br.re
    }
}
