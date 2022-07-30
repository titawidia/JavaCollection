package bagian7;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {

        // Set<String> names = new HashSet<>(); // hasilnya tidak terurut
        Set<String> names = new LinkedHashSet<>(); // hasilnya terurut
        names.add("Aera");
        names.add("Hye");
        names.add("Ren");
        names.add("Aera");
        names.add("Hye");
        names.add("Ren");

        for (var name : names) {
            System.out.println(name);
        }
    }
}
