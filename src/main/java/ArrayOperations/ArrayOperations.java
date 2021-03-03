/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayOperations;

/**
 *
 * @author drewm
 */
public class ArrayOperations {
    public static void main(String[] args) {
        double[] doubleArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16
                ,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        double n = doubleArray.length;
        
        System.out.println("The total is " +
                getTotal(doubleArray, n));
        
        System.out.println("The average is " +
                getAverage(doubleArray, n));
        
        System.out.println("The highest number is " +
                getHighest(doubleArray,n));
        
        System.out.println("The lowest number is " +
                getLowest(doubleArray,n));
    }
    
    public static double getTotal(double[] intArray, double n) {
        double sum=0;
        for (int i=0;i<n;i++) {
            sum+=intArray[i];
        }
        return sum;
    }
    
    public static double getAverage(double[] doubleArray, double n) {
        double sum=0;
        double average =0;
        for (int i=0;i<n;i++) {
            sum += doubleArray[i];
        }
        average = sum/n;
        return average;
    }
    
    public static double getHighest(double[] doubleArray, double n) {
        double highestNum = doubleArray[0];
        for (int arrayIndex = 0;arrayIndex<doubleArray.length;arrayIndex++) {
            if (doubleArray[arrayIndex]> highestNum) {
                highestNum = doubleArray[arrayIndex];
            }
        }
        return highestNum;
    }
    
    public static double getLowest(double[] doubleArray, double n) {
        double lowestNum = doubleArray[0];
        for (int arrayIndex=0;arrayIndex<doubleArray.length;arrayIndex++){
            if (doubleArray[arrayIndex]<lowestNum) {
                lowestNum = doubleArray[arrayIndex];
            }
        }
        return lowestNum;
    }
}
