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

public class statement_if_else_scanner {
    public static void main(String[] args) {
        int num;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your number: ");
        num = myObj.nextInt();
        
        if(num % 2 == 0) {
            System.out.println(num + " la so chan");
        } else {
            System.out.println(num + " la so le");
        }
    }
}
