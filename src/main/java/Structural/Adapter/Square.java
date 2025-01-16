package Structural.Adapter;

public class Square {
    public Integer length;

    public Square(Integer length) {
        this.length = length;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    void getArea(){
        System.out.println("Area of a Square is : " + this.length*this.length);
    }
}
