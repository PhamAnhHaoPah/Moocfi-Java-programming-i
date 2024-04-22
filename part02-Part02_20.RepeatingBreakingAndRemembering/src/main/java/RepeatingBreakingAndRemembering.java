
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int count = 0;
        double averageNumber = 0;
        int evenNumber = 0;
        int oddNumber = 0;
        while (true) {
            int numbers = Integer.valueOf(scanner.nextLine());
            if (numbers == -1) {
                break;
            }
            sum += numbers;
            count++;
            if (numbers % 2 == 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
        }
        System.out.println("Thx!Bye!");
        System.out.println("Sum: " + sum);
        if (count > 0) {
            averageNumber = (double) sum / count;
        }
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + averageNumber);
        System.out.println("Even: " + evenNumber);
        System.out.println("Odd: " + oddNumber);
    }
}
