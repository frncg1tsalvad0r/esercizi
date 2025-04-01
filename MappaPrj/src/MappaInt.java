public class MappaInt {

    private String[] chiavi;
    private int[] valori;


    public MappaInt(int dim) {
        this.chiavi = new String[dim];
        this.valori = new int[dim];

    }


    /**
     * Getter della mappa
     * @param chiave
     * @return valore
     * @throws Non trovato
     */
    public int get(String chiave){
        for(int i = 0; i < chiavi.length; i++) {
            if(chiavi[i] != null && chiavi[i].equals(chiave)) {
                return valori[i];
            }
        }
        throw new RuntimeException();
    }

    /** 
     * Setter della mappa
     * @param chiave
     * @param valore
     * @throws Troppo pieno
     */
    public void put(String chiave, int valore){
        for(int i = 0; i < chiavi.length; i++) {
            if(chiavi[i] != null && chiavi[i].equals(chiave)) {
                valori[i] = valore;
                return;
            }
        }

        for(int i = 0; i < chiavi.length; i++) {
            if(chiavi[i] == null) {
                chiavi[i] = chiave;
                valori[i] = valore;
                return;
            }
        }
        throw new RuntimeException();
    }


    public String toString() {
        String s = "[";
        for(int i = 0; i < chiavi.length; i++) {
            if(chiavi[i] != null) {
                s += chiavi[i] + "=>" + valori[i];
            }
        }
        return s + "]";
    }
}
