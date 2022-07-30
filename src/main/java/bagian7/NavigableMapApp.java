package bagian7;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Aera", "Aera");
        map.put("Jaem", "Jaem");
        map.put("Mark", "Mark");

        for (var key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println(map.lowerKey("Irene"));
        System.out.println(map.higherKey("Aera"));
        System.out.println(map.floorKey("Aera"));
        System.out.println(map.ceilingKey("Aera"));

        NavigableMap<String, String> mapDesc = map.descendingMap();
        for (var key : mapDesc.keySet()) {
            System.out.println(key);
        }

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);

        // immutable.put("Aera", "Aera"); // ERROR
    }
}
