
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }

    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        for (int i = 1; i <= height; i++) {
            int starCount = (i * 2) - 1;
            int spaceCount = height - i;
            for (int j = 1; j <= spaceCount; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= starCount; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int starRoot = ((height * 2) - 1 - 3) / 2;
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= starRoot; j++) {
                System.out.print(" ");
            }
            System.out.println("***");
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        // printTriangle(5);
        // System.out.println("---");
        // christmasTree(4);
        // System.out.println("---");
        christmasTree(4);
    }
}
