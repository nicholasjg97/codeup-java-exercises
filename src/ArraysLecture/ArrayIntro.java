package ArraysLecture;

import java.util.Arrays;

public class ArrayIntro {

//    TODO: create an array of doubles called numbers and assign five different values (try with and without an initializer).
//    Find the sum of all five double values using an enhanced for loop.

    public static void main(String[] args) {
//        double[] numbers = new double[5];
//        numbers[0] = 1;
//        numbers[1] = 4;
//        numbers[2] = 7;
//        numbers[3] = 3;
//        numbers[4] = 9;
//        System.out.println(numbers.length);

        double[] numbers = {4, 5, 7, 9, 2};
        System.out.println(Arrays.toString(numbers));

        for (double number : numbers) {
            number *= 2;
            System.out.println(number);
        }

    }


}
