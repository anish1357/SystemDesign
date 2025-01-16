package Structural.Adapter;

public class Rectangle {

    public Integer length;
    public Integer breadth;

    public Rectangle(Integer length, Integer breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Integer getBreadth() {
        return breadth;
    }

    public void setBreadth(Integer breadth) {
        this.breadth = breadth;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    void  getArea(){
        System.out.println("Area of a rectangle : "+ this.length*this.breadth);
    }
}
