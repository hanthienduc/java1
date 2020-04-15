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
public class SVPoly {

    public String Hoten;
    public double Diem;

    public SVPoly() {

    }

    public SVPoly(String hoten, double diem) {
        this.Hoten = hoten;
        this.Diem = diem;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.Hoten = scanner.next();
        System.out.print("Enter Grade: ");
        this.Diem = scanner.nextDouble();
    }

    public void xuat() {
        System.out.println("Hoten: " + this.Hoten);
        System.out.println("Diem: " + this.Diem);

    }

    public String xepLoai() {
        if (Diem <= 5) {
            return "Yeu";
        } else if (Diem >= 5 && Diem <= 6.5) {
            return "Trung binh";
        } else if (Diem >= 6.5 && Diem <= 7.5) {
            return "Kha";
        } else if (Diem >= 7.5 && Diem <= 9) {
            return "Gioi";
        } else {
            return "Xuat xac";
        }

    }

}
