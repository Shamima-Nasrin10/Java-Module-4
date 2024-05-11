
package testabstractclass13;

import geometry.Circle;
import geometry.GeometryObject;
import geometry.Rectangle;
import geometry.Triangle;

public class TestAbstractClass13 {

    public static void main(String[] args) {

        GeometryObject circle= new Circle(5);
        GeometryObject rectangle=new Rectangle(5, 6);
        GeometryObject triangle= new Triangle(7, 8, 15, 6);
        
        circle.setColor("Brown");
        getGeometryObject(circle);
        getGeometryObject(rectangle);
        getGeometryObject(triangle);
    }
    
    public static void getGeometryObject(GeometryObject object){
        System.out.println("Area: "+object.getArea()); 
        System.out.println("Perimeter: "+object.gePerimeter());
        System.out.println("Color is: "+object.getColor());
                
    }
    
}
