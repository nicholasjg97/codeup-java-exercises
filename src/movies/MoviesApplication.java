package movies;

import java.util.Scanner;

public class MoviesApplication {

    public static void runApplication() {
        Scanner sc = new Scanner(System.in);

        int userInput;

        do {

            System.out.println("What would you like to do?");
            System.out.println();
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println();
            System.out.println("Enter your choice: ");
            userInput = sc.nextInt();

            for (Movie movies : MoviesArray.findAll()) {
                if (userInput == 0) {
                    break;
                } else if (userInput == 1) {
                    System.out.println(movies.getName());
                } else if (userInput == 2) {
                    if (movies.getCategory().equals("animated")) {
                        System.out.println(movies.getName());
                    }
                } else if (userInput == 3) {
                    if (movies.getCategory().equals("drama")) {
                        System.out.println(movies.getName());
                    }
                } else if (userInput == 4) {
                    if (movies.getCategory().equals("horror"))
                        System.out.println(movies.getName());
                } else if (userInput == 5) {
                    if (movies.getCategory().equals("scifi")) {
                        System.out.println(movies.getName());
                    }
                } else if (userInput == 6) {
                    if (movies.getCategory().equals("musical")) {
                        System.out.println(movies.getName());
                    }
                }
            }



        } while (userInput != 0);
    }

    public static void main(String[] args) {
        runApplication();
    }

}
