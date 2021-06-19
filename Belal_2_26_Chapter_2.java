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
public class Belal_2_26_Chapter_2 {
    public static void main(String[] args) {
        // Is it multiple of the second number
        int num1, num2;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = in.nextInt();
        
        System.out.println("Enter Second number");
        num2 = in.nextInt();
        
        
        if(num1 % num2 != 0) {
            System.out.println("Number one is not the multiply of number two");
        }
        else {
            System.out.println("Number one is  the multiply of number two");
        }
        
    }
}
