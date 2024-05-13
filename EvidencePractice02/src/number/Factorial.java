
package number;

public class Factorial extends NumberSuper{

    public Factorial() {
    }

    public Factorial(int number1) {
        super(number1);
    }
    public int getFactorial(){
       int factorial=1;
       for(int i=1; i<=super.getNumber1();i++){
           factorial*=i;
       }
       return factorial;
    }
}
