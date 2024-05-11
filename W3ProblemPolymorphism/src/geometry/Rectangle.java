
package geometry;

public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(double height, double width, double area, double perimeter) {
        super(area, perimeter);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        super.perimeter=2*(height+width);
        return super.perimeter; 
    }

    @Override
    public double getArea() {
        super.area=height*width;
        return super.area; 
    }
    
    
    
    
}
