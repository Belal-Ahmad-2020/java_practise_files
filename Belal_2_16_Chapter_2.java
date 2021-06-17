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
public class Belal_2_16_Chapter_2 {
    public static void main(String[] args) {
        /*
         Write an application that asks the user to enter two integers, obtains
them from the user and displays the larger number followed by the words "is larger".
        If the numbers are equal, print the message "These numbers are equal
        */
        int num1, num2;
        Scanner in = new Scanner(System.in);
        //First number
        System.out.println("Enter First Number: ");
         num1 = in.nextInt();
        // Second Number
        System.out.println("Enter First Number: ");
         num2 = in.nextInt();
        
        if(num1 > num2) {
            System.out.println("This number is larger");
        }
        else if(num1 == num2) {
            System.out.println("These numbera are equal");
        }
    }
}
