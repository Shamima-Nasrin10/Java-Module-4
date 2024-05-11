
package geometry;

public class Shape {
    
    public double area;
    public double perimeter;

    public Shape() {
    }

    public Shape(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
   
}
