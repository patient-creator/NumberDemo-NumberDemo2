/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberdemo2;

/**
 *
 * @author PATIENT
 */
import java.util.Scanner;//
public class NumberDemo2 {
//main method header
    public static void main(String[] args) {//main method s body
    
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer of your choice ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer of your choice ");
        int num2 = input.nextInt();
//calling a methods within the main method
        displayTwiceTheNumber(num1);
        
        displayTwiceTheNumber(num2);

        displayNumberPlusFive(num1);
        
        displayNumberPlusFive(num2);

         displayNumberSquared(num1);
         
        displayNumberSquared(num2);}

    //method outside the main method
    
//method header
    public static void displayTwiceTheNumber(int TwiceTheNumber) {
//writing method body using printing method
        System.out.println("Twice the number of " + TwiceTheNumber);
        System.out.println( " is equal to " + (2 *TwiceTheNumber ));
    }
// another method outside the main method
    //method header
    public static void displayNumberPlusFive(int NumberPlusFive) {
//writing method body using printing method
        System.out.println("The number of  " + NumberPlusFive);
       System.out.println ( " plus five is equal to  " + (NumberPlusFive+ 5));
    }
//another method outside the main method
    public static void displayNumberSquared(int NumberSquared)  
            {//writing method body using printing method
        System.out.println("The number of  " + NumberSquared );
        System.out.println( " squared is equal to  " + (NumberSquared * NumberSquared));
    }

    }