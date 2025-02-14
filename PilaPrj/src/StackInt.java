public class StackInt {
    private int[] elementi;
    private int top;

    /**
     * Costruttore senza parametri
     */
    public StackInt() {
        this.elementi = new int[10];
        this.top = 0;
    }

    /**
     * Costruttore con dimensione
     * @param dim
     */
    public StackInt(int dim) {
        this.elementi = new int[dim];
        this.top = 0;
    }

    /**
     * Push di un elemento in cima alla pila
     * @param val
     */
    public void push(int val) {
        this.elementi[top] = val;
        top++;
    }
    /**
     * Inserisce un elemento in cima alla pila
     * @return
     */
    public int pop() {
        this.top--;
        int tmp = this.elementi[top];
        this.elementi[top] = 0;
        return tmp;

    }
}
