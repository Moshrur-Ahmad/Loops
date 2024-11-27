public class E6_2a {
    public static int[] findMinMax(int[] numbers) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new int[]{min, max};
    }
}
