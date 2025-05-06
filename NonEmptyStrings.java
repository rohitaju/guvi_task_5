import java.util.*;
import java.util.stream.*;

public class NonEmptyStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        List<String> nonEmpty = strings.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        System.out.println("Non-empty Strings: " + nonEmpty);
    }
}
