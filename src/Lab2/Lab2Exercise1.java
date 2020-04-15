/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import java.util.Scanner;

/**
 *
 * @author hanth
 */
public class Lab2Exercise1 {

    public static void main(String[] args) {
        PTBacNhat();
    }

    public static void PTBacNhat() {
        Scanner in = new Scanner(System.in);

        System.out.print("a: ");
        double a = in.nextDouble();

        System.out.print("b: ");
        double b = in.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Vo so nghiem");
            } else {
                System.out.println("Vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("x: " + x);
        }
    }
}
