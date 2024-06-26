/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathoperation;

import java.math.BigInteger;


public class BigIntegerFactorial {
    int number;
    
    public BigIntegerFactorial(){
        
    }

    public BigIntegerFactorial(int number) {
        this.number = number;
    }
    public BigInteger getFactorial(){
      BigInteger factorial=BigInteger.ONE ;
      for(int i=1; i<=number;i++){
          factorial=factorial.multiply(new BigInteger(i+""));
      }
      return factorial;
        
    }
    public String checkPrime(BigInteger factorial){
        String messege="";
       int count=0;
          for(BigInteger j=BigInteger.ONE; j.compareTo(factorial)<=0; j=j.add(BigInteger.ONE)){
              if(factorial.mod(j).equals(BigInteger.ZERO)){
                  count++;
              }
          }
           if(count==2){
             messege="It is prime number." ;
          }
          else{
              messege="It is not prime number." ;
          }
     
      return messege;
    }
    
}
