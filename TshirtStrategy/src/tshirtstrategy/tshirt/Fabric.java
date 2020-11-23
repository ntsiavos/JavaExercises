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
public enum Fabric {
    WOOL(2), COTTON(2),  POLYESTER(4),  RAYON(4),  LINEN(5),  CASHMERE(7),  SILK(10);
    
    private final int fabricVal;
    
    Fabric(int fabricVal){
        this.fabricVal = fabricVal;
    }
    
    public int getFabricVal() {
        return fabricVal;
    }
    
}
