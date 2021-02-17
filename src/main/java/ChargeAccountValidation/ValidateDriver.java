/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChargeAccountValidation;

import java.util.Scanner;

/**
 *
 * @author drewm
 */
public class ValidateDriver {

    
    public static void main(String[] args) {
            String[] validNumbers = 
            {"5605","0454","8098","7087","2032","4560",
            "7598","4565","1232","4685","1328","1357",
            "2379","9156","9724","9836","4379","1973",};
        Scanner keyboard = new Scanner(System.in);
        Validate newValidation = new Validate();
        System.out.println("Enter a number to check the valdaiton of");
        String userInput = keyboard.nextLine();
        String answer = newValidation.validateInput(validNumbers, userInput);
        System.out.println(answer);
    }
}
