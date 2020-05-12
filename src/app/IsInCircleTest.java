package app;

import model.Circle;
import model.Point;
import model.Rectangle;

public class IsInCircleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(1,1),new Point(1,-1),new Point(-1,-1),new Point(-1,1));
        System.out.println(rectangle.rectangleArea());
        Circle circle = new Circle(new Point(3,3),1);
        System.out.println(circle.isInCircle(rectangle.getPoints()[0]));
    }
}
