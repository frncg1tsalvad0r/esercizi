import java.time.LocalDate;

/**
 * Esercizio che gestisce un magazzino di switch di telecomunicazione
 */
public class Principale {
    public static void main(String[] args) throws Exception {
        APCisco apCisco = new APCisco(30);
        /* 
        
        Switch s1 = new Switch("2960", 1200, LocalDate.of(2024, 10, 10), 3);
        Switch s2 = new Switch("2960", 500, LocalDate.of(2024, 10, 10), 1);
        Switch s3 = new Switch("c2950", 1000, LocalDate.of(2023, 10, 10), 3);
        Switch s4 = new Switch("2960", 1500, LocalDate.of(2021, 1, 11), 3);
        Switch s5 = new Switch("2960", 200, LocalDate.of(2020, 1, 1), 3);

        apCisco.aggiungiSwitchInPosizione(s1, 1);
        apCisco.aggiungiSwitchInPosizioneLibera(s2);
        apCisco.aggiungiSwitchInPosizione(s3, 5);
        apCisco.aggiungiSwitchInPosizione(s4, 6);
        apCisco.aggiungiSwitchInPosizione(s5, 7);

        System.out.println(apCisco.listaSwitch());
        System.out.println("-------------------");


        System.out.println(apCisco.listaDaModello("2960"));
        System.out.println("-------------------");
        System.out.println(apCisco.listaOggettiInGaranzia());
        apCisco.salvasuFile();

        */
        apCisco.caricaDaFile();

    }
}
