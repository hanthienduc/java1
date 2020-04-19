/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slides;

import java.util.Scanner;

/**
 *
 * @author hanth
 */
public class Slide6 {

    public static void main(String[] args) {

        demo2();

    }

    public static void demo1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equalsIgnoreCase("hello") && password.length() > 6) {
            System.out.println("Signed in");
        } else {
            System.out.println("Incorrect username or password");
        }

    }

    public static void demo2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();

        String arrFullName[] = new String[n];
        input.nextLine();
        int i = 0;
        while (i < n) {
            System.out.print("Enter full name: ");
            String FullName = input.nextLine();
            arrFullName[i] = FullName;
            i++;
        }

        for (i = 0; i < n; i++) {
            if (arrFullName[i].startsWith("Nguyen ") || arrFullName[i].endsWith(" Tuan")) {
                arrFullName[i].toUpperCase();
                System.out.println(arrFullName[i]);
            }

            if (arrFullName[i].contains(" My ")) {
                int lastIndex = arrFullName[i].lastIndexOf(" ");
                System.out.println(arrFullName[i].substring(lastIndex + 1));
            }
        }

    }
}
