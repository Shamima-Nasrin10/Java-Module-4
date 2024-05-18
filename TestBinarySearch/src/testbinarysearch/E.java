

package testbinarysearch;

import java.util.Scanner;


class E {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int number1=scanner.nextInt();
        System.out.println("Enter number 2: ");
        int number2=scanner.nextInt();
        
        double quotient;
        try {
            quotient=number1/number2;
            System.out.println(quotient);
        } catch (ArithmeticException x) {
            System.out.println("Error: "+x.getMessage());
            System.out.println("Cannot divide a value by zero.");
                    
        }
    }
         
}
