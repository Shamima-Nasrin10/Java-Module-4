
package product;

public class ProductMainClass {
    public static void main(String[] args) {
        ElectronicProduct eProduct=new ElectronicProduct(2, "Mouse", 500);
        System.out.println("Product Name: "+eProduct.getName().toString());
        System.out.println("Regular Price: "+eProduct.getRegularPrice());
        System.out.println("Warranty Period: "+eProduct.getWarrantyPeriod());
        System.out.println("Price of product: "+eProduct.getSalePrice());
    }
}
