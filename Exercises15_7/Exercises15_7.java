/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises15_7;

import java.util.Scanner;

/**
 *
 * @author ntsia
 */
public class Exercises15_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
     Scanner sc = new Scanner(System.in);   
     System.out.println("Please enter your favorite movie quote: ");   
     String quote = sc.nextLine();
     System.out.println(quote);
     
     //We substract from the original string length, the legth of the string without spaces
     int count = (quote.length() - quote.replace(" ", "").length());
     System.out.println(count);
     
     
     String str = "Harry";
     int n=str.length();
     String mystery=str.substring(0,1)+str.substring(n-1,n);
     System.out.println(mystery);
     
     
    }
    
}
