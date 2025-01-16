package Structural.Adapter;

public class SquareAdapter  extends  Rectangle{
    public Square square;

    public SquareAdapter(Square square) {
        super(square.getLength(), square.getLength()); // A square has equal width and height
        this.square = square;
    }


}
