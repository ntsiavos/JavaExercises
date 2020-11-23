package tshirtstrategy.payment.paymentStrategy;



/**
 *
 * @author ntsia
 */
public class CardPayment implements PaymentStrategy {
    
    private String bank;
    private String expiryDate;
    private String cardNumber;

    public CardPayment() {
    }

    public CardPayment(String bank, String expiryDate, String cardNumber) {
        this.bank = bank;
        this.expiryDate = expiryDate;
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "{" + "bank=" + bank + ", expiry date=" + expiryDate + ", card number=" + cardNumber + '}';
    }
    
    

    

    @Override
    public void pay(Double price) {
        
        System.out.println("You have paid " +price+ " using credit card " +this+". Thank you!");
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    
}
