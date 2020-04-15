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
public class SlideTwo {

    public static void main(String[] args) {
        tinhThueThuNhap();
    }

    public static void Demo1() {
        int x = 11 % 4;

        boolean a = 9 < 2 && true || 4 > 3;

        System.out.println(" x " + x + " a bool " + a);
    }

    public static void Demo2() {
        int a = 3, b = 5, c = 9;

        int max = 0;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }

        System.out.println(max);

    }

    public static void Demo3() {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        if (number > 0) {
            System.out.println("Quaratic " + Math.sqrt(number));
        }
    }

    public static void Demo4() {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        if (number > 0) {
            System.out.println("Quadratic " + Math.sqrt(number));
        } else {
            System.out.println("Error.");
        }
    }

    public static void tinhThueThuNhap() {
        Scanner in = new Scanner(System.in);

        double nineMin = 9000000;
        double fifMin = 15000000;
        double thirtyMin = 30000000;

        System.out.print("Luong: ");
        double luong = in.nextDouble();
        System.out.print("Thuong: ");
        double thuong = in.nextDouble();

        double tongThuNhapTruocThue = luong + thuong;
        double thue = 0;
        if (tongThuNhapTruocThue < nineMin) {
            thue = 0;
        } else if (tongThuNhapTruocThue >= nineMin
                && tongThuNhapTruocThue <= fifMin) {
            thue = (tongThuNhapTruocThue / 100) * 10;
            System.out.println("Thue " + thue);
        } else if (tongThuNhapTruocThue >= fifMin
                && tongThuNhapTruocThue <= thirtyMin) {
            thue = (tongThuNhapTruocThue / 100) * 15;
            System.out.println("Thue 15% " + thue);
        } else {
            thue = (tongThuNhapTruocThue / 100) * 20;
            System.out.println("Thue 20% " + thue);
        }

        double tongThuNhapSauThue = tongThuNhapTruocThue - thue;

        System.out.println("Tong thue: " + tongThuNhapSauThue);
    }

    public static void Demo5() {
        Scanner in = new Scanner(System.in);

        System.out.print("Month: ");
        int month = in.nextInt();

        System.out.print("Year: ");
        int year = in.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
                if (year % 400 == 0 || year % 4 == 0 && year % 100 == 0) {
                    System.out.println("28 days");
                } else {
                    System.out.println("29 days");
                }
                break;
        }

    }
}
