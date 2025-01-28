import java.util.Calendar;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = scanner.nextInt();

        System.out.print("Enter your birth day (1-31): ");
        int birthDay = scanner.nextInt();

        Calendar birthDate = Calendar.getInstance();
        birthDate.set(Calendar.YEAR, birthYear);
        birthDate.set(Calendar.MONTH, birthMonth - 1);
        birthDate.set(Calendar.DAY_OF_MONTH, birthDay);

        Calendar currentDate = Calendar.getInstance();
        int age = currentDate.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);

        if (currentDate.get(Calendar.MONTH) < birthDate.get(Calendar.MONTH) ||
                (currentDate.get(Calendar.MONTH) == birthDate.get(Calendar.MONTH) &&
                        currentDate.get(Calendar.DAY_OF_MONTH) < birthDate.get(Calendar.DAY_OF_MONTH))) {
            age--;
        }

        System.out.println("Your age is: " + age);
    }
}
