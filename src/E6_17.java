public class E6_17 {
    public static void printSquares(int size) {
        for (int i = 0; i < size; i++) {
            // Filled square
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }

            // Hollow square
            System.out.print(" ");
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
