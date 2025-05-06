import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String input = scanner.nextLine();

        LocalDate birthDate = LocalDate.parse(input);
        LocalDate today = LocalDate.now();

        Period age = Period.between(birthDate, today);

        System.out.printf("Your age is: %d years, %d months, and %d days.%n",
                age.getYears(), age.getMonths(), age.getDays());
    }
}
