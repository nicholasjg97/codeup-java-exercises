import java.util.Scanner;

public class ConsoleIOLecture {

    public static void main(String[] args) {
//        String myCohort = "Draco";
//        String timeOfDay = "morning";
//        System.out.println(myCohort);
//        System.out.printf("Good %s, %s!%n", timeOfDay, myCohort);
//        System.out.println("Will this be a separate line?");

//        Scanner scanner = new Scanner(System.in);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a string:");
//        String userInput = scanner.nextLine();
//        System.out.println("Your word was " + userInput);

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name:");
//        String userInput = scanner.nextLine();
//        System.out.println("Your name is " + userInput);
//        System.out.printf("Your name is %s", userInput);

        System.out.println("Enter an integer: ");
//        System.out.printf("You entered %d%n", userInput);
//        Option 1: an extra nextLine()
//        String ghostString = scanner.nextLine();
//        Option 2: concatenate a .next() and a .nextLine()
        String firstString = scanner.next() + scanner.nextLine();
//        int userInputInt = Integer.parseInt(scanner.next());
//        Option 3: use all .nextLine - parse the input
//        int userInput = scanner.nextInt();
        System.out.println("Enter a string: ");
        System.out.println("Enter another string");
        String secondString = scanner.nextLine();

        System.out.println("First sentence: " + firstString + "\n Second string: " + secondString);


    }
}
