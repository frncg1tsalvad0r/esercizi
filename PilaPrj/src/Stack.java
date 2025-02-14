public class Stack<T> {
    private Object[] elementi;
    
    private int top = 0;

    public Stack() {
        this.elementi = new Object[10];

    }

    /**
     * Inserisce un elemento in cima
     * @param val
     */
    public void push(T val) {
        this.elementi[top] = val;
        top++;
    }

    /**
     * Esrtrae l'elemento dalla pila
     * @return
     */
    public T pop() {
        top--;
        return ((T)(this.elementi[top]));

    }
}
