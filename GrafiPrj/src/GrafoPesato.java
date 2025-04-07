public class GrafoPesato {
    private int matrice[][];
    
    /**
     * Costruttore 
     * @param dim
     */
    public GrafoPesato(int dim){
        this.matrice = new int[dim][dim];
        for(int i = 0; i < dim; i++) {
            for(int j = 0; j < dim; j++) {
                this.matrice[i][j]= -1;
            }
        }
    }

    /**
     * Aggiunge un arco da un nodo1 ad un nodo2 con un peso
     * specificato
     * @param nodo1
     * @param nodo2
     * @param peso
     */
    public void addArco(int nodo1, int nodo2, int peso) {
        this.matrice[nodo1][nodo2] = peso;
        this.matrice[nodo2][nodo1] = peso;

    }

    /**
     * Ritorna i nodi adiacenti ad un nodo specificato
     * @param nodo
     * @return
     */
    public int[] adj(int nodo) {
        int nAdiacenze = 0;
        for(int i = 0; i < matrice[nodo].length; i++) {
            if(matrice[nodo][i] != -1)
                nAdiacenze++;
        }
        int[] adiacenze = new int[nAdiacenze];
        int k = 0;
        for(int j = 0; j < matrice[nodo].length; j++) {
            if( matrice[nodo][j] != -1) {
                adiacenze[k] = matrice[nodo][j];
                k++;
            }
        }
        return adiacenze;
    }

    /**
     * Stampa il grafo delle adiacenze
     */
    public void stampa() {
        for(int i = 0; i < matrice[0].length; i++) {
            for(int j = 0; j < matrice[0].length; j++) {
                System.out.print(matrice[i][j] + " ") ;
            }
            System.out.println();
        }
    }
}
