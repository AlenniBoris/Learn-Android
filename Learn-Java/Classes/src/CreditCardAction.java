public class CreditCardAction extends CardAction{
    @Override
    public void doPayment(double amountPayment) {
        System.out.println("complete from credit card");
    }
    public boolean checkCreditLimit() { // own method
        return true;
    }
}
