
package employeedetails;


public class Employee extends Person{
    double salary;
    
    Employee(String name,double salary)
    {
        super(name);
        this.salary = salary;
    }
    
    void display()
    {
        super.display();
        System.out.println("Salary: "+salary);
    }
}
