
package evidencefulljava521;


public class EvidenceFullJava521 {

    public static void main(String[] args) {
        Truck truck=new Truck(2200, 0, 200, "");
        System.out.println("Regular price: "+truck.getRegularPrice());
        System.out.println("Price of truck vehicle after 10% discount is: "+truck.getSalePrice());
    }
    
}
