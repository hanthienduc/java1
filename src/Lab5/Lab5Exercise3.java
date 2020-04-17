/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author hanth
 */
public class Lab5Exercise3 {

    static ArrayList<Product> list = new ArrayList();

    public static void Input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Product number " + (i + 1) + ": ");
            Product product = new Product();
            product.input();
            list.add(product);
            System.out.println();
        }
    }

    public static void SortDesAndOutput() {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).price < list.get(j).price) {
                    Collections.swap(list, i, i);
                }
            }
        }
        for (Product product : list) {
            product.output();
        }
    }

    public static void FindAndDeleteByName() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine();
        for (Product product : list) {
            if (product.name.equalsIgnoreCase(name)) {
                list.remove(product);
                System.out.println("Deleted");
                break;
            } else {
                System.out.println("Not exist!");
                break;
            }
        }
    }

    public static void OutputAveragePrice() {

    }

    public static void End() {
        System.exit(0);
    }

    public static void Menu() {
        System.out.println("1. Input list products. ");
        System.out.println("2. Sort Descending by price output");
        System.out.println("3. Find and Delete product by name.");
        System.out.println("4. Output Average product price. ");
        System.out.println("0. End. ");

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Your choice? ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    Input();
                    break;
                case 2:
                    SortDesAndOutput();
                    break;
                case 3:
                    FindAndDeleteByName();
                    break;
                case 4:
                    OutputAveragePrice();
                    break;
                case 0:
                    End();
                    break;
                default:
                    System.out.println("Not Exist Option! ");
                    System.out.println("Your choice? ");
                    choice = in.nextInt();
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Menu();
    }
}
