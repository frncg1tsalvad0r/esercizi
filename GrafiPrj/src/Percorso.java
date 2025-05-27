public class Percorso {
    
    private GrafoPesato grafo;
    private boolean[] visitati;
    private int[] da;

    public Percorso(GrafoPesato grafo) {
        this.grafo = grafo;
        this.visitati = new boolean[grafo.numeroNodi()];
        this.da = new int[grafo.numeroNodi()];
        for(int i = 0; i < this.da.length; i++) {
            this.da[i] = -1;
        }
    }

    public void visitaDFS(int nodoPartenza) {
        dfs(nodoPartenza);
    }

    private void dfs(int nodo) {

        this.visitati[nodo] = true;
        int[] adiacenti = grafo.adj(nodo);

        for(int i = 0; i < adiacenti.length; i++) {
            int nodoAdiacente = adiacenti[i];
            if (visitati[nodoAdiacente] ==  false) {
                dfs(nodoAdiacente);
                this.da[nodoAdiacente] = nodo;
            }
        }

    }

    public void stampa() {
        for(int i = 0; i < visitati.length; i++) {
            System.out.println(this.visitati[i] + " " + this.da[i]);
        }
    }

    public int[] percorso(int nodo1, int nodo2) {
        int nPassi = connesso(nodo1, nodo2);
        if (nPassi < 0) {
            return null;
        }
        int[] passi = new int[nPassi];

        int corrente = nodo2;
        for(int i = passi.length - 1; i >=0 ; i++) {
            passi[i] = corrente;
            corrente = this.da[corrente];
        }
        return passi;
    }

    public int connesso(int nodo1, int nodo2) {
        int nPassi = 0;
        int corrente = nodo2;
        while(true){
            if(corrente == -1)
                return -1;
            if (corrente == nodo1) {
                return nPassi;
            }
            nPassi++;
            corrente = this.da[corrente];
        
        }
    }
    
}
