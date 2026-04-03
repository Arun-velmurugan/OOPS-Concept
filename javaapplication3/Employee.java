
package javaapplication3;

public class Employee extends Person{
    double salary;
    
    Employee(String name,int age,double salary)
    {
        super(name,age);
        this.salary = salary;
    }
    void employeeDisplay()
    {
        System.out.println("Salary: "+salary);
    }
}
