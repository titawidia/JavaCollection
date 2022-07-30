package bagian7;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {

        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("name", "Aera");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Aera");
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of(
                "first", "Aera",
                "middle", "Hye",
                "last", "Ren"
        );

        // map.put("a", "A"); // ERROR
    }
}
