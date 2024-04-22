
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
        }
        //
        Integer smallestNumber = list.get(0);
        Integer indexSmallest = 0;
        // Tao mot List chua cac vi tri nho nhat cua List
        ArrayList<Integer> indexOfSmallestNumberList = new ArrayList<>();
        for (int j = 0; j < list.size(); j++) {
            if (smallestNumber > list.get(j)) {
                smallestNumber = list.get(j);
                indexOfSmallestNumberList.add(j);
            }

        }

        System.out.println("Smallest number: " + smallestNumber);
        // In ra cac vi tri nho nhat cua list duoc luu trong ArrayList
        // indexOfSmallestNumberList
        for (int i = 0; i < indexOfSmallestNumberList.size(); i++) {
            System.out.println("Found at index: " + indexOfSmallestNumberList.get(i));
        }

    }
}
