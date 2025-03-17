import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        CodaInt c=new CodaInt();
        c.offer(10);
        c.offer(20);
        c.offer(30);
        System.out.println(c.toString());
        System.out.println(c.remove());
        System.out.println(c.toString());


        
    }
}
