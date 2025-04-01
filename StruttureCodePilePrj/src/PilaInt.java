public class PilaInt {
    
    private int[] contenitore=new int[10];
    
    private int top=0;

    public PilaInt(){

    }

    /** Inserisdci un elemento in cima alla pila */
    public void push(int valore){
        contenitore[top]=valore;
        top++;
    }

    /**
     * Estrae l'elemento dalla cima
     * @return
     */
    public int pop(){
        top--;
        return contenitore[top];
    }
}
