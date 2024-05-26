
package evidencemonthly;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Question1 {
    public static void main(String[] args) {
        int[] myArray=new int[100];
         Random random=new Random();
        try {
            for(int index=0; index<myArray.length; index++){
           myArray[index]=random.nextInt(101);
           
        }
         System.out.println(Arrays.toString(myArray));
            Scanner scanner=new Scanner(System.in);
            System.out.print("Enter index value: ");
            int index=scanner.nextInt();
            System.out.println(Array.get(myArray, index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds.");
        }catch(Exception e){
            System.out.println(" "+e);
        }
       
    }
}
