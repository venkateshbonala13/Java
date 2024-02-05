package streamsAndLambdas;

import java.util.Arrays;
import java.util.Comparator;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        String[] strings = {"mazda", "toyota", "honda", "chevy", "dodge"};

        Arrays.stream(strings)
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
                .sorted()
                .forEach(System.out::println);
    }
}