/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author ntsia
 */
public class Director extends Employee implements Advisable, Driving{
    
    public Director() {
    }

    public Director(String name, int salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Director{" + '}';
    }
    
    public void guide(){
        System.out.println(getName()+ " is guiding the staff");
    }

    @Override
    public void giveAdvice() {
        System.out.println(getName()+ " is giving advice.");
    }

    @Override
    public void drive() {
        System.out.println(getName()+ " is driving.");
    }

    @Override
    public void work() {
        guide();
    }
    
}
