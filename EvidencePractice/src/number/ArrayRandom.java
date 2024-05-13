
package number;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandom {
    public static void main(String[] args) {
        
        int[] randomArray=new int[10];
        for(int i=0; i<10; i++){
            Random random=new Random();
            randomArray[i]=random.nextInt(10);
        }
        System.out.println("Array of random numbers: "+Arrays.toString(randomArray));
    }
}
