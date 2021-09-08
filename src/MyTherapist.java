import java.util.Scanner;

public class MyTherapist {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How are you doing today? Good, great, bad, or terrible?");
        String userInput = scanner.nextLine();

        if (userInput.equals("good")) {
            System.out.println("That's good to hear! Remember today's a new present!");
        } else if (userInput.equals("great")) {
            System.out.println("It's only going to get better!");
        } else if (userInput.equals("bad")) {
            System.out.println("Just take it slow! Things may not be going right for you, but just keep your head up!");
        } else if (userInput.equals("terrible")) {
            System.out.println("Sorry to hear that! Just take some deep breaths and go outside and think of happy times!");
        } else {
            System.out.println("That is too complicated for me, you will have to pay for extra time for that one.");
        }




    }

}
