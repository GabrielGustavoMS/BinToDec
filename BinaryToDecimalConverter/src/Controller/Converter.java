/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Gabriel Gustavo
 */
public class Converter {
    
    public static String binaryToDecimal(String binaryNumber) {
        String result = "";
        try {
            
            int numero = Integer.parseInt(binaryNumber, 2);
            result = numero+"";
           
        } catch (Exception e) {
            result = "The binary number field accepts only 0 and 1";
            System.out.println(""+e);
        }
        
        return result;
    }

}
