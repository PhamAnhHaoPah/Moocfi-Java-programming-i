
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Try your method here
        printNumbersInRange(numbers, 0, 5);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (Integer integer : numbers) {
            if (integer >= lowerLimit && integer <= upperLimit) {
                System.out.println(integer);
            }
        }
    }
}
