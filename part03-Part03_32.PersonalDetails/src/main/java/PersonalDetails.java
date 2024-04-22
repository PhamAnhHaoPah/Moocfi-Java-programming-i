
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int average = 0;
        int count = 0;
        String longestName = "";
        while (true) {
            String text = scanner.nextLine();
            String[] piece = text.split(",");
            if (text.equals("")) {
                break;
            }

            if (max < Integer.valueOf(piece[1])) {
                max = Integer.valueOf(piece[1]);

            }
            if (longestName.length() < piece[0].length()) {
                longestName = piece[0];
            }
            average += Integer.valueOf(piece[1]);
            count++;
        }
        System.out.println("Longest name:" + longestName);
        System.out.println("Average of the birth years: " + average * 1.0 / count);
    }
}
