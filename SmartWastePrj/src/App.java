import java.time.LocalDate;


public class App {
    public static void main(String[] args) throws Exception {
        Vetro cv = new Vetro(1, 45, 50, LocalDate.now());
        cv.getCodice();

    }
}
