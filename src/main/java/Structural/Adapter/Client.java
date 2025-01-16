package Structural.Adapter;

public class Client {
    public static void main(String args[]){
        Square square = new Square(5);
        square.getArea();
        Rectangle rectangle = new Rectangle(5,6);
        rectangle.getArea();
        Rectangle rectangle1 = new SquareAdapter(square);
        rectangle1.getArea();

    }
}
