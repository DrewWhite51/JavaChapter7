/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LargerThanN;

/**
 *
 * @author drewm
 */
public class LargerThanDriver {
    public static int [ ] greaterNumbers( int [ ] intArray, int number){
        
        int [ ] greaterNumbers = new int [intArray.length]; 
        int greaterNumbersIndex = 0;
        
        
        
        for ( int i = 0; i < intArray.length; i++ ){
            
            if ( intArray[ i ] > number){
                
                greaterNumbers[ greaterNumbersIndex ] = intArray[ i ];
                greaterNumbersIndex = greaterNumbersIndex + 1 ;
            }
            
        }
        
        return greaterNumbers;
    }
    
    
    public static void main(String[] args) {
         
        int [ ] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
       
        int numb = 10;
        
        int greaterNumbersReturned [] = greaterNumbers(intArray, numb);
        
        for (int i = 0; i < greaterNumbersReturned.length; i ++){
            
            if (greaterNumbersReturned[ i ] != 0){
                System.out.println(greaterNumbersReturned[i]);

            }

        }
        
    }
}
