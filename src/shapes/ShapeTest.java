package shapes;

public class ShapeTest {

    public static void main(String[] args) {

        System.out.println("myShape Rectangle");
        Measurable myShape = new Rectangle(4, 5);
        System.out.println("Perimeter:" + myShape.getPerimeter());
        System.out.println("Area: " + myShape.getArea());

        System.out.println("myShape -- Square");
        Measurable myShape2 = new Square(5);
        System.out.println("Perimeter:" + myShape2.getPerimeter());
        System.out.println("Area: " + myShape2.getArea());




//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println("Box1");
//        System.out.println("Area: " + box1.getArea());
//        System.out.println("Perimeter: " + box1.getPerimeter());
//
//
//        Rectangle box2 = new Square(5);
//        System.out.println("Box2");
//        System.out.println("Area: " + box2.getArea());
//        System.out.println("Perimeter: " + box2.getPerimeter());

    }


}
