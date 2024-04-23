/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selection59;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Selection59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int maxNumber;
        System.out.println("Enter first number: ");
        int firstNumber=scanner.nextInt();
         System.out.println("Enter second number: ");
        int secondNumber=scanner.nextInt();
        System.out.println("Enter third number: ");
        int thirdNumber=scanner.nextInt();
        
        if(firstNumber>secondNumber & firstNumber>thirdNumber){
            maxNumber=firstNumber;
        }
        else if(secondNumber>firstNumber & secondNumber>thirdNumber){
            maxNumber=secondNumber;
        }
        else{
            maxNumber=thirdNumber;
        }
        System.out.println("Maximum number is: "+maxNumber);
    }
    
}
