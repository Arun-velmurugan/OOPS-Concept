
package javaapplication3;

public class Manager extends Employee{
    String department;
    
    Manager(String name,int age,double salary,String department)
    {
        super(name,age,salary);
        this.department = department;
    }
    
    void displayManager()
    {
        System.out.println("Department: "+this.department);
    }
}
