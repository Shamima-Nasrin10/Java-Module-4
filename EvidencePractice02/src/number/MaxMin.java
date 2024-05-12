/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package number;


public class MaxMin extends NumberSuper{
    public static void main(String[] args) {
        System.out.println("blah");
    }
    private int number2;
    private int number3;

    public MaxMin() {
    }

    public MaxMin(int number2, int number3) {
        this.number2 = number2;
        this.number3 = number3;
    }

    public MaxMin(int number2, int number3, int number1) {
        super(number1);
        this.number2 = number2;
        this.number3 = number3;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber3() {
        return number3;
    }

    public void setNumber3(int number3) {
        this.number3 = number3;
    }
    public int getMaxNumber(){
        int maxNumber;
        if(super.getNumber1()>number2 && super.getNumber1()>number3){
            maxNumber=super.getNumber1();
        }
        else if(number2>super.getNumber1()&& number2>number3){
            maxNumber=number2;
        }
        else{
            maxNumber=number3;
        }
        return maxNumber;
    }
    public int getMinNumber(){
        int minNumber;
        if(super.getNumber1()<number2 && super.getNumber1()<number3){
            minNumber=super.getNumber1();
        }
        else if(number2<super.getNumber1()&& number2<number3){
            minNumber=number2;
        }
        else{
            minNumber=number3;
        }
        return minNumber;
    }
}
