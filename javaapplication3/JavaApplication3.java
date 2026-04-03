
package javaapplication3;

public class JavaApplication3 {
  
    public static void main(String[] args) {
        
        Manager m1 = new Manager("Arunraj",23,100000.00,"IT");
        
        m1.personDisplay();
        m1.employeeDisplay();
        m1.displayManager();
    }
    
}
