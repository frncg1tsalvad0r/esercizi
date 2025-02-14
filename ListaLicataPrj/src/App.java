public class App {
    public static void main(String[] args) throws Exception {
        ListaLincataInt lii = new ListaLincataInt();
        lii.addFirst(15);
        lii.add(12);
        System.out.println(lii.toString());
        lii.remove(0);
    }
}
