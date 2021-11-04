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

public class nhanhaiso {
    public static void main(String[] args) {
        int num1, num2, total;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your first number");
        num1 = myObj.nextInt();
        
        System.out.println("Enter your second number");
        num2 = myObj.nextInt();
        
        myObj.close();
        
        total = num1 * num2;
        System.out.println("The result: " + total);

    }
}
