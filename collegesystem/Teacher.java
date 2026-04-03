
package collegesystem;


public class Teacher extends Person {
    String subject;
    
    Teacher(String name,int age,String subject)
    {
        super(name,age);
        this.subject = subject;
    }
    
    
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Subject: "+subject);
    }
}
