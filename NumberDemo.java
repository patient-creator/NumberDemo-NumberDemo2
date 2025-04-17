/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberdemo;

/**
 *
 * @author PATIENT
 */
public class NumberDemo {
// main method header
    public static void main(String[] args) {//method body
        
        //giving variable a and b values using initialisation
      int a =4;
      int b =9;
    //  calling a method within  the main method
        displayTwiceTheNumber(a);
        
        displayTwiceTheNumber(b);

        displayNumberPlusFive(a);
        
        displayNumberPlusFive(b);

        displayNumberSquared(a);
        
        displayNumberSquared(b);
    }
    //writing the method outside the main method
//writing method header 
    public static void displayTwiceTheNumber(int TwiceTheNumber) {
        //writing the method body using the printing method to be executed
        System.out.println("Twice the number of " + TwiceTheNumber);
             System.out.println(  " is equal to " + (2 * TwiceTheNumber));
    }
//another method outside the main method
    //method header
    public static void displayNumberPlusFive(int NumberPlusFive) {//method body
        //writing method body using Printing method to be executed
        System.out.println("The number of " +NumberPlusFive);
     System.out.println(  " plus five is equal to " + (NumberPlusFive+ 5));
    }
    //another method outside the main method
    //method header
     public static void displayNumberSquared(int NumberSquared) {
         //writing method body using printing method
        System.out.println("The number of  " +NumberSquared);
      System.out.println(  " squared is equal to  " + (NumberSquared* NumberSquared));


    }
}
