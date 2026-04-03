
package shapehierarchy;


public class Circle extends Shape{
    int radius;
    
    Circle(int radius)
    {
        this.radius = radius;
    }
    
    void area()
    {
        double area = 3.14 * this.radius * this.radius;
        System.out.println(area);
    }
}
