public class E6_10 {
    public static int countVowels(String word) {
        int count = 0;
        for (char c : word.toLowerCase().toCharArray()) {
            if ("aeiouy".indexOf(c) >= 0) {
                count++;
            }
        }
        return count;
    }
}
