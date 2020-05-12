package model;

public class Rectangle{
    private Point [] points = new Point[4];
    public Rectangle(Point p1, Point p2, Point p3, Point p4){
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
        points[3] = p4;
    }

    public double rectangleArea(){
        double lengthA = Math.abs(Math.sqrt(Math.pow(points[1].getX()-points[0].getX(),2)
                +Math.pow(points[1].getY()-points[0].getY(),2)));

        double lengthB = Math.abs(Math.sqrt(Math.pow(points[3].getX()-points[2].getX(),2)
                +Math.pow(points[3].getY()-points[2].getY(),2)));

        return lengthA*lengthB;
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }
}
