/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ntsia
 */
public class BootCamp {
    
    private String name;
    private LocalDate startingDate = LocalDate.now();
    private LocalDate endingDate = LocalDate.now();
  
    
    //constructors
    public BootCamp() {
    }

    public BootCamp(String name) {
        this.name = name;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }

    public LocalDate getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(LocalDate endingDate) {
        this.endingDate = endingDate;
    }
    
//toString
    @Override
    public String toString() {
        return "BootCamp{" + "name=" + name + ", startingDate=" + startingDate + ", endingDate=" + endingDate + '}';
    }
    
    
    
    
}
