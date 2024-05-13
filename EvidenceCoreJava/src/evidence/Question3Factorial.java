
package evidence;


public class Question3Factorial {
    public static void main(String[] args) {
        int value=5;
        int factorial=1;
        for(int i=1; i<=value;i++){
            factorial*=i;
        }
        System.out.println("Factorial of "+value+" is: "+factorial);
    }
}
