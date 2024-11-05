public class App {
    public static void main(String[] args) throws Exception {
        Libro l1 = new Libro("Il conte di Montecristo", "Dumas", 400);
        Libro l2 = new Libro("La divina commedia", "Dante", 800);

        Mensola m1 = new Mensola();
        if(m1.setLibro(l1, 0) < 0)
            System.out.println("Errore di inserimento del libro " + l1);
        if(m1.setLibro(l2, 4) < 0)
            System.out.println("Errore di inserimento del libro " + l2);

        // Stampare i libri della mensola
       
        for(int i=0;i<m1.getLibri().length;i++){
            if(m1.getLibri()[i]!=null){
                System.out.println(m1.getLibri()[i]);
            }
        }
        for(int i=0;i<m1.getMaxNumLibri();i++){
            if(m1.getLibro(i)!=null){
                System.out.println(m1.getLibro(i));

            }
        }
    }
}
