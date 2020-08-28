/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kino;



/**
 *
 * @author ntsia
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        run();
    
    }
    
    public static void run(){
    
    KinoDraw newKino = new KinoDraw();
    newKino.betAmount();
    newKino.guessResult();
    newKino.numberOfDraws();
    newKino.runDraw();
    newKino.end();
        
    }
}
