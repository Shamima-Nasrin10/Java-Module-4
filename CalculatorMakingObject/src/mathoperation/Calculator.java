/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathoperation;

import java.util.Scanner;


public class Calculator {
    
    
    double value1;
    double value2;
    int operator;
    double result;
    
    public Calculator(){
        
    }

    public Calculator(double value1, double value2, int operator) {
        this.value1 = value1;
        this.value2 = value2;
        this.operator = operator;
    }
   
    public double getResult(){
        switch (operator) {
            case 1:result=value1+value2;
            break;
            case 2:result=value1-value2;
            break;
            case 3:result=value1*value2;
            break;
            case 4:result=value1/value2;
            break;
                
        }
 return result;
    }
    
        
}
