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
public class Belal_2_30_Chapter_2 {
    public static void main(String[] args) {
//         Separating the Digits in an Integer)
        
        int num1, num2, num3, num4, num5;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        num1 = in.nextInt();
        
        System.out.println("Enter Second number: ");
        num2 = in.nextInt();
        
        System.out.println("Enter Third number: ");
        num3 = in.nextInt();
        
        System.out.println("Enter Fourth number: ");
        num4 = in.nextInt();
        
        System.out.println("Enter Fifth number: ");
        num5 = in.nextInt();
        
        System.out.printf("%s %s %s %s %s%n", num1, num2, num3, num4, num5);
    }
}
