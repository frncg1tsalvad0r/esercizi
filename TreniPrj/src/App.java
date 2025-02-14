public class App {
    public static void main(String[] args) throws Exception {
        Treno treno = new Treno();

        Passeggeri p1 = new Passeggeri(1, 120000, "Brotto", 2025, 1, 50, 10);
            
        treno.aggiugiVagone(p1);

        Merci m1 = new Merci(2, 200000, "Brotto", 2023, 100, 120000, 300000);
        treno.aggiugiVagone(m1);

        System.out.println(treno.toString());
        System.out.println("Peso complessivo treno: "  + treno.getPesoComplessivo());
    }
}

