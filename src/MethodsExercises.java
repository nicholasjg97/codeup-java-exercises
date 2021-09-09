import java.util.Scanner;

public class MethodsExercises {

    public static int Addition(int a, int b) {
        return a + b;
    }

    public static int Subtraction(int a, int b) {
        return a - b;
    }

    public static int Multiplication(int a, int b) {
        return a * b;
    }

    public static int Division(int a, int b) {
        return a / b;
    }

    public static int Modulus(int a, int b) {
        return a % b;
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = sc.nextInt();

        if (userInput > min && userInput < max) {
            System.out.println("The number " + userInput + " is between 1 and 10");
            return userInput;
        }
        System.out.println("The number " + userInput + "is not between 1 and 10.");
        return getInteger(min, max);
    }

    public static void main(String[] args) {
        System.out.println(Addition(3, 6));
        System.out.println(Subtraction(6, 3));
        System.out.println(Multiplication(6, 3));
        System.out.println(Division(6, 3));
        System.out.println(Modulus(9, 2));
        getInteger(1, 10);
    }

}
