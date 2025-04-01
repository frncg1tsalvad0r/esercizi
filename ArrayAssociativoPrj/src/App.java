public class App {
    public static void main(String[] args) throws Exception {

        // Prova l'array associativo triviale
        ArrayAssociativoInt asi = new ArrayAssociativoInt(10);
        // Inserisco la coppia Anna->17
        asi.put("Anna", 17);
        asi.put("Marco", 23);
        asi.stampa();
        asi.put("Anna", 18);
        asi.stampa();

        // Prova l'array associativo triviale
        HashAssociativoInt hai = new HashAssociativoInt(10);
        // Inserisco la coppia Anna->17
        hai.put("Rita", 25);
        hai.put("Giorgio", 32);
        hai.stampa();
        hai.put("Rita", 26);
        hai.stampa();

    }
}
