
package productdetails;


public class Clothing extends Product{
        String size;
        String fabric;
     
        Clothing(String name,int price,String size,String fabric)
        {
            super(name,price);
            this.size=size;
            this.fabric=fabric;
        }
        
        void display()
        {
            super.display();
            System.out.println("Size: "+size);
            System.out.println("Fabric: "+fabric);
        }
   }
