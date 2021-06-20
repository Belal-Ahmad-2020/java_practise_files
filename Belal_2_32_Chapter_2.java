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
public class Belal_2_32_Chapter_2 {
    public static void main(String[] args) {
//        (Negative, Positive and Zero Values


 int num1, num2, num3, num4, num5;
        
        Scanner in = new Scanner(System.in);
        
        // input numbers
        System.out.println("Enter first number: ");
        num1 = in.nextInt();
        
        System.out.println("Enter Second number");
        num2 = in.nextInt();
        
        System.out.println("Enter Third number");
        num3 = in.nextInt();
        
        System.out.println("Enter Fourth number");
        num4 = in.nextInt();
        
        System.out.println("Enter Fifth number");
        num5 = in.nextInt();
        
        // logic num1 
        if(num1 > 0) {
            System.out.println(num1 + " is positive");
        }
        else if (num1 == 0) {
            System.out.println(num1 + " is zero");
        }
        else {
            System.out.println(num1+" is negative");
        }
        
        if(num2 > 0) {
            System.out.println(num2 + " is positive");
        }
        else if (num2 == 0) {
            System.out.println(num1 + " is zero");
        }
        else {
            System.out.println(num2+" is negative");
        }
        
        if(num3 > 0) {
            System.out.println(num3 + " is positive");
        }
        else if (num3 == 0) {
            System.out.println(num3 + " is zero");
        }
        else {
            System.out.println(num3+" is negative");
        }
        
        
        if(num4 > 0) {
            System.out.println(num4 + " is positive");
        }
        else if (num4 == 0) {
            System.out.println(num4 + " is zero");
        }
        else {
            System.out.println(num4+" is negative");
        }
        
        if(num5 > 0) {
            System.out.println(num5 + " is positive");
        }
        else if (num5 == 0) {
            System.out.println(num5 + " is zero");
        }
        else {
            System.out.println(num5+" is negative");
        }
        
        
    }    
}
