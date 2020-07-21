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
public class Receptionist extends Employee implements Driving{
    
    public Receptionist() {
    }

    public Receptionist(String name, int salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Receptionist{" + '}';
    }
    
    public void greet(){
        System.out.println(getName()+ " is greeting the visitors");
    }

    @Override
    public void drive() {
        System.out.println(getName()+ " is driving.");
    }

    @Override
    void work() {
        greet();
    }
}
