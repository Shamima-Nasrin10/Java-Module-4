/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prime;


public class PrimeNum {
    int number=6;
    String result="";
    public PrimeNum(){
        
    }
    public PrimeNum(int newNumber){
        number=newNumber;
    }
     
    
    public String checkPrimeNumber(){
        int count=0;
        for(int i=1; i<=number; i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==2){
            result="Number is prime.";
            
        }
        else{
            result="Number is not prime";
        }
        return result;
        
    }
}
