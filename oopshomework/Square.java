
package oopshomework;


public class Square extends Shape {
    
    Square()
    {
        super.size = size;
    }
    void calculateArea(int size)
    {
        int sqrArea = size*size;
        System.out.println(sqrArea);
    }

 
}
