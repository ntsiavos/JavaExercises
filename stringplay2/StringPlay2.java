/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringplay2;

import java.util.Scanner;

/**
 *
 * @author ntsia
 */
public class StringPlay2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
    String message = mergeStrings("My name is Enrico Mondoya", ", you killed my father, prepare to die!");
    System.out.println(message);
        
    System.out.println(trimString());
    
    String splitted[] = (splitString("Computer, Laptop, Tablet"));
        printArray(splitted);
        
    String domain = returnDomain("http://peoplecert.com");
    System.out.println(domain);
    
    }
    //Concat method
    public static String mergeStrings (String first, String second){
    String third = first.concat(second).toUpperCase();
    return third;
    }
    
    public static String trimString (){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a phrase: ");
    String trimmed = (input.next()).trim();
    return trimmed;

    }
    
    public static String[] splitString (String a){
    String b = a.replace(", ", ",");
    System.out.println(b);
    String temp[] = b.split(",");
    return temp;
    }
    
    public static void printArray(String array[]){
        for(String s:array) System.out.print(s+ " ");
    }
    
    public static String returnDomain(String address){
    String domain = address.substring(7);
    return domain;
        }
}
