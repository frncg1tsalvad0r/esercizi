

public class App extends Object {
    public static void main(String[] args) throws Exception {
        
        /*
        // Prova l'array associativo triviale
        ArrayAssociativoInt asi = new ArrayAssociativoInt(10);
        // Inserisco la coppia Anna->17
        asi.put("Anna", 17);
        asi.put("Marco", 23);
        asi.stampa();
        asi.put("Anna", 18);
        asi.stampa();
        */
        // Prova l'array associativo triviale
        HashAssociativoInt hai = new HashAssociativoInt(10);
        // Inserisco la coppia Anna->17
        hai.put("Rita", 25);
        hai.put("Gigi", 32);
        hai.stampa();
        hai.put("Rita", 26);
        hai.stampa();
        hai.put("Giorgio", 30);
        hai.stampa();
        hai.put("Paolo", 45);
        hai.stampa();
        hai.put("taRi", 33);
        hai.stampa();
        hai.put("Rati", 44);
        hai.stampa();
        hai.put("tiRa", 77);
        hai.stampa();

        System.out.println("----------");
        System.out.println(hai.get("taRi"));


        
    }
}
