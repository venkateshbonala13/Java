package streamsAndLambdas;

import java.util.ArrayList;
import java.util.List;

public class VowelFinder {
    public static List<String> findStringsWithVowels(String[] strings) {
        List<String> result = new ArrayList<>();

        for (String str : strings) {
            if (containsVowels(str)) {
                result.add(str);
            }
        }

        return result;
    }

    private static boolean containsVowels(String str) {
        return str.matches(".*[aeiouAEIOU].*");
    }

    public static int countVowels(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}