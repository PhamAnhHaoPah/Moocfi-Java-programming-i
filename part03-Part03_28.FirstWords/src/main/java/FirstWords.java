
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();
            String[] piece = text.split(" ");
            if (piece[0] != null) {
                System.out.println(piece[0]);
            }
            if (text.equals("")) {
                break;
            }
        }
    }
}
