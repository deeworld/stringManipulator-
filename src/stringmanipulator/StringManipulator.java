/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmanipulator;

import java.util.Scanner;

/**
 *
 * @author DEE
 */
public class StringManipulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String userInput= "";
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter city name: ");
        userInput = keyboard.next();
        int charNum = userInput.length();
        System.out.println("charater number is: "+charNum);
        String UpperCity = userInput.toUpperCase();
        System.out.println("Uppercase: "+UpperCity);
        String LowerCity = userInput.toLowerCase();
        System.out.println("Lowercase: "+LowerCity);
        char firstLetter = userInput.charAt(0);
        System.out.println("First letter: "+firstLetter);

        
    }
    
}
