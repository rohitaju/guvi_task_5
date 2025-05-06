import java.util.*;
import java.util.stream.*;

public class UppercaseExample {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc", "d", "eP");

        List<String> uppercased = names
                .map(String::toUpperCase) // Lambda: s -> s.toUpperCase()
                .collect(Collectors.toList());

        System.out.println("Uppercased List: " + uppercased);
    }
}