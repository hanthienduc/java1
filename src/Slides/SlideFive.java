/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slides;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author hanth
 */
public class SlideFive {

    static ArrayList<SVPoly> listSVPoly = new ArrayList();

    static void nhapDanhSachSV() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            SVPoly sv = new SVPoly();
            sv.nhap();
            listSVPoly.add(sv);
        }
    }

    static void xuatDanhSachSV() {
        for (SVPoly sv : listSVPoly) {
            sv.xuat();
        }
    }

    static void xuatDanhSachSVByPointRange() {
        for (SVPoly sv : listSVPoly) {

            sv.xuat();
        }
    }

    static void FindStudentByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String hoten = scanner.next();

        for (SVPoly sv : listSVPoly) {
            if (sv.Hoten.equals(hoten)) {
                sv.xuat();
            }
        }
    }

    static void FindStudentByNameAndChange() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String hoten = scanner.next();

        for (SVPoly sv : listSVPoly) {
            if (sv.Hoten.equals(hoten)) {

                System.out.print("Enter name: ");
                String nameChange = scanner.next();

                // tim vi tri phan tu
                int index = listSVPoly.indexOf(sv);
                // thay doi gia tri cua doi tuong
                sv.Hoten = nameChange;
                // set doi tuong da thay doi vao mang
                listSVPoly.set(index, sv);

                System.out.println("after change " + sv.Hoten + ", " + sv.Diem);
            }
        }
    }

    static void FindStudentByNameAndDelete() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String hoten = scanner.next();

        for (SVPoly sv : listSVPoly) {
            if (sv.Hoten.equals(hoten)) {
                listSVPoly.remove(sv);
                System.out.println("Object have been deleted");
            } else {
                System.out.println("Not Exist");
            }
        }
    }

    static void SortStudentsByGrade() {
        for (int i = 0; i < listSVPoly.size() - 1; i++) {
            for (int j = i + 1; j < listSVPoly.size(); j++) {
                if (listSVPoly.get(i).Diem > listSVPoly.get(j).Diem) {
                    Collections.swap(listSVPoly, i, j);
                }
            }
        }

    }

    static void SortStudentsByName() {

    }

    static void Menu() {
        System.out.println("1. Nhap danh sach sinh vien.");
        System.out.println("2. Xuat danh sach sinh vien.");
        System.out.println("3. Xuat danh sach sinh vien theo khoang diem.");
        System.out.println("4. Tim sinh vien theo hoten.");
        System.out.println("5. Tim va sua sinh vien theo hoten.");
        System.out.println("6. Tim va xoa theo hoten.");
        System.out.println("7. Sap xep sinh vien theo diem");
        System.out.println("8. Sap xep sinh vien theo hoten");
        System.out.println("0. Ket Thuc.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice? ");
        int number = scanner.nextInt();
        switch (number) {
            case 0:
                System.exit(0);
                break;
            case 1:
                nhapDanhSachSV();
                break;
            case 2:
                xuatDanhSachSV();
                break;
            case 3:
                xuatDanhSachSVByPointRange();
                break;
            case 4:
                FindStudentByName();
                break;
            case 5:
                FindStudentByNameAndChange();
                break;
            case 6:
                FindStudentByNameAndDelete();
                break;
            case 7:
                SortStudentsByGrade();
                break;
            case 8:
                SortStudentsByName();
                break;
            default:
                System.out.println("I don't develop this option yet! ");
                System.out.print("Your choice? ");
                number = scanner.nextInt();
                break;
        }

    }

    public static void main(String[] args) {
        Menu();
    }

    public static void Demo1() {
        ArrayList<Double> myList = new ArrayList();
        myList.add(5.0);
        myList.add(6.5);
        myList.add(7.5);
        myList.add(8.5);

        double sum = 0;
        for (Double x : myList) {
            sum += x;
        }

        System.out.println("Tong double: " + sum);
    }

    // Nhap danh sach 5 cau hoi xong trao ngau nhien bang Collections
    public static void Demo2() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listQuestions = new ArrayList();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter question " + (i + 1) + ": ");
            String quests = scanner.nextLine();
            listQuestions.add(quests);
        }
        // Before question being shuffle
        System.out.println("Before question bing shuffle");
        for (String x : listQuestions) {
            System.out.println(x);
        }

        Collections.shuffle(listQuestions);

        System.out.println("After questions were shuffled");
        // after question was shuffle
        for (String x : listQuestions) {
            System.out.println(x);
        }

    }
}
