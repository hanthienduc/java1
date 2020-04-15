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
public class Lab2Exercise3 {

    public static void main(String[] args) {
        tinhTienDien();

    }

    public static void tinhTienDien() {
        Scanner in = new Scanner(System.in);

        System.out.print("So Dien: ");
        int SoDien = in.nextInt();
        int SoTien = 0;
        if (SoDien > 0 && SoDien <= 50) {
            SoTien = SoDien * 1000;
        } else {
            SoTien = 50 * 1000 + (SoDien - 50) * 1200;
        }

        System.out.println("So Tien: " + SoTien);
    }
}
