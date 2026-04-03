
package javaapplication3;

public class Person {
    String name;
    int age;
    Person(String empName,int empAge)
    {
        name = empName;
        age = empAge;
    }
    
    void personDisplay()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+ age);
    }
    
    
}
