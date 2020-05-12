package model;

public class Circle {
    private double r;
    private Point point;

    public Circle(Point p1, double r){
        point = p1;
        this.r = r;
    }

    public boolean isInCircle(Point pointToCheck){
        double result = Math.pow(pointToCheck.getX() - point.getX(),2) + Math.pow(pointToCheck.getY() - point.getY(),2);
        if(result<Math.pow(r,2)){
            return true;
        }else{
            return false;
        }
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
