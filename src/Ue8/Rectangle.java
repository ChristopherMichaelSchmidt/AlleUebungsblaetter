package Ue8;

public class Rectangle extends Figure{

    private double length;
    private double widht;

    public Rectangle(double length, double widht) {
        this.length = length;
        this.widht = widht;
    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * widht);
    }

    @Override
    public double getArea() {
        return  length * widht;
    }
}
