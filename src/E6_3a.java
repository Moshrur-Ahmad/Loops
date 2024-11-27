public class E6_3a {
    public static String extractUppercase(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
