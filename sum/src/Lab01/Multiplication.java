/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab01;

/**
 *
 * @author Surface Pro 6
 */
import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
 
        /* yêu cầu người dùng nhập từ bàn phím vào số thứ nhất và số thứ hai
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("nhập vào số thứ nhất: ");
 
        int num1 = scan.nextInt();
 
        System.out.print("Nhập vào số thứ hai:  ");
        int num2 = scan.nextInt();
 
        // Thực hiện tính tích của hai số.
        int tich = num1*num2;
 
        // hiển thị kết quả ra màn hình
        System.out.println("Kết quả: "+tich);
    }

}
