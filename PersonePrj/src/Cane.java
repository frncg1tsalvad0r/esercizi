public class Cane extends Animale {
    
    @Override
    public void comunica() {
        System.out.println("Abbaia");
    }

    @Override   
    public String toString() {
        return "Sono un cane";
    }

    public void morde() {
        System.out.println("Il cane morde");
    }   
}
