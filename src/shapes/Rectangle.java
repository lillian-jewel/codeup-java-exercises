package shapes;

public class Rectangle {

//    It should have protected properties for both length and width.
//    Rectangle should define a constructor that accepts two numbers
//    for length and width, and sets those properties.

    protected double length;
    protected double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

//    Create two methods on the Rectangle class, getArea and
//    getPerimeter that return the respective values.

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return 2 * (length + width);
    }
}
