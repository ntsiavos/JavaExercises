package tshirtstrategy.payment.paymentStrategy;

/**
 *
 * @author ntsia
 */
public class BankTransfer implements PaymentStrategy {
    
    private String bank;
    private String account;

    @Override
    public void pay(Double price) {
   
        System.out.println("You will pay " +price+ " using money transfer from your account " +this+". Thank you!");
    }

    public BankTransfer() {
    }

    public BankTransfer(String bank, String account) {
        this.bank = bank;
        this.account = account;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "{" + "bank=" + bank + ", account=" + account + '}';
    }
    
}
