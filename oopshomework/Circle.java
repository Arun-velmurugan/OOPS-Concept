
package oopshomework;


public class Circle extends Shape{
    
    Circle()
    {
       super.radius = radius;
    }
    
    void calculateArea(int radius)
    {
        double circleArea = 3.14*radius*radius;
        System.out.println(circleArea);
    }
}
