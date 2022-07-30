package bagian7;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {

        Map<String, String> map = new Hashtable<>();

        map.put("Aera", "Aera");
        map.put("Jaem", "Jaem");
        map.put("Mark", "Mark");

        for (var key : map.keySet()) {
            System.out.println(key);
        }
    }
}
