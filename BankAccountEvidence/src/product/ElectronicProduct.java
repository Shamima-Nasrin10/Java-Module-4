
package product;

public class ElectronicProduct extends Product{
    
    private int warrantyPeriod;

    public ElectronicProduct() {
    }

    public ElectronicProduct(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public ElectronicProduct(int warrantyPeriod, String name, double regularPrice) {
        super(name, regularPrice);
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public double getSalePrice() {
        if(this.warrantyPeriod>1){
            return (super.getRegularPrice()*85)/100;
        }
        System.out.println("No discount");
        return super.getRegularPrice(); 
    }
    
    
    
}
