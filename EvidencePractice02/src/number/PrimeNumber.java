package number;

public class PrimeNumber extends NumberSuper {

    public PrimeNumber() {
    }

    public PrimeNumber(int number1) {
        super(number1);
    }

    public String checkPrime() {
        String message = "";
        int count = 0;
        for (int i = 1; i <= super.getNumber1(); i++) {
            if (super.getNumber1() % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            message = "Number is prime";
        } else {
            message = "Number is not prime";
        }
        return message;
    }
    

}
