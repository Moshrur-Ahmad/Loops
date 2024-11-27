import java.util.Random;

public class E6_7 {
    public static String randomPermutation(String word) {
        Random random = new Random();
        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length - 1; i++) {
            int j = random.nextInt(chars.length - i) + i + 1;
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        return new String(chars);
    }
}
