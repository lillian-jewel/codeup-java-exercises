package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("Rectangle - Perimeter: " + (int) Math.round(box1.getPerimeter()));
        System.out.println("Rectangle - Area: " + (int) Math.round(box1.getArea()));

        Rectangle box2 = new Square(5);
        System.out.println("Square - Perimeter: " + (int) Math.round(box2.getPerimeter()));
        System.out.println("Square - Area: " + (int) Math.round(box2.getArea()));

    }
}
