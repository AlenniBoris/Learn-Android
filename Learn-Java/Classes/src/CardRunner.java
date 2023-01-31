public class CardRunner {
    public static void main(String[] args) {
        CardAction action1 = new CardAction();
        CardAction action2 = new CreditCardAction();
        CreditCardAction cc = new CreditCardAction();
// CreditCardAction cca = new CardAction(); // compile error: class cast
        action1.doPayment(15.5); // method of CardAction
        action2.doPayment(21.2); // polymorphic method: CreditCardAction
// dc2.checkCreditLimit(); // compile error: non-polymorphic method
        ((CreditCardAction) action2).checkCreditLimit(); // ок
        cc.doPayment(7.0); // polymorphic method: CreditCardAction
        cc.checkCreditLimit(); // non-polymorphic method CreditCardAction
        ((CreditCardAction) action1).checkCreditLimit(); // runtime error: class cast
    }
}
