
package homework;

public class Person1 {
    String name;
    int age;
    
    Person1(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
