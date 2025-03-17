public class Pila<T> {
    
    private Object[] contenitore=new Object[10];
    
    private int top=0;

    public Pila(){

    }

    /** Inserisdci un elemento in cima alla pila */
    public void push(T valore){
        contenitore[top]=valore;
        top++;
    }

    /**
     * Estrae l'elemento dalla cima
     * @return
     */
    public T pop(){
        top--;
        return (T)(contenitore[top]);
    }
}
