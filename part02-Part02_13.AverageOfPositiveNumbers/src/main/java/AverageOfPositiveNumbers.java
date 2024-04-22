
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average = 0;
        int number;
        int count = 0;
        int sum = 0;
        while (true) {
            number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            if (number > 0) {
                sum = sum + number;
                count = count + 1;
            }
        }
        average = (double) sum / count;
        if (average > 0) {
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average\r\n");
        }

    }
}
