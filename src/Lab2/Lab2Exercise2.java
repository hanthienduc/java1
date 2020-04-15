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
public class Lab2Exercise2 {

    public static void main(String[] args) {
        PTBacHai();
    }

    public static void PTBacHai() {
        Scanner in = new Scanner(System.in);

        System.out.print("a: ");
        double a = in.nextDouble();
        System.out.print("b: ");
        double b = in.nextDouble();
        System.out.print("c: ");
        double c = in.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Vo so nghiem");
            } else {
                System.out.println("Vo nghiem");
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0) {
                System.out.println("Vo nghiem");
            } else if (delta == 0) {
                System.out.println("Nghiem kep");
                double x = -b / (2 * a);
                System.out.println("x = " + x);

            } else {
                System.out.println("2 nghiem phan biet");
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);

                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
