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
public class SlideOne {

    public static void main(String args[]) {
        
        demo5();
    }

    public static void demo2() {
        int a = 7;
        int b = 8;
        int c = 8;

        int diemTb = ((a * 2) + b + c) * 3 / 4;

        System.out.println(c);
        System.out.println(diemTb);
    }
    
    
    public static void demo3(){
        String hoten = "Han Thien Duc";
        int tuoi = 23;
        
        System.out.print("<<hoten>>"+hoten+"<<tuoi>>"+tuoi);
        System.out.println();
        System.out.println("<<hoten>>"+hoten+"<<tuoi>>"+tuoi);
        System.out.printf("<<hoten>> %s <<tuoi>> %d", hoten, tuoi);
        
    }
    
    public static void demo4(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Hoten: ");
        String hoten = scanner.nextLine();
        
        System.out.print("Tuoi: ");
        int tuoi = scanner.nextInt();
        
        System.out.printf("<<hoten>> %s <<tuoi>> %d", hoten, tuoi);
        System.out.println("");
    }
    
    public static void demo5(){
        int ranNumber = 5-((int)Math.round(Math.random()*(5-12)));
        
        int quadNumber = (int)Math.sqrt(ranNumber);
        
        System.out.println("quadratic of random number"+ quadNumber);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Number One: ");
        double numOne = scanner.nextDouble();
        
        System.out.print("Number Two: ");
        double numTwo = scanner.nextDouble();
        
        double powNum = Math.pow(numOne, numTwo);
        
        double minNum = Math.min(numOne, numTwo);
        double maxNum = Math.max(numOne, numTwo);
        
        System.out.println("Pow two number "+ powNum);
        
        System.out.println("min of two number "+ minNum + "max of two number" + maxNum);
        
        
    }
}
