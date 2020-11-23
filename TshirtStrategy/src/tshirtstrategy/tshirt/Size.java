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
public enum Size {
    XS(0), S(1),M(2),L(2), XL(3), XXL(4), XXXL(6);
    
    private final int sizeVal;
    
    Size(int sizeVal){
        this.sizeVal = sizeVal;
    }
    
    public int getSizeVal() {
        return sizeVal;
    }
    
}
