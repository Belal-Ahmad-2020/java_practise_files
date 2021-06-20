/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auaf;

/**
 *
 * @author Full-Stack
 */
public class Belal_2_31_Chapter_2 {
    public static void main(String[] args) {
//        Table of Squares and Cubes

//      define numbers
        int num1 = 0, num2 = 1, num3 = 2,
                num4 = 3, num5 = 4, num6 = 5, num7 = 6,
                num8 = 7, num9 = 8, num10 = 9, num11 = 10;
        
//        define the square of each number
        int sqn1 = (int)Math.sqrt(num1);
        int sqn2 = (int)Math.sqrt(num2);
        int sqn3 =(int) Math.sqrt(num3);
        int sqn4 = (int)Math.sqrt(num4);
        int sqn5 = (int)Math.sqrt(num5);
        int sqn6 = (int)Math.sqrt(num6);
        int sqn7 = (int)Math.sqrt(num7);
        int sqn8 = (int)Math.sqrt(num8);
        int sqn9 =(int)Math.sqrt(num9);
        int sqn10 = (int)Math.sqrt(num10);
        int sqn11 = (int)Math.sqrt(num11);
        
        
        // cube
        int cu1 = (num1 * sqn1);
        int cu2 = (num2 * sqn2);
        int cu3 = (num3 * sqn3);
        int cu4 = (num4 * sqn4);
        int cu5 = (num5 * sqn5);
        int cu6 = (num6 * sqn6);
        int cu7 = (num7 * sqn7);
        int cu8 = (num8 * sqn8);
        int cu9 = (num9 * sqn9);
        int cu10 = (num10 * sqn10);
        int cu11 = (num11 * sqn11);
        
        System.out.println("Number  Square  Cube");        
        System.out.println(num1 + "       " + sqn1 + "        " + cu1);        
        System.out.println(num2 + "       " + sqn2 + "        " + cu2);        
        System.out.println(num3 + "       " + sqn3 + "        " + cu3);        
        System.out.println(num4 + "       " + sqn4 + "        " + cu4);        
        System.out.println(num5 + "       " + sqn5 + "        " + cu5);        
        System.out.println(num6 + "       " + sqn6 + "        " + cu6);        
        System.out.println(num7 + "       " + sqn7 + "        " + cu7);        
        System.out.println(num8 + "       " + sqn8 + "        " + cu8);        
        System.out.println(num9 + "       " + sqn9 + "        " + cu9);        
        System.out.println(num10 + "       " + sqn10 + "        " + cu10);        
        System.out.println(num11 + "      " + sqn11 + "        " + cu11);        
    }
}
