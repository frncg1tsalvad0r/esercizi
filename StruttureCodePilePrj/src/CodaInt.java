public class CodaInt {
    int[] contenitore=new int[10];
    int coda=0;
    int testa=0;
    public CodaInt(){

    }
    public void offer(int valore){
        contenitore[coda]=valore;
        coda++;
    }
    public int remove(){
        int primo=contenitore[0];
        for(int i=0;i<coda;i++){
            contenitore[i]=contenitore[i+1];
        }
        coda--;
        return primo;
    }
    public String toString(){
        String somma="";
        for(int i=0;i<coda;i++){
            somma+=contenitore[i]+" ";
        }
        return somma;
    }
}
