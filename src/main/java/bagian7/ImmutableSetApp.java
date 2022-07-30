package bagian7;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Aera");

        Set<String> mutable = new HashSet<>();
        mutable.add("Aera");
        mutable.add("Hye");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Aera", "Hye");

        // set.add("Aera"); // ERROR
        // set.remove("Aera"); // ERROR

    }
}
