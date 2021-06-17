package auaf;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Full-Stack
 */
public class Belal_2_17_Chapter_2 {
    public static void main(String[] args) {
        /*
         Write an application that inputs three integers from the
            user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
            shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
            representation of the average. So, if the sum of the values is 7, the average should be 2, not
            2.3333….]
        */
        
        int num1, num2, num3;
        int sum, avg, product, minNum, maxNum;
        
        
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
         
         // sum is
         sum = num1 + num2 + num3;
         
         // average is 
         avg = (int)(num1 + num2 + num3) / 3;
         
         
         // Product is 
         product = (num1 * num2 * num3);
         
         //min
         int firstMin = Math.min(num1, num2);
         minNum = Math.min(firstMin, num3);
         
         // max
         int firstMax = Math.max(num1, num2);
         maxNum = Math.max(firstMax, num3);
         
         
         System.out.println("Sum is " + sum);
         System.out.println("Product is " + product);
         System.out.println("Average is " + avg);
         System.out.println("Minimum is " + minNum);
         System.out.println("Maximum is" + maxNum);
         
    }
}
