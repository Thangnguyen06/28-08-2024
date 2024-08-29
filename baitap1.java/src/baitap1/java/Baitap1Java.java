/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap1.java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Baitap1Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String check;
         int n = random.nextInt(100);
        do {
            System.out.println("Nhap vao check :");
            check = scanner.nextLine();
            if (check.equals("yes")) {
                if (n % 2 == 0) {
                    System.out.println(n + "la so chan");
                } else {
                    System.out.println(n + "la so le");
                }
                break;
            } else {
                if (n%2==0){
                    System.out.println(n +"la so chan");
                }else {
                    System.out.println(n+"la so le");
                }
                System.out.println("thoat vong lap");
                break;
            }
        } while (!check.equals("yes"));
    }
}
    

