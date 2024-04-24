/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leapyearcalculation;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LeapYearCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leap Year Calculation
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Pls enter any year to check if it is leap year or not.");
        int leapYear=scanner.nextInt();
        
        if((leapYear%4==0 && leapYear%100!=0)|| leapYear%400==0){
            System.out.println("This is leap year.");
        }
        else{
            System.out.println("This is not a leap year");
        }
    }
    
}
