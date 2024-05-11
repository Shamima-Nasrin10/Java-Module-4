
package geometry;

public class Triangle extends Shape{
    private double baseSide;
    private double side2;
    private double side3;
    private double height;
    

    public Triangle() {
    }

    public Triangle(double baseSide, double side2, double side3, double height) {
        this.baseSide = baseSide;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
    }

    public Triangle(double baseSide, double side2, double side3, double height, double area, double perimeter) {
        super(area, perimeter);
        this.baseSide = baseSide;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
    }

    

    public double getBaseSide() {
        return baseSide;
    }

    public void setBaseSide(double baseSide) {
        this.baseSide = baseSide;
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
    public double getPerimeter() {
        super.perimeter=baseSide+side2+side3;
        return super.perimeter; 
    }

    @Override
    public double getArea() {
        super.area=(baseSide*height)/2;
        return super.area; 
    }
    
    
    
}
