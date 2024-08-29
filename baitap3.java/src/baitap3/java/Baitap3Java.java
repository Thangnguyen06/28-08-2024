/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap3.java;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Baitap3Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        
        // Khởi tạo mảng với số lượng phần tử nhập vào
        int[] arr = new int[n];

        // Nhập các phần tử của mảng
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Tính tổng các phần tử
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // Tính trung bình cộng
        double average = (double) sum / n;

        // In kết quả
        System.out.println("Tong cac phan tu trong mang la: " + sum);
        System.out.println("Trung binh cong cua cac phan tu trong mang la: " + average);
    }
}
    
    

