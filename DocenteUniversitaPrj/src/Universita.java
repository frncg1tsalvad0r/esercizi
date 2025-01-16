public class Universita {

    Docente uni[];


    public Universita(int dim){
        uni=new Docente[dim];//controllare che sia massimo 300
    }


    public Docente chiMinima(){
        Docente d=null;
        int eta=0;
        int j=0; // indice
        for(int i=0;i<this.uni.length;i++){
            if(this.uni[i]!=null){
                eta=this.uni[i].getEta();
                j=i;
                break;
            }
        }
        for(int i=j;i<this.uni.length;i++){
            if(this.uni[i]!=null){
                if(this.uni[i].getEta() < eta){
        /* se l'età del docente presente nella cella dell'array è più bassa
         * di quella presa come riferimento iniziale, allora posso procedere
         * a prenderla come valore più basso
         */
                    eta=this.uni[i].getEta();
                    d=this.uni[i];
                }
            }
        }
        return d;
    }




    public int etaMassima(){
        int eta=0;
        for(int i=0;i<this.uni.length;i++){
            if(this.uni[i]!=null){
                if(this.uni[i].getEta() > eta){
                    eta=this.uni[i].getEta();
                }
            }
        }return eta;
    }



    public Docente ricercaCodice(int cod){
        for(int i=0;i<uni.length;i++){
            if(this.uni[i]!=null){
                if(this.uni[i].getCodice()==cod){
                    return this.uni[i];
                }
            }
        }return null;
    }


    public int inserimentoLibero(Docente d){
        for(int i=0;i<this.uni.length;i++){
            if(uni[i]==null){
                uni[i]=d;
                return i;
            }
        }return -1;
    }


    public String inserimentoPos(int pos,Docente d){
        if(pos>=0 && pos<this.uni.length && this.uni[pos]==null){
            uni[pos]=d;
            return "inserito correttamente";
        }
        return "non inserito";
    }


    public Docente rimozione(int pos){
        Docente d=null;
        if(pos>=0 && pos<this.uni.length && this.uni[pos]!=null){
            d=uni[pos];
            uni[pos]=null;
            return d;
        }
        return null;
    }


    public String lista(){
        String s="";
        for(int i=0;i<this.uni.length;i++){
            if(this.uni[i]!=null){
                s=s+this.uni[i].descrizione()+"\n";
            }else{
                s=s+"null"+"\n";
            }
        }
        return s;
    }





}
