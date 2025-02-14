public class StackString {

        private String[] elementi;
        private int top;
    
        /**
         * Costruttore senza parametri
         */
        public StackString() {
            this.elementi = new String[10];
            this.top = 0;
        }
    
        /**
         * Costruttore con dimensione
         * @param dim
         */
        public StackString(int dim) {
            this.elementi = new String[dim];
            this.top = 0;
        }
    
        /**
         * Push di un elemento in cima alla pila
         * @param val
         */
        public void push(String val) {
            this.elementi[top] = val;
            top++;
        }
        /**
         * Inserisce un elemento in cima alla pila
         * @return
         */
        public String pop() {
            this.top = this.top-1;
            return this.elementi[top];
    
        }
    }
    