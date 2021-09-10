import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        Below will be an infinite loop unless set to (i > 0) in the while. why?
//        Will infinite loop if while is set to any number higher than 65536

//        int i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i > 0 && i < 1000000);

//        unless 'data-type' is changed to 'long'
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);

//        for loops
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i + " ");
//        }

//        for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }

//        for (int i = 100; i >= -10; i -=5) {
//            System.out.println(i);
//        }

//        for (int i = 2; i > 0 && i < 1000000; i *= i) {
//            System.out.println(i);
//        }

//        'data-type' changed to long
//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }

//        FizzBuzz
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("Fizzbuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        Table of Powers
//        Scanner sc = new Scanner(System.in);
//        System.out.println("What number would you like to go up to?");
//        long userInput = sc.nextInt();
//        System.out.println("Here is your table!");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | ------");
//        for (int i = 1; i <= userInput; i++) {
//            if((i*i)< 10){
//                System.out.print(i + "      | ");
//                System.out.print((i*i) + "       | " + (i*i*i) + "\n");
//            } else {
//                System.out.print(i + "      | ");
//                System.out.print((i * i) + "      | " + (i*i*i) + "\n");
//            }
//        }

//        Letter Grades

        Scanner sc = new Scanner(System.in);
        String userInput = "";
        do {

            System.out.println("Give us a numerical grade from 0 to 100");
            int userGrade = sc.nextInt();
            if (userGrade <= 100 && userGrade >= 88) {
                System.out.println("That's an A");
            } else if (userGrade <= 87 && userGrade >= 80) {
                System.out.println("That's a B");
            } else if (userGrade <= 79 && userGrade >= 67) {
                System.out.println("That's a C");
            } else if (userGrade <= 66 && userGrade >= 60) {
                System.out.println("That's a D");
            } else {
                System.out.println("That's an F");
            }
            System.out.println("Would you like to continue? yes/no");
            userInput = sc.next();

        } while (userInput.equals("yes"));





    }

}
