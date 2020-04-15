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
public class Lab5Exercise2 {

    static ArrayList<String> names = new ArrayList<String>();

    public static void Input() {
        Scanner in = new Scanner(System.in);
        while (true) {
            String name = in.next();
            names.add(name);
            System.out.print("Continue? (y/n) ");
            if (in.next().equals("n")) {
                break;
            }
        }
    }

    public static void Output() {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void OutputRandom() {
        Collections.shuffle(names);
        Output();
    }

    public static void SortDescending() {
        Collections.sort(names);
        Collections.reverse(names);
        Output();
    }

    public static void FindAndDeleteByName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        String input = in.nextLine();
        for (String name : names) {
            if (name.equals(input)) {
                names.remove(name);
                break;
            } else {
                System.out.println("Not Exist");
                break;
            }
        }
    }

    public static void End() {
        System.exit(0);
    }

    public static void Menu() {
        System.out.println("1. Input list namea. ");
        System.out.println("2. Output list names. ");
        System.out.println("3. Output Random list names. ");
        System.out.println("4. Sort Descending and output list names.");
        System.out.println("5. Find and Delete name input from keyboard.");
        System.out.println("6. End. ");

        Scanner in = new Scanner(System.in);
        System.out.print("Your choice? ");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                Input();
                break;
            case 2:
                Output();
                break;
            case 3:
                OutputRandom();
                break;
            case 4:
                SortDescending();
                break;
            case 5:
                FindAndDeleteByName();
                break;
            case 6:
                End();
                break;
            default:
                System.out.println("Not Exist Option! ");
                System.out.println("Your choice? ");
                choice = in.nextInt();
                break;
        }
    }

    public static void main(String[] args) {
        Menu();
    }
}
