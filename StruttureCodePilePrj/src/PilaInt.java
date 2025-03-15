public class PilaInt {
    int[] contenitore=new int[10];
    int top=0;
    public PilaInt(){

    }
    public void push(int valore){
        contenitore[top]=valore;
        top++;
    }
    public int pop(){
        top--;
        return contenitore[top];
    }
}
