
package number;

import java.util.Arrays;
import java.util.Random;


public class RandomArray {
    public static void main(String[] args) {
        int[] myArray=new int[10];
        for(int i=0;i<10; i++ ){
            Random random=new Random();
            myArray[i]= random.nextInt(100);
        }
        System.out.println(Arrays.toString(myArray));
    }
}
