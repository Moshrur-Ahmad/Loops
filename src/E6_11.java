import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class E6_11 {
    public static void printSubstrings(String word) {
        ArrayList<String> substrings = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                substrings.add(word.substring(i, j));
            }
        }

        substrings.sort(Comparator.comparingInt(String::length));
        substrings.forEach(System.out::println);
    }
}
