
package recursion;

import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter index: ");
        int index=scanner.nextInt();
        System.out.println(findFibonacci(index));
    }
    public static long findFibonacci(int index){
        if(index==0){
            return 0;
        }
        else if(index==1){
          return 1;  
        }
        else{
            return findFibonacci(index-2)+ findFibonacci(index-1); 
        }
    }
}
