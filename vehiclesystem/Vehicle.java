
package vehiclesystem;


public class Vehicle {
    String brand;
    String speed;
    
    Vehicle(String brand,String speed)
    {
        this.brand = brand;
        this.speed = speed;
    }
    void display()
    {
        System.out.println("Brand: "+brand);
        System.out.println("Speed: "+speed);
    }
}
