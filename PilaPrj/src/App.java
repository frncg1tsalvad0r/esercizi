import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        
        StackInt s = new StackInt();
        s.push(5);
        s.push(6);
        s.push(7);
        System.out.println(s.pop());
        System.out.println("Ciao");

        System.out.println(s.pop());
        s.push(10);
        s.push(20);
        System.out.println(s.pop());

        StackObject so = new StackObject();
        so.push("Ciao");
        so.push(10);

        Stack<String> ss = new Stack<>();
        ss.push("Ciao");


        Stack<LocalDate> s1 = new Stack<>();
        s1.push(LocalDate.now());

        
    }
}
