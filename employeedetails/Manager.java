
package employeedetails;


public class Manager extends Person{
    String department;
    
    Manager(String name,String department)
    {
        super(name);
        this.department = department;
    }
    
    void display()
    {
        super.display();
        System.out.println("Department: "+department);
    }
}
