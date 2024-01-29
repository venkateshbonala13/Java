package strings;

public class  Reverse {

    static String reverseEachWordOfString(String inputString) {
        String[] words = inputString.split(" ");

        String reverseString = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            String reverseWord = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }

            reverseString = reverseString + reverseWord + " ";
        }


        return reverseString;
    }

}