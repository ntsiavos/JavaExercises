package tshirtstrategy.payment.paymentStrategy;

/**
 *
 * @author ntsia
 */
public class Cash implements PaymentStrategy{

    @Override
    public void pay(Double price) {
        System.out.println("You have paid " +price+ " using cash. Thank you!");
    }
    
    
    
}
