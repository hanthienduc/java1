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
public class SlideTwoMenu {

    public static void main(String[] args) {

    }

    public static void ThucDon() {
        System.out.println(">> PERSONAL COMPUTER <<");
        System.out.println("+---------------------+");
        System.out.println("| 1. ADDITION         |");
        System.out.println("| 2. SUBTRACTION      |");
        System.out.println("| 3. END              |");
        System.out.println("+---------------------+");
        System.out.println(">> Choose function? ");

        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        if (answer == 1) {
            ThucHienPhepCong();
        } else if (answer == 2) {
            ThucHIenPhepTru();
        } else if (answer == 3) {
            System.exit(0);
        }
    }
    
    public static void ThucDonSwitch() {
        System.out.println(">> PERSONAL COMPUTER <<");
        System.out.println("+---------------------+");
        System.out.println("| 1. ADDITION         |");
        System.out.println("| 2. SUBTRACTION      |");
        System.out.println("| 3. END              |");
        System.out.println("+---------------------+");
        System.out.println(">> Choose function? ");

        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        switch(answer){
            case 1:
                ThucHienPhepCong();
                break;
            case 2:
                ThucHIenPhepTru();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Don't have this function yet");
                break;
        }
    }

    public static void ThucHienPhepCong() {

    }

    public static void ThucHIenPhepTru() {

    }
}
