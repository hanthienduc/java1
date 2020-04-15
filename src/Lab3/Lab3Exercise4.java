/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.Scanner;

/**
 *
 * @author hanth
 */
public class Lab3Exercise4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        String[] hoten = new String[n];
        double[] diem = new double[n];
        String[] hocluc = new String[n];

        // Nhap hoten, diem, va xet hoc luc
        for (int i = 0; i < n; i++) {
            System.out.print("Enter hoten[" + (i + 1) + "]= ");
            hoten[i] = scanner.next();

            System.out.print("Enter diem[" + (i + 1) + "]= ");
            diem[i] = scanner.nextDouble();
            if (diem[i] < 5) {
                hocluc[i] = "Yeu";
            } else if (diem[i] >= 5 && diem[i] < 6.5) {
                hocluc[i] = "Trung Binh";
            } else if (diem[i] >= 6.5 && diem[i] <= 7.5) {
                hocluc[i] = "Kha";
            } else if (diem[i] >= 7.5 && diem[i] < 9) {
                hocluc[i] = "Gioi";
            } else {
                hocluc[i] = "Xuat xac";
            }
        }

        // Xuat thong tin da nhap 
        for (int i = 0; i < n; i++) {
            System.out.println("hoten[" + (i + 1) + "]= " + hoten[i]);
            System.out.println("diem[" + (i + 1) + "]= " + diem[i]);
            System.out.println("hocluc[" + (i + 1) + "]= " + hocluc[i]);

        }

        //sap xep thong tin tang dan theo diem
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] > diem[j]) {
                    double tempDiem = diem[i];
                    String tempHoten = hoten[i];
                    String tempHocluc = hocluc[i];
                    diem[i] = diem[j];
                    hoten[i] = hoten[j];
                    hocluc[i] = hocluc[j];
                    diem[j] = tempDiem;
                    hoten[j] = tempHoten;
                    hocluc[j] = tempHocluc;
                }
            }
        }

        // Xuat mang da sap xep 
        for (int i = 0; i < n; i++) {
            System.out.println("hoten[" + (i + 1) + "]= " + hoten[i]);
            System.out.println("diem[" + (i + 1) + "]= " + diem[i]);
            System.out.println("hocluc[" + (i + 1) + "]= " + hocluc[i]);
        }
    }
}
