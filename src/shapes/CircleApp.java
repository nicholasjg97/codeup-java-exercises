package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
//        String prompt = "Enter the radius of the circle";
//        System.out.println(prompt);
        Input input = new Input();
        double radius = input.getDouble("Enter the radius of your circle");
        Circle circle = new Circle(radius);
        double area = circle.getArea();
        double circumference = circle.getCircumference();
        System.out.println("The area of your circle is " + area + " and it's circumference is " + circumference);
    }

}
