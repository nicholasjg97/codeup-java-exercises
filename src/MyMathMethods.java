public class MyMathMethods {


    public static int multiply(int a, int b) {
        return a * b;
    }

    // 1. use method overloading to create a public static multiply method tht works with doubles

    public static double multiply(double num1, double num2) {return num1 * num2;}

    // 2. write a public static method named quotient that works with both integers and doubles (use method overloading) and returns the result of dividing the two passed numbers.

    public static int quotient(int num1, int num2) {return num1 / num2;}

    public static double quotient(double num1, double num2) {return num1 / num2;}

    // 3. write a public static method named sum that takes in an array of int numbers (not a list, an array), and returns the sum of the numbers

    public static int arraySum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // 4. Create a class called Movie. The class should define two instance variables of type String named name and director. Add a constructor that takes two strings and sets the name and director properties based on the passed arguments. Make it so the instance variables are not accessible from outside the Movie class. Write getters and setters for the instance variables.




    // Bonus: if the passed name or director arguments are null or empty, the constructor should throw an IllegalArgumentException





}
