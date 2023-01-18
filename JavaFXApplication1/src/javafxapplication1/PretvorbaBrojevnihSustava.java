/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class PretvorbaBrojevnihSustava {
    
    public static void dekToHex(){
/*--------------------------OVDJE SE VRATITI --------------------------*/
        
        String originalNumber = JavaFXApplication1.btnConsole.getText();
        int originalInteger = Integer.parseInt(originalNumber);
        String finalNumber = Integer.toHexString(originalInteger);
        
        JavaFXApplication1.btnConsole.setText(finalNumber);
        
        System.out.println("dekToHex");
   
    }
    
    public static void dekToOct(){
        /*--------------------------OVDJE SE VRATITI --------------------------*/
        
        String originalNumber = JavaFXApplication1.btnConsole.getText();
        int originalInteger = Integer.parseInt(originalNumber);
        String finalNumber = Integer.toOctalString(originalInteger);
        
        JavaFXApplication1.btnConsole.setText(finalNumber);
        
        System.out.println("dekToOct");
  
    }   
    
    public static void dekToBin(){
        /*--------------------------OVDJE SE VRATITI --------------------------*/
        String originalNumber = JavaFXApplication1.btnConsole.getText();
        int originalInteger = Integer.parseInt(originalNumber);
        String finalNumber = Integer.toBinaryString(originalInteger);
        
        JavaFXApplication1.btnConsole.setText(finalNumber);
        
        System.out.println("dekToBin");
  
    }
    

    public static void hexToDek(){
        
        String originalNumber = JavaFXApplication1.btnConsole.getText();
        int originalInteger = Integer.parseInt(originalNumber,16);
        String finalNumber = "" +originalInteger;
        
        JavaFXApplication1.btnConsole.setText(finalNumber);

        System.out.println("hexToDek");
        
    }
    

    public static void hexToOct(){
        String originalNumber = JavaFXApplication1.btnConsole.getText();
        int originalInteger = Integer.parseInt(originalNumber,16);

        String finalNumber = Integer.toOctalString(originalInteger);
        
        JavaFXApplication1.btnConsole.setText(finalNumber);
        
        System.out.println("hexToOct"); 
    }
    
    
    public static void hexToBin(){
        String originalNumber = JavaFXApplication1.btnConsole.getText();
        int originalInteger = Integer.parseInt(originalNumber,16);
        
        String finalNumber = Integer.toBinaryString(originalInteger);
        
        JavaFXApplication1.btnConsole.setText(finalNumber);
        System.out.println("hexToBin");  
    }
    

    public static void octToDek(){
        String originalNumber = JavaFXApplication1.btnConsole.getText();
        int originalInteger = Integer.parseInt(originalNumber,8);
        String finalNumber = "" +originalInteger;
        
        JavaFXApplication1.btnConsole.setText(finalNumber);
        
        System.out.println("octToDek");

    }

    public static void octToHex(){
        
        System.out.println("octToHex");
        
        String originalNumber = JavaFXApplication1.btnConsole.getText();
        int originalInteger = Integer.parseInt(originalNumber,8);

        String finalNumber = Integer.toHexString(originalInteger);
        
        
        
        JavaFXApplication1.btnConsole.setText(finalNumber);
  
    }
    
    public static void octToBin(){
        
        String originalNumber = JavaFXApplication1.btnConsole.getText();
        int originalInteger = Integer.parseInt(originalNumber,8);
        
        String finalNumber = Integer.toBinaryString(originalInteger);
        
        JavaFXApplication1.btnConsole.setText(finalNumber);

        System.out.println("octToBin");  
        
    }
    
    
    public static void binToDek(){
        
        String originalNumber = JavaFXApplication1.btnConsole.getText();
        int originalInteger = Integer.parseInt(originalNumber,2);
        
        String finalNumber = "" +originalInteger;
        
        JavaFXApplication1.btnConsole.setText(finalNumber);
        
        System.out.println("binToDek"); 
    }
    
    public static void binToHex(){
        
        String originalNumber = JavaFXApplication1.btnConsole.getText();
        int originalInteger = Integer.parseInt(originalNumber,2);

        String finalNumber = Integer.toHexString(originalInteger);
        
        JavaFXApplication1.btnConsole.setText(finalNumber);
        System.out.println("binToHex");
        
  
    }

    public static void binToOct(){
        
        String originalNumber = JavaFXApplication1.btnConsole.getText();
        int originalInteger = Integer.parseInt(originalNumber,2);
        
        String finalNumber = Integer.toOctalString(originalInteger);
        
        JavaFXApplication1.btnConsole.setText(finalNumber);
        
        System.out.println("binToOct");

    } 
}



