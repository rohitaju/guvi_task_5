import java.util.*;
import java.util.stream.*;

public class StudentFilter {
    public static void main(String[] args) {
        List<String> students = Arrays.asList(
                "Aarav", "Bhavya", "Anjali", "Chetan", "Amit",
                "Divya", "Arjun", "Esha", "Ajay", "Fatima"
        );

        List<String> startsWithA = students.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Students whose names start with 'A': " + startsWithA);
    }
}
