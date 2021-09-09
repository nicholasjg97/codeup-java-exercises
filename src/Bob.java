import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, I'm bob");
        String userInput = scanner.nextLine();

        if (userInput.endsWith("?")) {
            System.out.println("Sure, I guess");
        } else if (userInput.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userInput.equals("")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever");
        }

    }

}
