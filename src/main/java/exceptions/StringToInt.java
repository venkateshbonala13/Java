package exceptions;

public class StringToInt {

    public static void convertAndPrint(String input) {
        try {
            int result = convertToInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }

    public static int convertToInt(String input) throws NumberFormatException {
        return Integer.parseInt(input);
    }
}