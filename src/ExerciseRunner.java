public class ExerciseRunner {
    public static void main(String[] args) {
        // Test E6.1a
        System.out.println("Sum of even numbers: " + E6_1a.sumEvenNumbers());

        // Test E6.1b
        System.out.println("Sum of squares: " + E6_1b.sumSquares());

        // Test E6.1c
        System.out.println("Powers of 2:");
        E6_1c.printPowersOf2();

        // Test E6.1d
        int sumOdd = E6_1d.sumOddNumbers(1, 10);
        System.out.println("Sum of odd numbers between 1 and 10: " + sumOdd);

        // Test E6.1e
        int oddDigitSum = E6_1e.sumOddDigits(32677);
        System.out.println("Sum of odd digits of 32677: " + oddDigitSum);
    }
}
