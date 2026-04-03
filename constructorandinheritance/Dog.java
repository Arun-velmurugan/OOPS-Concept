
package constructorandinheritance;

public class Dog extends Animal {
    String breed;
    
    Dog(String name,String breed)
    {
        super(name);
        this.breed = breed;
    }
    
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Breed: "+breed);
    }
}
