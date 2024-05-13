package geometry;

import java.util.Date;

public class Circle extends GeometryObject {

    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int radius, String color, boolean filled, Date dateCreated) {
        super(color, filled, dateCreated);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double gePerimeter() {
        return Math.PI * 2 * radius;
    }

}
