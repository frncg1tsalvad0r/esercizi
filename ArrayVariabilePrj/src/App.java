import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList al = new ArrayList();
        al.size();
        ArrayVariabileInt av = new ArrayVariabileInt();
        av.add(1);
        av.add(2);
        av.add(33);
        av.add(66);
        av.add(66);
        av.add(88);
        av.add(11);


        System.out.println(av);

        av.set(2,99);

        System.out.println(av);



    }
}
