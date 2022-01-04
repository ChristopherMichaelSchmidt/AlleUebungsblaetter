package Ue8;

public class Circle extends  Figure{
    private double radius;





    @Override
    public double getPerimeter() {
       return 2* radius * 3.124;
    }

    @Override
    public double getArea() {
        return 3.124* (radius*radius);
    }
}
