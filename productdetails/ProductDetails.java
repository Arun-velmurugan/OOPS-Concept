
package productdetails;

public class ProductDetails {
    public static void main(String[] args) {
        System.out.println("Electronic Details");
        Electronics e1 = new Electronics("Laptop",50000,2);
        e1.display();
        System.out.println("\nClothing Details");
        Clothing c1 = new Clothing("T-Shirt",800,"M","Cotton");
        c1.display();
    }
   
}
