/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChargeAccountValidation;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author drewm
 */
public class Validate {
    public String[] validNumbers;
    String userInput;

    public String validateInput(String[] validNumbers, String userInput) {
        if (Arrays.asList(validNumbers).contains(userInput)) {
            return "Success";
        } else
            return "Failure";
    }  
    
}
