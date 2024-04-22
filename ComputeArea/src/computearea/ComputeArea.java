/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computearea;

import java.awt.font.TextAttribute;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ComputeArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        double radius;
//        double area;
//        radius=12.5;
//        area=radius*radius*3.1416;
//        System.out.println(area);
//------*--------*---------*----------
//        Scanner input=new Scanner(System.in);
//        System.out.println("Pls enter the value of radius:");
//        int radius=input.nextInt();
//        double area;
//        area=radius*radius*3.1416;
//        System.out.println(area);
//-----------*--------*-----------
//        Scanner input1 = new Scanner(System.in);
//        System.out.println("Pls enter the value of length:");
//        double length = input1.nextDouble();
//        
//        Scanner input2 = new Scanner(System.in);
//        System.out.println("Pls enter the value of width:");
//        double width = input2.nextDouble();
//        
//        double area;
//        area = length * width;
//
//        System.out.println("Area of Rectangle: "+area);
//--------------------*-------------
        Scanner n1 = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number1 = n1.nextInt();
        Scanner n2 = new Scanner(System.in);
        System.out.println("Enter second number:");
        int number2 = n1.nextInt();
        Scanner n3 = new Scanner(System.in);
        System.out.println("Enter third number:");
        int number3 = n1.nextInt();
        Scanner n4 = new Scanner(System.in);
        System.out.println("Enter fourth number:");
        int number4 = n1.nextInt();

        int sum = number1 + number2 + number3 + number4;
        System.out.println("Sum of four numbers: " + sum);
    }

}
