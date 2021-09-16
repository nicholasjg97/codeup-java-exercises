package shapes;

public class Square extends Rectangle {

    public int side;

    public Square(int side){
        super(side, side);
    }

    // can use .length, using super instead of this also works and helps others know what you're doing

    @Override
    public int getArea() {
        return this.length * 2;
    }

    @Override
    public int getPerimeter() {
        return 4 * this.length;
    }
}
