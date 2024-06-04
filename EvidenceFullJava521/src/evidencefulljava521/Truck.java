
package evidencefulljava521;


public class Truck extends Vehicle{
    private int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if(this.weight>2000){
            return (super.getRegularPrice()*90)/100;
        }
        System.out.println("No discount.");
        return super.getSalePrice();
    }
    
    
}
