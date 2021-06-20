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
public class Belal_2_33_Chapter_2 {
    public static void main(String[] args) {
        
        // BMI 
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("ENter your weigth in kiligram: ");
        double weight = in.nextDouble();
        
        System.out.println("Enter your height in meters: ");
        double height = in.nextDouble();
        
        
        double bmi = (weight) / (height * height);
        
        if(bmi < 18.5) {
            System.out.println("You are underweight");
        }
        else if (bmi > 18.5 && bmi < 24.9) {
            System.out.println("You are normal");
        }
        else if (bmi > 25 && bmi < 24.9) {
            System.out.println("You are overweight");
        }
        else {
            System.out.println("You are obese");
        }
        
        
        
    }
}
