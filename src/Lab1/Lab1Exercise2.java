/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.util.Scanner;

/**
 *
 * @author hanth
 */
public class Lab1Exercise2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Chieu dai: ");
        double chieuDai = input.nextDouble();
        
        System.out.print("Chieu rong: ");
        double chieuRong = input.nextDouble();
        
        double chuVi = (chieuDai + chieuRong) * 2;
        double dienTich = chieuDai * chieuRong;
        double canhNho = Math.min(chieuDai, chieuRong);
        
        System.out.printf("Chu Vi %.1f ", chuVi);
        System.out.printf("Dien Tich %.1f ", dienTich);
        System.out.printf("Canh Nho %.1f ", canhNho);
        
    }
}
