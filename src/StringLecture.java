import java.util.Scanner;

public class StringLecture {

    // do not compare strings in Java with comparison operator
    // use the comparison operator == for primitive variables

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String userInput = sc.next();
//        if (userInput == "Justin") {
//            System.out.println("The user entered the string 'Justin'");
//        } else {
//            System.out.println("The user did not enter the string 'Justin'");
//        }

        String justin = "Justin";
        if (userInput.equals(justin)) {
            System.out.println("The user entered the string 'Justin'");
        } else {
            System.out.println("The user did not enter the string 'Justin'");
        }

    }

}
