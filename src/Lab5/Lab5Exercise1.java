/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hanth
 */
public class Lab5Exercise1 {

    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Double x = scanner.nextDouble();
            list.add(x);
            System.out.print("Do you want to continue? (Y/N)?");
            
            if (scanner.next().equals("N")) {
                break;
            }
        }
        double sum = 0;
        for (double x : list) {
            sum += x;
            System.out.print(x + ", ");
        }
        System.out.println("");
        System.out.println("Sum: " + sum);
    }
}
