
public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = { 5, 1, 3, 4, 2 };
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            // Write some code here
            sum += i;
        }

        return sum;
    }
}
