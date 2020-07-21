/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ntsia
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Teacher t1 = new Teacher("John", 800);
        Teacher t2 = new Teacher("Helen", 830);
        Receptionist r1 = new Receptionist("Stefanie", 650);
        Director d1 = new Director("Bolton", 2000);
        Director d2 = new Director("Margaret", 1900);
        
        List<Employee> staff = new ArrayList();
        
        staff.add(t1);
        staff.add(t2);
        staff.add(r1);
        staff.add(d1);
        staff.add(d2);
        
        for (Employee e:staff) e.work();
        
        List<Employee> drivers = new ArrayList();
        List<Employee> advisors = new ArrayList();
        
        for (Employee e : staff) {
            if ((e instanceof Advisable) && (e instanceof Driving)) {
                drivers.add(e);
                advisors.add(e);
            } else if (e instanceof Advisable) {
                advisors.add(e);
            } else if (e instanceof Driving) {
                drivers.add(e);
            }
        }
        System.out.println("The drivers are: ");
        for (Employee e: drivers) System.out.println(e.getName()+ " ");
        System.out.println("The advisors are: ");
        for (Employee e: advisors) System.out.println(e.getName()+ " ");
    }
    
}
