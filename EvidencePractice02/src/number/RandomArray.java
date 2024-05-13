
package number;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class RandomArray {
    public static void main(String[] args) {
        int[] myArray=new int[10];
        for(int i=0;i<10; i++ ){
            Random random=new Random();
            myArray[i]= random.nextInt(100);
        }
        System.out.println(Arrays.toString(myArray));
        
        
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        do{
            int n=scanner.nextInt();
            if(n<0){
                break;
            }
            System.out.println("Enter numbers.");
            
        }
    }
}
