
package employeedetails;


public class EmployeeDetails {
    public static void main(String[] args) {
        Employee e1 = new Employee("Baasha",15000);
        Manager m1 = new Manager("Salim","Textiles");
        
        e1.display();
        System.out.println("\n");
        m1.display();
    }
}
