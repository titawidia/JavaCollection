package bagian7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.add("Aera");
        collection.add("Hye");
        collection.add("Ren");
        collection.addAll(List.of("Programmer", "Zaman", "Now"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println("REMOVE");

        collection.remove("Aera");
        collection.removeAll(List.of("Zaman", "Now"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println(
                collection.containsAll(List.of("Ren", "Programmer"))
        );

        System.out.println(collection.size());
    }
}
