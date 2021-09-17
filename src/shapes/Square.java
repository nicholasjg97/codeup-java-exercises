package shapes;

public class Square extends Quadrilateral {

    protected double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return this.side * 4;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.setLength(width);
    }


    // Inheritance and Polymorphism

    // used private instead of public, so it cannot be changed outside
//    private double side;
//
//    public Square(double side){
//        super(side, side);
//        this.side = side;
//    }
//
//    // can use .length, using super instead of this also works and helps others know what you're doing
//
//    @Override
//    public double getArea() {
//        return side * 2;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 4 * side;
//    }
}
