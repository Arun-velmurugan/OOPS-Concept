
package productdetails;


public class Product {
    String name;
    int price;
    
    Product(String name,int price)
    {
        this.name = name;
        this.price = price;
    }
    
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
    }
            
}
