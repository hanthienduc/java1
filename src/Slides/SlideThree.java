/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slides;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hanth
 */
public class SlideThree {

    public static void main(String[] args) {
        Demo8();
    }

    public static void Demo1() {
        // Bang Cuu Chuong 7 
        int i = 1;
        while (i <= 10) {
            System.out.println(" 7 * " + i + "  = " + (7 * i));
            i++;
        }
    }

    //Tinh trung binh cac so chia het cho 3 tu 27 den 250
    public static void Demo2() {
        int i = 27;
        int avg = 0;
        while (i <= 250) {
            if (i % 3 == 0) {
                System.out.println("i " + i);
                avg += i;
            }
            i++;
        }

        System.out.println(" avg " + avg);
    }

    // Nhap Diem tu 0 -> 10
    public static void Demo3() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so ");
        int so = 0;
        do {
            so = input.nextInt();
        } while (so < 0 || so > 10);
    }

    // Bang Cuu chuong voi lenh lap for
    public static void Demo4() {
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " * " + j + " = " + (i * j) + "\n");

            }
        }
    }

    public static void Demo5() {
        int a[] = {4, 3, 5, 9};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        for (int x : a) {
            System.out.println(x);
        }
    }

    public static void Demo6() {
        Scanner scanner = new Scanner(System.in);

        String[] sv = new String[5];
        for (int i = 0; i < sv.length; i++) {
            System.out.println("Nhap sinh vien: " + (i + 1));
            sv[i] = scanner.nextLine();
        }

        Arrays.sort(sv, 0, 0);

        for (int i = 0; i < sv.length; i++) {
            System.err.println(sv[i]);
        }

    }

    // Tu xay dung thuat toan sap xep mang 
    public static void Demo7() {
        int a[] = {8, 2, 6, 2, 9, 1, 5};
        for(int i = 0; i < a.length - 1;i ++){
            for(int j = i + 1; j < a.length; j++){
                if(a[i] < a[j]){  // neu thay < thi se la mang sap xep giam dan
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        // Mang sau khi sap xep -- after sorted
        for(int i = 0; i < a.length; i ++){
            System.out.println(a[i]);
        }
    }
    
    // Nhap 2 mang hoten va diem sap xep tang dan theo diem
    public static void Demo8(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        
        String[] hoten = new String[n];
        int[] diem = new int[n];
        
        for(int i = 0; i < n; i++){
            System.out.print("Nhap hoten " + (i+1) +": ");
            hoten[i] = scanner.next();
            System.out.print("Nhap diem " +(i+1) +": ");
            diem[i] = scanner.nextInt();
        }
        
        // Mang sau khi nhap
        for(int i = 0; i < n; i++){
            System.out.println("hoten["+(i+1)+"] : " + hoten[i]);
            System.out.println("diem["+(i+1)+"] : " + diem[i]);
            
        }
        
        // sap xep mang tang dan theo diem
        
        for(int i = 0 ; i < n -1; i++){
            for(int j = i + 1; j < n; j++){
                if(diem[i] > diem[j]){
                    int temp = diem[i];
                    String tempHoten = hoten[i];
                    diem[i] = diem[j];
                    hoten[i] = hoten[j];
                    diem[j] = temp;
                    hoten[j] = tempHoten;
                }
            }
        }
        
        // Mang sau khi sap xep theo diem
        
         for(int i = 0; i < n; i++){
            System.out.println("hoten["+(i+1)+"] : " + hoten[i]);
            System.out.println("diem["+(i+1)+"] : " + diem[i]);
            
        }
        
    }
}
