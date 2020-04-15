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
public class Lab2Exercise4Menu {

    public static void main(String[] args) {

    }

    public static void Menu() {
        System.out.println("+------------------------+");
        System.out.println("1. Giai Phuong Trinh Bac Nhat.");
        System.out.println("2. Giai Phuong Trinh Bac Hai.");
        System.out.println("3. Tinh Tien Dien.");
        System.out.println("4. Ket Thuc.");
        System.out.println("+------------------------+");
        System.out.println("Chon Chuc Nang:_ ");

        Scanner scanner = new Scanner(System.in);

        int answer = scanner.nextInt();
        switch (answer) {
            case 1:
                Lab2Exercise1.PTBacNhat();
                break;
            case 2:
                Lab2Exercise2.PTBacHai();
                break;
            case 3:
                Lab2Exercise3.tinhTienDien();
                break;

            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("System don't have this option yet");
                break;
        }
    }
}
