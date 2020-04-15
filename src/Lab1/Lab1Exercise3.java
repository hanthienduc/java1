/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.util.Scanner;

/**
 *
 * @author hanth
 */
public class Lab1Exercise3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap canh: ");
        double canh = scanner.nextDouble();
        double theTich = Math.pow(canh, 3);
        
        System.out.printf("%.1f", theTich);
    }
}
