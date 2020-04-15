package Lab1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author hanth
 */
public class Lab1Exercise4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double Delta = Math.pow(b, 2) - 4 * a * c;

        double canDelta = Math.sqrt(Delta);

        System.out.println("Delta: " + Delta);
        System.out.printf("Can Delta: " + canDelta);

    }
}
