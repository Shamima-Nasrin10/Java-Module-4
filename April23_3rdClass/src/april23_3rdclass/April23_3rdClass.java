/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package april23_3rdclass;

import java.util.Scanner;
import javax.imageio.ImageIO;

/**
 *
 * @author Admin
 */
public class April23_3rdClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Farhenheit to Celsius

        Scanner input=new Scanner(System.in);
        
        System.out.println("Pls enter temperature in Farhenheit: ");
        float fertemp=input.nextFloat();
        float result=((fertemp-32)/9)*5;
        
        System.out.println("Temparature in Celsius: "+result);
    }
    
}
