
package w3problempolymorphism;

import geometry.Circle;
import geometry.Rectangle;
import geometry.Triangle;
import playsport.Basketball;
import playsport.Football;
import playsport.Rugby;

public class W3ProblemPolymorphism {

    public static void main(String[] args) {

//        Circle circle=new Circle(4, 0, 0);
//        Rectangle rectangle=new Rectangle(5, 6);
//        Triangle triangle=new Triangle(8, 2, 5, 5);
//        
//        System.out.println("Area of circle= "+circle.getArea());
//        System.out.println("Perimeter of circle= "+circle.getPerimeter());
//        
//        System.out.println("Area of rectangle= "+rectangle.getArea());
//        System.out.println("Perimeter of rectangle= "+rectangle.getPerimeter());
//        
//        System.out.println("Area of triangle= "+triangle.getArea());
//        System.out.println("Perimeter of triangle= "+triangle.getPerimeter());

        Football f=new Football();
        Basketball b=new Basketball();
        Rugby r=new Rugby();
        
        System.out.println(f.play());
        System.out.println(b.play());
        System.out.println(r.play());
        
        
        
        

    }
    
}
