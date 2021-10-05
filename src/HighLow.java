import java.util.Scanner;

public class HighLow {

    public static int getRandomNumber() {
        return (int) Math.floor(Math.random() * 100) + 1;
    }

    public static void runGame() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100");
        int userGuess = sc.nextInt();

        if (userGuess > getRandomNumber()) {
            System.out.println("LOWER!");
            runGame();
        } else if (userGuess < getRandomNumber()) {
            System.out.println("HIGHER!");
            runGame();
        } else System.out.println("GOOD GUESS!");

    }

    public static void main(String[] args) {
        runGame();
    }
}
