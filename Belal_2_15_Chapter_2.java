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
public class Belal_2_15_Chapter_2 {
    public static void main(String[] args) {
        /*
        Write an application that asks the user to enter two integers, obtains them
        from the user and prints their sum, product, difference and quotient (division).
        */
        int x, y;
        
        Scanner in = new Scanner(System.in);
        
        // get two integer numbers
        System.out.println("Enter first number: ");
         x = in.nextInt();
        
        System.out.println("Enter second number: ");
         y = in.nextInt();
        
        // Sum
        int sum = x + y;
        
        // Subtraction 
        int sub = x - y;
        
        // Multiplication 
        int mul = (x * y);
        
        // int division 
        int div = (x / y);
        
        System.out.println("Addition is " + sum);
       System.out.println("Subtraction is " + sub); 
       System.out.println("Multiplication is " + mul);
        System.out.println("Division is " + div);
    }
}
