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
public class Belal_2_25_Chpater_2 {
    public static void main(String[] args) {
        // odd or even 
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter Your number: ");
        int num = in.nextInt();
        
        if(num % 2 == 0) {
            System.out.println(num  + " is even");
        }
        else {
            System.out.println(num + " is odd");
        }
        
        
    }
}
