/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.util.Scanner;

/**
 *
 * @author hanth
 */
public class Lab4Exercise1 {

    static class SanPham {

        private String tenSP;
        private double donGia;
        private double giamGia;

        public SanPham() {

        }

        public SanPham(String tenSp, double donGia, double giamGia) {
            this.tenSP = tenSp;
            this.donGia = donGia;
            this.giamGia = giamGia;
        }

        public SanPham(String tenSp, double donGia) {
            this(tenSp,donGia, 0);
        }
        
        public String getTenSp(){
            return this.tenSP;
        }
        
        public void setTenSp(String tenSP){
            this.tenSP = tenSP;
        }
        
        public double getDonGia(){
            return this.donGia;
        }
        
        public void setDonGia(double donGia){
            this.donGia = donGia;
        }
        
        public double getGiamGia(){
            return this.giamGia;
        }
        
        public void setGiamGia(double donGia){
            this.donGia = donGia;
        }

        private double getThueNhapKhau() {

            return donGia * 10 / 100;
        }

        public void nhap() {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter product name: ");
            tenSP = scanner.next();
            System.out.print("Enter product price: ");
            donGia = scanner.nextDouble();
            System.out.print("Enter product discount: ");
            giamGia = scanner.nextDouble();

        }

        public void xuat() {
            System.out.println("Product name: " + this.tenSP);
            System.out.println("Product price: " + this.donGia);
            System.out.println("Product discount: " + this.giamGia);
            System.out.println("Product taxt: " + this.getThueNhapKhau());

        }
    }

    public static void main(String[] args) {
        SanPham Sp1 = new SanPham();
        Sp1.nhap();
        Sp1.xuat();

        SanPham Sp2 = new SanPham();
        Sp2.nhap();
        Sp2.xuat();

    }
}
