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

}
