/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rainfalll;

import java.util.Scanner;




/**
 *
 * @author drewm
 */
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double rain[] = new double[12];
        double sum = 0;
        double average = 0;
        double mostRain = 0;
        double leastRain = 0;
        
        System.out.println("I am your automated rain bot.");
        System.out.println("Give me rainfall for each month and "
                + "I will give you calculations.");
        
        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        
        for (int i=0;i<months.length;i++) {
            System.out.println(months[i]+" :");
            double val = keyboard.nextDouble();
            while(val<0){
                System.out.println("negatives not allowed ! enter again");
                val = keyboard.nextDouble();
            }
            rain[i]=val;
            sum+=val;
        }
        average = sum/12;
        System.out.println("----------------");
        System.out.println("The sum of the rain this year is "
                + sum+ " inches.");
        System.out.println("The average of the rain this year is "
                + average + " inches.");
        
        
        mostRain = getMax(rain);
        leastRain = getMin(rain);
        
        System.out.println("The most rain was " + mostRain);
        System.out.println("The least rain was " + leastRain);
        System.out.println("----------------");
    }
    
    private static double getMax(double [] rain) {
        double max = 0;
        for (double i : rain) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    
    private static double getMin(double[] rain) {

        double min = Double.MAX_VALUE;
        for (double i : rain) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

}


