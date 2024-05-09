

package exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1=input.nextInt();
        
        System.out.println("Enter number 2: ");
        int num2=input.nextInt();
        
        
        if(num2!=0){
            System.out.println(num1/num2);
        }
        else{
            System.out.println("Second number cannot be zero.");
        }
//        System.out.println(num1/num2);
           
    }
    
}
