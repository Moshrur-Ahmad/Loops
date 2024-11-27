public class E6_13 {
    public static void printBinaryDigits(int number) {
        while (number > 0) {
            System.out.println(number % 2);
            number /= 2;
        }
    }
}
