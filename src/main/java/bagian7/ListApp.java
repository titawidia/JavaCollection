package bagian7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(100);
        // List<String> strings = new LinkedList<>();

        strings.add("Aera");
        strings.add("Hye");

        strings.set(0, "Jaem");

        strings.remove(1);
        System.out.println(strings.get(0));

        for (var value : strings) {
            System.out.println(value);
        }
    }
}
