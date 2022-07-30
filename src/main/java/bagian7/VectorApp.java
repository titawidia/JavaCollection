package bagian7;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {

        List<String> list = new Vector<>();

        list.add("Aera");
        list.add("Hye");
        list.add("Ren");

        for (var value : list) {
            System.out.println(value);
        }
    }
}
