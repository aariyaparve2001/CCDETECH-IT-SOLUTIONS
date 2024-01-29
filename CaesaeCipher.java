/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesaecipher;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CaesaeCipher {
    static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    
    
    
    public static String encoding(String pText, int Key){
      pText = pText.toLowerCase();
      String cText = "";
      for(int i = 0; i<pText.length();i++){
          int charIndex = alphabet.indexOf(pText.charAt(i));
          int newIndex = (charIndex + Key) % 26;
          char cipherChar = alphabet.charAt(newIndex);
          cText = cText + cipherChar;
      }
      
      return cText;
        
    }
    
    public static String decoding(String cText, int Key){
     cText = cText.toLowerCase();
     String pText="";
     for(int i=0;i<cText.length();i++){
         int charIndex=alphabet.indexOf(cText.charAt(i));
         int newIndex =(charIndex - Key) % 26;
         if (newIndex < 0){
             newIndex = alphabet.length()+ newIndex;
         }
         char plainChar = alphabet.charAt(newIndex);
         pText = pText + plainChar;
     }
     
     return pText;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter Plain Text >>");
       String plain = scan.nextLine();
       
       System.out.print("Enter Key >>");
       int Key = scan.nextInt();
       
       String cipherText = encoding(plain, Key);
       System.out.println("The cipher text: " + cipherText);
    }
    
}
