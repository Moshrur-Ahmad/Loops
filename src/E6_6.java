import java.util.Scanner;

public class E6_6 {
    public static void findMinimum() {
        Scanner scanner = new Scanner(System.in);
        boolean first = true;
        int min = 0;

        System.out.println("Enter numbers (type a non-number to stop):");
        while (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            if (first) {
                min = value;
                first = false;
            } else if (value < min) {
                min = value;
            }
        }
        System.out.println("The minimum value is: " + min);
    }
}

