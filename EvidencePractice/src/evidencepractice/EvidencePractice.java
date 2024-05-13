
package evidencepractice;

import transport.Truck;

public class EvidencePractice {

    public static void main(String[] args) {
        Truck truck=new Truck(2400,100, 2000, "Red");
        
        System.out.println("Price of truck: "+truck.getSalesPrice());
    }
    
}
