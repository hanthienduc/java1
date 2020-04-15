/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hanth
 */
public class Lab3Exercise3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // enter length of array
        System.out.print("Enter n:");
        int n = scanner.nextInt();

        //initiate the array
        int[] Arr = new int[n];
        
        // Enter value for each element in the array
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = scanner.nextInt();
        }
        
        // Sort the array and output 
        Arrays.sort(Arr);

        for (int i = 0; i < Arr.length; i++) {
            System.out.println(Arr[i]);
        }
        
        // find the min value of the array and output
        int min = Arr[0];
        int Min = 0;
        for (int i = 0; i < Arr.length; i++) {
            if(Arr[i] < min){
                min = Arr[i];
            }
            // Min = Math.min(min, Arr[i]);
        }   
        System.out.println(min);
        
        // Calculate Avg number divided by 3
        int sum = 0;
        int avg = 0;
        int count = 0;
        for(int i = 0; i < Arr.length; i++){
            if(Arr[i] % 3 == 0){
                sum += Arr[i];
                count++;
            }
        }
        avg = sum / count;
        System.out.println("Average number: "+ avg);

    }
}
