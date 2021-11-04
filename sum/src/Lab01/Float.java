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
public class Float {
    public static void main(String[] args) {
 
        /* yêu cầu người dùng nhập từ bàn phím vào số thứ nhất và số thứ hai
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("nhập vào số thứ nhất: ");
 
        double num1 = scan.nextDouble();
 
        System.out.print("Nhập vào số thứ hai:  ");
        double num2 = scan.nextDouble();
 
        // Thực hiện tính tích của hai số.
        double tich = num1*num2;
 
        // hiển thị kết quả ra màn hình
        System.out.println("Kết quả: "+tich);

    }
}
