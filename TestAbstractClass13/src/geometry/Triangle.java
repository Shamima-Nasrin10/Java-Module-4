package geometry;

import java.util.Date;

public class Triangle extends GeometryObject {

    private double base;
    private double side2;
    private double side3;
    private double height;

    public Triangle() {
    }

    public Triangle(double base, double side2, double side3, double height) {
        this.base = base;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
    }

    public Triangle(double base, double side2, double side3, double height, String color, boolean filled, Date dateCreated) {
        super(color, filled, dateCreated);
        this.base = base;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public double gePerimeter() {
        return base + side2 + side3;
    }

}
