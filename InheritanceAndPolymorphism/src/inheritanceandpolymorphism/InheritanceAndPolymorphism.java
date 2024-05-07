/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritanceandpolymorphism;

import phone.Android;
import phone.IPhone;
import phone.Mobile;

public class InheritanceAndPolymorphism {

    public static void main(String[] args) {
        Android android=new Android();
        IPhone iphone=new IPhone("Yes", true, "makeTextMessage", "20 MPX", "camera");
        Mobile m=new Mobile();
        iphone.printDetails();
        android.printDetails();
    }
    
}
