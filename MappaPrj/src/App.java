import java.util.HashMap;
import java.util.TreeMap;

import javax.print.attribute.HashPrintRequestAttributeSet;

public class App {
    public static void main(String[] args) throws Exception {

        HashMap hm = new HashMap();
        hm.put(args, hm);

        MappaInt mi = new MappaInt(100);
        mi.put("Mario", 10);
        mi.put("Anna", 12);


        System.out.println(mi.get("Anna"));
        System.out.println(mi.toString());
    }
}
