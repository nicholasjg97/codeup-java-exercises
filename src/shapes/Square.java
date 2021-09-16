package shapes;

public class Square extends Rectangle {

    // used private instead of public, so it cannot be changed outside
    private int side;

    public Square(int side){
        super(side, side);
        this.side = side;
    }

    // can use .length, using super instead of this also works and helps others know what you're doing

    @Override
    public int getArea() {
        return side * 2;
    }

    @Override
    public int getPerimeter() {
        return 4 * side;
    }
}
