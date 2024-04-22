
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int swap = 0;
        while (true) {
            String text = scanner.nextLine();
            String[] piece = text.split(",");

            if (text.equals("")) {
                break;
            }
            if (swap < Integer.valueOf(piece[1])) {
                swap = Integer.valueOf(piece[1]);
            }

        }
        System.out.println("Age of the oldest: " + swap);
    }
}
