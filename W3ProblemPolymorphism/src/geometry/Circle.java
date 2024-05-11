
package geometry;

public class Circle extends Shape{
    private double radious;

    public Circle() {
    }

    public Circle(double radious) {
        this.radious = radious;
    }

    public Circle(double radious, double area, double perimeter) {
        super(area, perimeter);
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    @Override
    public double getPerimeter() {
        super.perimeter=2*radious*Math.PI;
        return super.perimeter; 
    }

    @Override
    public double getArea() {
        super.area=radious*radious*Math.PI;
        return super.area; 
    }
    
    
}
