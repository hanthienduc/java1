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
public class SlideFour {

    static class Sinhvien {

        String hoTen;
        double diemTb;

        Sinhvien() {

        }

        Sinhvien(String hoTen, double diemTb) {
            this.hoTen = hoTen;
            this.diemTb = diemTb;
        }

        String xeploai() {

            if (this.diemTb <= 5) {
                return "Yeu ";
            } else if (this.diemTb >= 5 && this.diemTb <= 6.5) {
                return "Trung binh";
            } else if (this.diemTb >= 6.5 && this.diemTb <= 7.5) {
                return " Kha";
            } else if (this.diemTb >= 7.5 && this.diemTb <= 9) {
                return "Gioi";
            } else {
                return "Xuat xuac";
            }

        }

        void nhap() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap HoTen: ");
            hoTen = scanner.next();
            System.out.print("Nhap DiemTB: ");
            diemTb = scanner.nextDouble();

        }

        void xuat() {
            System.out.println("Hoten: " + hoTen + ", DiemTB: " + diemTb);

        }

    }

    public static void main(String[] args) {
        Demo1();
    }

    //
    public static void Demo1() {
        Sinhvien sv = new Sinhvien();
        sv.nhap();
        sv.xuat();
    }
}
