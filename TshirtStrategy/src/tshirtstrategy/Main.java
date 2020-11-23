package tshirtstrategy;

import tshirtstrategy.payment.paymentStrategy.BankTransfer;
import tshirtstrategy.payment.paymentStrategy.CardPayment;
import tshirtstrategy.payment.paymentStrategy.Cash;
import tshirtstrategy.payment.paymentStrategy.PaymentStrategy;
import tshirtstrategy.tshirt.Color;
import tshirtstrategy.tshirt.Fabric;
import tshirtstrategy.tshirt.Size;
import tshirtstrategy.tshirt.Tshirt;

/**
 *
 * @author ntsia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Basket b = new Basket();
        
        
        Tshirt t1= new Tshirt(Color.YELLOW, Fabric.RAYON, Size.S);
        Tshirt t2= new Tshirt(Color.BLUE, Fabric.POLYESTER, Size.M);
        Tshirt t3= new Tshirt(Color.VIOLET, Fabric.LINEN, Size.XXL); 
        Tshirt t4= new Tshirt(Color.ORANGE, Fabric.POLYESTER, Size.S);   
        Tshirt t5= new Tshirt(Color.RED, Fabric.SILK, Size.XL);
     
        
        b.getBasket().add(t1);
        b.getBasket().add(t2);
        b.getBasket().add(t3);
        b.getBasket().add(t4);
        b.getBasket().add(t5);
        
        b.checkout();
    }
    
    
}
