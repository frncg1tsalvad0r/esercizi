public class PilaObject {
    
    private Object[] contenitore=new Object[10];
    
    private int top=0;

    public PilaObject(){

    }

    /** Inserisdci un elemento in cima alla pila */
    public void push(Object valore){
        contenitore[top]=valore;
        top++;
    }

    /**
     * Estrae l'elemento dalla cima
     * @return
     */
    public Object pop(){
        top--;
        return contenitore[top];
    }
}
