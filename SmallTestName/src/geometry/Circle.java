/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometry;


public class Circle {
    
    double radius=1;
    public double getArea(){
        double result=Math.PI* Math.pow(radius, 2);
        return result;
//        return Math.PI* Math.pow(radius, 2);
    }
    
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
}
