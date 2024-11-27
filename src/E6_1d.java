import java.util.Scanner;

public class E6_1d {
    public static int sumOddNumbers(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
}
