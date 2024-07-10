package Creational.Factory.ShapeExample;

public class ShapeFactory {

    public Shape getShape(String s) throws Exception {

    switch(s){
        case "Circle" :
            return new Circle();
        case "Rectangle":
            return new Rectangle();
        default :
            throw new Exception("Not a valid shape");
    }
    }
}
