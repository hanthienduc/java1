/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.util.Scanner;

/**
 *
 * @author hanth
 */
public class Product {

    String name;
    int price;

    public Product() {

    }

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = in.next();

        System.out.print("Enter price: ");
        price = in.nextInt();

    }

    public void output() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}
