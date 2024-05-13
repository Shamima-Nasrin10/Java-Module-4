
package evidence;

import java.util.Scanner;


public class Question2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int userInput=scanner.nextInt();
        
        int sum=0;
        while(userInput>=0){
            sum+=userInput;
            userInput=scanner.nextInt();
        }
        System.out.println("Sum of values: "+sum);
    }
}
