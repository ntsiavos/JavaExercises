/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtstrategy.tshirt;

/**
 *
 * @author ntsia
 */
public enum Color {
    RED(1), ORANGE(2), YELLOW(3), GREEN(3), BLUE(4), INDIGO(5), VIOLET(5);

    private final int colorVal;
    
    Color(int colorVal){
        this.colorVal = colorVal;
    }
    
    public int getColorVal() {
        return colorVal;
    }
    
}
