
package hackerrankproblem;

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String A=scanner.nextLine();
        String B=scanner.nextLine();
        scanner.close();
        
        int sum=A.length()+B.length();
        System.out.println(sum);
//        Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        if(A.compareTo(B)<0){
            System.out.println("No");
        }
        if(A.compareTo(B)==0){
            System.out.println("equal");
        }
        A=A.substring(0, 1).toUpperCase()+A.substring(1);
        B=B.substring(0, 1).toUpperCase()+B.substring(1);
        
        System.out.println(A+" "+B);
      
    }
}
