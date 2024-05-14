
package recursion;

import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=scanner.nextInt();
        System.out.println("Factorial of "+n+" is "+getFactorial(n));
        
    }
    
    public static long getFactorial(int n){
        if(n<1){
            return 1;
        }
        else{
            return n*getFactorial(n-1);
        }
    }
}
