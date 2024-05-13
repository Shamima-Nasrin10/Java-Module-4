
package evidence;

import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner( System.in);
        int[] array= new int[5];
        
        for(int i=0; i<5; i++){
            System.out.println("Enter value "+(i+1));
            array[i]=scanner.nextInt();
        }
        System.out.println("My array: "+Arrays.toString(array));
        
        
        int lowestNumber=array[0];
        for(int number:array){
            if(number<lowestNumber){
               lowestNumber=number; 
            }
        }
        System.out.println("Lowest number is: "+lowestNumber);
        
        int highestNumber=array[0];
        for(int number:array){
            if(number>highestNumber){
               highestNumber=number; 
            }
        }
        System.out.println("Highest number is: "+highestNumber);
    }
}
