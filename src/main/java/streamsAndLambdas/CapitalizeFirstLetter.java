package streamsAndLambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CapitalizeFirstLetter {

    public static List<String> capitalizeAndSort(String[] strings) {
        return Arrays.stream(strings)
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
                .sorted()
                .collect(Collectors.toList());
    }
}