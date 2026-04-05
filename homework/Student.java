
package homework;


public class Student extends Person1{
    int rollNo;
    int marks;
    
    Student(String name,int age,int rollNo,int marks)
    {
        super(name,age);
        this.rollNo=rollNo;
        this.marks=marks;
    }
    
    void display()
    {
        super.display();
        System.out.println("Roll NO: "+rollNo);
        System.out.println("Marks: "+marks);
    }
}
