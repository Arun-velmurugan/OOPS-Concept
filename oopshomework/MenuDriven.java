
package oopshomework;

import java.util.Scanner;


public class MenuDriven {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Circle c1 = new Circle();
        Square s1 = new Square();
        boolean exit = true;
        System.out.println("--------SHAPE AREA CALCULATOR--------");
        do
        {
            System.out.println("1.AREA OF THE CIRCLE");
            System.out.println("2.AREA OF THE SQUARE");
            System.out.println("3.EXIT");
            System.out.print("ENTER THE OPTION: ");
            int option = sc.nextInt();
            if(option==1)
            {
                 System.out.print("Radius: ");
                 int radius = sc.nextInt(); 
                 c1.calculateArea(radius);
            }
            else if(option==2)
            {
                System.out.print("SIZE: ");
                int size = sc.nextInt();
                s1.calculateArea(size);
            }
            else if(option==3)
           {
                exit = false;    
           }
        }while(exit);
    }
}
