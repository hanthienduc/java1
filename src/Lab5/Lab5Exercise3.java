/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hanth
 */
public class Lab5Exercise3 {

    static ArrayList<Product> list = new ArrayList();
    
    
    public static void Input(){
    
    }
    
    public static void SortDesAndOutput(){
        
    }
    
    public static void FindAndDeleteByName(){
    
    }
    
    public static void OutputAveragePrice(){
        
    }
    
    public static void End(){
        System.exit(0);
    }
    
    public static void Menu() {
        System.out.println("1. Input list products. ");
        System.out.println("2. Sort Descending by price output");
        System.out.println("3. Find and Delete product by name.");
        System.out.println("4. Output Average product price. ");        
        System.out.println("0. End. ");

        Scanner in = new Scanner(System.in);
        System.out.print("Your choice? ");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                Input();
                break;
            case 2:
                SortDesAndOutput();
                break;
            case 3:
                FindAndDeleteByName();
                break;
            case 4:
                OutputAveragePrice();
                break;
            case 0:
                End();
                break;
            default:
                System.out.println("Not Exist Option! ");
                System.out.println("Your choice? ");
                choice = in.nextInt();
                break;
        }
    }

    public static void main(String[] args) {

    }
}