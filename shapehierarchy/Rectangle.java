package shapehierarchy;


public class Rectangle extends Shape{
    int len;
    int width;
    
    Rectangle(int len,int width)
    {
        this.len = len;
        this.width = width;
    }
    
    void area()
    {
        int area = this.len*this.width;
        System.out.println(area);
    }

}
