import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayVariabileInt av = new ArrayVariabileInt();
        av.add(1);
        av.add(2);
        av.add(33);
        av.add(66);
        av.add(66);
        av.add(88);
        av.add(11);

        System.out.println(av);

        av.add(0, 99);

        System.out.println(av);

        av.set(2,99);

        System.out.println(av);

        ArrayVariabileObject avo = new ArrayVariabileObject();
        avo.add("ciao");
        Persona p = new Persona();
        p.nome = "Mario";
        avo.add(p);
        System.out.println(avo.toString());
        avo.add(new Integer(3));
        avo.add(3);
        avo.add(new Float(3.14));
        avo.add(3.14);

        ArrayVariabile<String> avs = new ArrayVariabile<>();
        avs.add("Mario");

        ArrayList<String> als = new ArrayList<>();
        als.add("Uno");

        String s = als.get(0);

        ArrayList alng = new ArrayList();
        alng.add("Due;");

        String k = (String)alng.get(0);
    }
}
