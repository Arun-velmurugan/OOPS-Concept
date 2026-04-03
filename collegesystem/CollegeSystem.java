
package collegesystem;

public class CollegeSystem {
    public static void main(String[] args) {
        
        Student student = new Student("Arun",20,98);
        Teacher teacher = new Teacher("Alice",35,"English");
        
        student.display();
        teacher.display();
    }
}
