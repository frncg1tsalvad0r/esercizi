public class ListaLincataInt {
    private Nodo testa = null;
    
    public ListaLincataInt() {

    }

    public void addFirst(int valore){
        // CREO IL NODO
        Nodo nuovo = new Nodo();
        // ASSEGNO AL NODO NUOVO IL VALORE PASSATO COME PARAMETRO
        nuovo.valore = valore;
         
        // IL SUCCESSIVO DEL NUOVO è LO STESSO DELLA TESTA
        nuovo.successivo = testa;
        // LA TESTA PUNTERA' AL NUOVO NODO
        testa = nuovo;
       
        
    }
}
