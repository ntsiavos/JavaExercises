package tshirtstrategy;

import java.util.ArrayList;
import java.util.List;
import tshirtstrategy.payment.paymentStrategy.BankTransfer;
import tshirtstrategy.payment.paymentStrategy.CardPayment;
import tshirtstrategy.payment.paymentStrategy.Cash;
import tshirtstrategy.payment.paymentStrategy.PaymentStrategy;
import tshirtstrategy.tshirt.Tshirt;

/**
 *
 * @author ntsia
 */
public class Basket {
    private List<Tshirt> basket;
    
    

    public Basket() {
        basket = new ArrayList<>();
    }


    

    public double calculateTotal(){
        double p=0.0;
        for (Tshirt tshirt : basket) {
             p+= (tshirt.getPrice());
        }
        return p;
    }

    public List<Tshirt> getBasket() {
        return basket;
    }

    public void setBasket(List<Tshirt> basket) {
        this.basket = basket;
    }

    public void checkout(){
        
        PaymentStrategy strategy;
    
        double checkoutPrice=this.calculateTotal();
        System.out.println("Your total is " +checkoutPrice);
        
        if (checkoutPrice <50){
            strategy = new Cash();
            strategy.pay(checkoutPrice);
        }
        else if (checkoutPrice <150){
            strategy = new CardPayment("Piraieus", "08/28", "12345678987");
            strategy.pay(checkoutPrice);
        
        }
        else{
            strategy= new BankTransfer("Eurobank", "0987654321234-43");
            strategy.pay(checkoutPrice);
        }
    
    }
}
