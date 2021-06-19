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
public class Belal_2_24_Chapter_2 {
    public static void main(String[] args) {
        // define largest and smallest value
        
        int num1, num2, num3, num4, num5;
        
         Scanner in = new Scanner(System.in);
        //First number
        System.out.println("Enter First Number: ");
         num1 = in.nextInt();
        // Second Number
        System.out.println("Enter Second Number: ");
         num2 = in.nextInt();
         // Third Number
        System.out.println("Enter Third Number: ");
         num3 = in.nextInt();
                  // Fourth Number
        System.out.println("Enter Fourth Number: ");
         num4 = in.nextInt();
                  // Fifth Number
        System.out.println("Enter Fifth Number: ");
         num5 = in.nextInt();
         
         
       int max = 0;
       int min = 0;
       
       // max
           if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){
               max = num1;               
           }           
           else if(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5){
               max = num2;               
           }
           else if(num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5){
               max = num3;               
           }
            else if(num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5){
               max = num4;               
           }
            else {
                max = num5;
            }
           
           
           
           if(num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5){
               min = num1;               
           }           
           else if(num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5){
               min = num2;               
           }   
           else  if(num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5){
               min = num3;               
           }   
           else if(num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5){
               min = num4;               
           }   
            else {
                min = num5;
            }
           
         System.out.println( "Maximum number is " + max);                       
         System.out.println("Minimum number is " + min);

         
         
         
    }
}
