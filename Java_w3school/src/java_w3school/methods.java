/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_w3school;

/**
 *
 * @author Surface Pro 6
 */
//Mehods == function
public class methods {
    static void getName() {
        System.out.println("Hello");
    }
    
    static void hello(String fname, int age) {
        System.out.println("Hello " + fname + ". Yours age is " + age + " years old ?");

    }
    
    public static void main(String[] args) {
        hello("Trung Hieu", 18);        
        hello("Van Teo", 25);

        
    }
    
}
