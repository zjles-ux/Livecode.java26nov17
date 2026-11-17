/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livecoding.jave;

import java.util.Scanner;

/**
 *
 * @author KINGCO_CPE113
 */
public class LivecodingJave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
       //problem 1
      System.out.println("input total: ");
      int total = input.nextInt();
      System.out.println("input count: ");
      int count = input.nextInt();
      System.out.println("average: " + computeAverage(total,count));
        
    } 
    public static double computeAverage(int total, int count){
        if (count <= 0) {
        return 0.0;
        }
       return (double) total/count;
    /**problem 1 questions:
      *1. Why doe the method need the word double(or cast)in the return?
      * -Because the computer will use integer division, which cut off everything after the number.
      * For example 7/2 the normal answer would be 3.5, but with integer division it will become 3.
      * 2. What would go wrong without the count <=0 guard?
      * - The computer would try to divide by zero, crashing the program.
      */
            
    
}
}
    

