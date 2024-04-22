
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String nameOldest = "";
        while (true) {
            String text = scanner.nextLine();
            String[] piece = text.split(",");
            if (text.equals("")) {
                break;
            }
            if (age < Integer.valueOf(piece[1])) {
                age = Integer.valueOf(piece[1]);
                nameOldest = piece[0];
            }
        }
        System.out.println("Name of the oldest: " + nameOldest);
    }
}
