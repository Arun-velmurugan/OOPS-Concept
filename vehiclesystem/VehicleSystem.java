
package vehiclesystem;


public class VehicleSystem {
    public static void main(String[] args) {
        
        Car c1 = new Car("BMW","240kmph");
        Bike b1 = new Bike("RX100","120kmph");
        
        c1.display();
        b1.display();
    }
}
