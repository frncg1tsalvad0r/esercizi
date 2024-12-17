public class Noleggio {

    Auto [] posti;
    String mix[];

    /* devo controllare che la dimensione sia sicuramente maggiore di 900 , perchè
     * deve essere quasi di 1000 posti...  */
    public Noleggio(int dim){
        this.posti=new Auto[dim];
        this.mix=new String[dim];
    }


    public boolean inserisciPos(int pos,Auto a){
        if(pos>=0 && pos<this.posti.length && this.posti[pos]==null){
            this.posti[pos]=a;
            this.mix[pos]=this.posti[pos].getMarca();
            return true;
        }return false;
    }

    /**
     * 
     * @param a
     * @return la posizione se avviene correttamente l'inserimento
     * @return -1 solo se non avviene correttamente l'inserimento
     */
    public int inserisciLibera(Auto a){
        for(int i=0;i<this.posti.length;i++){
            if(this.posti[i]==null){
                this.posti[i]=a;
                this.mix[i]=this.posti[i].getMarca();
                return i ;
            }
        }return -1;
    }

    /**
     * 
     * @param pos
     * @return l'oggetto stesso da rimuovere, se presente
     * altrimenti restituisce null...
     */
    public Auto rimuovi(int pos){
        Auto p;
        if(pos>=0 && pos<this.posti.length && this.posti[pos]!=null){
            p=this.posti[pos];
            this.mix[pos]=null;
            this.posti[pos]=null;
            return p;
        }return null;
    }



    
    public int rimozione(String targa){
        for (int i = 0; i < this.posti.length; i++) {
            if(this.posti[i]!=null && this.posti[i].getTarga().equals(targa)){
                this.mix[i]=null;
                this.posti[i]=null;
                return i;
            }
        }return -1;

    }
/* OVERLOAD */
    public int rimozione(int codice){
        for (int i = 0; i < this.posti.length; i++) {
            if(this.posti[i]!=null && this.posti[i].getCodice()==codice){
                this.mix[i]=null;
                this.posti[i]=null;
                return i;
            }
        }return -1;

    }


    public boolean ricerca(int codice){
        for (int i = 0; i < this.posti.length; i++) {
            if(this.posti[i]!=null && this.posti[i].getCodice()==codice){
                return true;
            }
        }return false;

    }


    public boolean ricerca(String targa){
        for (int i = 0; i < this.posti.length; i++) {
            if(this.posti[i]!=null && this.posti[i].getTarga().equals(targa)){
                return true;
            }
        }return false;

    }


    /*public int inventario(){
        

    }*/



    public String specifiche(){
        String s="";
        for(int i=0;i<this.posti.length;i++){
            if(this.posti[i]!=null){
                s=s+this.posti[i].toString();
            }
        }
        return s;

    }



}
