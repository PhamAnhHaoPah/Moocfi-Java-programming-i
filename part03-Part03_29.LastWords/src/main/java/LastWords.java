
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();
            String[] piece = text.split(" ");
            if (piece[piece.length - 1] != null) {
                System.out.println(piece[piece.length - 1]);
            }
            if (text.equals("")) {
                break;
            }
        }
    }
}
