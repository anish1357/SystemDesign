package Creational.Factory.ShapeExample;

public class Runner {
    public static void main(String[] args)  {
        ShapeFactory shapeFactory = new ShapeFactory();
        try{
            Shape shape1 = shapeFactory.getShape("Circle");
            Shape shape2 = shapeFactory.getShape("Rectangle");
            shape1.Area();
            shape2.Area();
//            shapeFactory.getShape("dwf").Area();
        }catch (Exception e){
            System.out.println("Invalid Shape");
        }


    }
}
