
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        System.out.println("Search for? ");
        Integer numberSearch = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (numberSearch == list.get(i)) {
                System.out.println(numberSearch + " is at index " + i);
            }
        }

        // implement here finding the indices of a number
    }
}
