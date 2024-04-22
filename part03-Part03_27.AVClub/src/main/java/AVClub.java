
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();
            String[] piece = text.split(" ");
            for (int i = 0; i < piece.length; i++) {
                if (piece[i].contains("av")) {
                    System.out.println(piece[i]);
                }

            }
            if (text.equals("")) {
                break;
            }
        }
    }
}
