/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auaf;
import java.util.Scanner;
/**
 *
 * @author Full-Stack
 */
public class Belal_2_28_Chapter_2 {
    public static void main(String[] args) {
        /*
        Write an application that inputs from the user the radius of a circle
        as an integer and prints the circle’s diameter, circumference and area using the floating-point value
        3.14159 for π.     
        
        
        diameter = 2r
        circumference = 2πr
        area = πr2
        
        
        */
        
        float diameter,
              circumference,
                area, 
                radius;
        
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        radius = in.nextFloat();
        

        //  diameter
        diameter = (2 * radius);        
        System.out.println("The diameter of the circle which has " + radius + " radius is " + diameter);
        
        // circumference
        circumference = (float)(2 * (Math.PI) * radius);
        System.out.println("The circumference of the circle which has " + radius + " radius is " + circumference);
                
        
        area = (float) ((Math.PI) * radius * radius );
        System.out.println("The area of the circle which has " + radius + " radius is " + area);
    }
}
