import java.util.Scanner;

public class MethodsMiniExercises {

    // TODO: break the following code apart into a few methods

    public static String getString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type an input");
        String userInput = sc.nextLine();
        return userInput;
    }

    public static int getInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type an integer");
        int userInt = sc.nextInt();
        return userInt;
    }

    public static void output() {
        String stringInput = getString();
        int intInput = getInt();
        if (stringInput.length() == intInput) {
            System.out.println("That matches the length of the input!");
        } else {
            System.out.println("That doesn't match the length of the input!");
        }
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter an input.");
//        String stringInput = sc.nextLine();
//        System.out.println("Please enter an integer.");
//        int intInput = sc.nextInt(); // assume the user will enter a valid integer
//        if (stringInput.length() == intInput) {
//            System.out.println("That matches the length of the input!");
//        } else {
//            System.out.println("That doesn't match the length of the input!");
//        }
        output();
    }

}
