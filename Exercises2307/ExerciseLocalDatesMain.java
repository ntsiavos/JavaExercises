/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ntsia
 */
public class ExerciseLocalDatesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String name;
        LocalDate start = LocalDate.now();
        LocalDate end = LocalDate.now();
        List<BootCamp> bootCamps = new ArrayList();
        
        System.out.println("We wiil now create 3 Bootcamps. Please enter all information below.");
        

        BootCamp b1 = new BootCamp(insertName());
        b1.setStartingDate(insertStart());
        b1.setEndingDate(insertEnd());
        
        BootCamp b2 = new BootCamp(insertName());
        b2.setStartingDate(insertStart());
        b2.setEndingDate(insertEnd());
        
        BootCamp b3 = new BootCamp(insertName());
        b3.setStartingDate(insertStart());
        b3.setEndingDate(insertEnd());
        

        
        bootCamps.add(b1);
        bootCamps.add(b2);
        bootCamps.add(b3);
        
//        checkDate();
        System.out.println("Please enter a date in the dd/mm/yyyy format to check for Bootcamp availability: ");
        Scanner sc = new Scanner(System.in);
        String check = sc.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate checkDate = LocalDate.parse(check, formatter);
       
        if (checkDate.isAfter(b1.getStartingDate()) && checkDate.isBefore(b1.getEndingDate())){ 
            System.out.println("Bootcamp "+b1.getName()+ " is available at this date!");
        }
        
        else if   (checkDate.isAfter(b2.getStartingDate()) && checkDate.isBefore(b2.getEndingDate())){ 
            System.out.println("Bootcamp "+b2.getName()+ " is available at this date!");
        }
        else if   (checkDate.isAfter(b3.getStartingDate()) && checkDate.isBefore(b3.getEndingDate())){ 
            System.out.println("Bootcamp "+b3.getName()+ " is available at this date!");
        }
        else System.out.println("Sorry, no Bootcamp available at this date.");
        
        
    }
        
        
   
        
        
    
    public static String insertName() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the name of the Bootcamp: ");
        String name = sc.next();
        return name;
    }

    public static LocalDate insertStart() {    
        System.out.println("Please enter the starting date of the bootcamp. Please use format dd/mm/yyyy : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate start = LocalDate.parse(s, formatter);
        return start;
    }
    
    public static LocalDate insertEnd() {
        System.out.println("Please enter the ending date of the bootcamp. Please use format dd/mm/yyyy : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate end = LocalDate.parse(s, formatter);
        return end;
    }
    
    public static void checkDate(){
//        System.out.println("Please enter a date in the dd/mm/yyyy format to check for Bootcamp availability: ");
//        Scanner sc = new Scanner(System.in);
//        String check = sc.next();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate checkDate = LocalDate.parse(check, formatter);
//        boolean dateCheck;
//        if (checkDate.isAfter())
        
    }
            
                
}
   