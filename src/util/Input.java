package util;

import java.util.Locale;
import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public String getString() {
        System.out.println("Please enter a string");
        String userInput = scanner.nextLine();
        return userInput;
    }

//    public Input() {
//        this.scanner = new Scanner(System.in);
//    }

    public boolean yesNo(String input) {
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

//    public boolean yesNo(String input) {
//        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
//    }

    public boolean yesNo() {
        System.out.println("Do you agree?");
        String answer = scanner.next();
        return answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes");
    }

    public int getInt() {
        System.out.println("Enter an integer:");
        int userInput = scanner.nextInt();
        return userInput;
//        try {
//            return Integer.valueOf(getString());
//        } catch (NumberFormatException nfe){
//            System.out.println("Error: Not an integer");
//            return getInt();
//        }
    }


    public int getInt(int min, int max) {
//        System.out.println("Enter a number between " + min + " and " + max);
//        int userInput = scanner.nextInt();
//        if (userInput > min && userInput < max) {
//            getInt(min, max);

        int number;
        try {
            number = Integer.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Error: Not an integer!");
            return getInt(min, max);
//        return userInput;
        }

        if (number >= min && number <= max){
            return number;
        }
        else {
            System.out.println("Error: Not Recognized!");
            return getInt(min, max);
        }
    }

    public double getDouble(double min, double max) {
//        System.out.println("Enter a number between " + min + " and " + max);
//        double userInput = scanner.nextInt();
//        if (userInput < min || userInput > max) {
//            getDouble();
//        }
//        return userInput;
//        System.out.println("Enter a number:");
//        double userInput = scanner.nextDouble();
//        return userInput;

        double number;
        try {
            number = Double.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Error: Not a double!");
            return getDouble(min, max);
        }
        if (number >= min && number <= max) {
            return number;
        }
        else {
            System.out.println("Error: Number recognized!");
            return getDouble(min, max);
        }
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        double userInput = scanner.nextDouble();
        return userInput;
//        try{
//            return Double.valueOf(getString());
//        } catch(NumberFormatException e){
//            System.out.println("Error: Input is not a double!");
//            return getDouble();
//        }

    }

    // When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class.
    public Input(){
        this.scanner = new Scanner(System.in);
    }
}
