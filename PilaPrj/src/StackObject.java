public class StackObject {
    Object[] elementi;
    int top = 0;

    public StackObject() {
        this.elementi = new Object[10];
    }

    public void push(Object val) {
        this.elementi[top] = val;
        top++;
    }
    /**
     * Inserisce un elemento in cima alla pila
     * @return
     */
    public Object pop() {
        this.top--;
        return this.elementi[top];
    }
}
