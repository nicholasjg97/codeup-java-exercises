import java.util.Scanner;

public class MethodWarmup {

//    TODO: create a method, getDifference, that takes in two integers and returns the difference between the higher integer and the lower integer (subtract).
//            - If both integers are equal, the order of operands doesn’t matter in the calculation.
//          - If only one integer is passed, treat the calculation as if zero was passed as the second argument.
//          *** BONUS *** allow the method to accept two doubles and return a double output

    public static int getDifference(int a, int b) {
        if (b > a) return b - a;
            return a - b;
    }

    public static int getDifference(int a) {
        return getDifference(a, 0);
    }

    public static double getDifference(double a, double b) {
        if (b > a) return b - a;
        return a - b;
    }


    // TODO: use recursion to add all numbers up, from 1 to the given number input
    /*
        addNums(5) would trigger a calculation of...
            5 + 4 + 3 + 2 + 1, evaluating to 15
     */
     public static int addNum(int num) {
        if (num == 1) return 1;
        return addNum(num - 1) + num;
     }

}
