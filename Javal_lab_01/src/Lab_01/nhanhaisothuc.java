/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_01;

/**
 *
 * @author Surface Pro 6
 */
import java.util.*;

public class nhanhaisothuc {
    public static void main(String[] args) {
        double num1, num2, result;
        Scanner myObj = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Enter your first number: ");
        num1 = myObj.nextDouble();
        
        
        System.out.println("Enter your second number: ");
        num2 = myObj.nextDouble();
        
        myObj.close();
        
        result = num1 * num2;
        System.out.println("The result: " + result);
    }
}
