/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.Scanner;

/**
 *
 * @author hanth
 */
public class Lab3Exercise1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N = ");
        int N = input.nextInt();
        boolean ok = true;
        for (int i = 2; i < N - 1; i++) {
            if (i % N == 0) {
                // neu so nhap chia het cho bien chay 
                // khong phai nguyen to
                ok = false;
                break;
            }
        }
        if (ok == true) {
            System.out.println(" N: " + N + " is So nguyen to ");
        } else {
            System.out.println("Khong phai la so nguyen to");
        }
    }
}
