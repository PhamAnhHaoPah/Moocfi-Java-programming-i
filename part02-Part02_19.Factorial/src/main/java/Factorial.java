
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int factorialNumber = 1;
        int number = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            factorialNumber = factorialNumber * i;
        }
        System.out.println("Factorial: " + factorialNumber);
    }
}
