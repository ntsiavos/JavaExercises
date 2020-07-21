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
public class Teacher extends Employee implements Advisable{

    public Teacher() {
    }

    public Teacher(String name, int salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Teacher{" + '}';
    }
    
    public void teach(){
        System.out.println(getName()+ " is teaching the class.");
    }

    @Override
    public void giveAdvice() {
        System.out.println(getName()+ " is giving advice.");
    }

    @Override
    void work() {
        teach();
    }
    
}
