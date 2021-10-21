import java.util.List;

public class JavaDrills {


// Create a public static method, `flipOuterCase`, that takes in a string and returns the string with the case reversed for the first and last letters. Assume the input will be three or more characters long.
//    public static String flipOuterCase(String string) {
//        if (string.length() > 3) {
//            return
//        }
//    }

    // Create a static method, returnTotalDifference, that takes in two lists of integers and returns the difference between the sum of all integers in the first list minus the sum of all integers in the second list.

    public static int returnTotalDifference (List<Integer> a, List<Integer> b) {

        int sumFirst = 0;
        int sumSecond = 0;

        for (int integer : a) {
            sumFirst += integer;
        }

        for (int integer : b) {
            sumSecond += integer;
        }
        return sumFirst - sumSecond;
    }

//    Create a public static method, `flipInnerCase`, that takes in a string and returns the string with the case of all letters reversed EXCEPT for the first and last letters. Assume the input will be three or more characters long.

    public static String flipInnerCase (String input) {

        int stringLength = input.length();
        String letter1 = input.substring (0,1);
        String lastletter = input.substring ((stringLength-1),(stringLength));
        String newWord =letter1.toUpperCase() + input.substring(1, input.length() - 1) + lastletter.toUpperCase();

        return newWord;

    }

}
