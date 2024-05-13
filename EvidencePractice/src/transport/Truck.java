
package transport;


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
    public double getSalesPrice() {
        if(this.weight>1000){
           return super.getRegularPrice()*.90;
        }
        return super.getRegularPrice();
    }
    
}
