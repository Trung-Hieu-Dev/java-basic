/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_01;

/**
 *
 * @author Surface Pro 6
 */
import java.util.Scanner;

public class conghaiso_scaner {
    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner myObj = new Scanner(System.in); //create scanner obj
        System.out.println("Enter your first number: ");
        num1 = myObj.nextInt(); //get number1
        
        System.out.println("Enter your second number: ");
        num2 = myObj.nextInt(); //get number 2
        
        myObj.close(); // close scanner
        
        sum = num1 + num2;
        System.out.println("Total: " + sum);
    }
}
