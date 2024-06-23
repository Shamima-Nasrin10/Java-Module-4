
package hackerrankproblem;

import java.util.Scanner;

public class PalindromeString {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your string: ");
        String A=scanner.nextLine();
        
        scanner.close();
        String rev="";
        
        for(int i=A.length()-1; i>=0; i--){
           rev=rev+A.charAt(i);
        }
        if(A.equalsIgnoreCase(rev)){
               System.out.println("Yes");
           }
           else{
               System.out.println("No");
           }
        
        
            
    }
    
}
