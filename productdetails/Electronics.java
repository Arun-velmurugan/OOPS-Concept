
package productdetails;


public class Electronics extends Product{
    int warranty;
    
    Electronics(String name,int price,int warranty)
    {
        super(name,price);
        this.warranty = warranty;
    }
    void display()
    {
        super.display();
        System.out.println("Warranty "+warranty+" Years");
    }
}
