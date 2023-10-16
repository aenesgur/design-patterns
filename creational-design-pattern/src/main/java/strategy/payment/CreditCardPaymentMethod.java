package strategy.payment;

public class CreditCardPaymentMethod implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println(String.format("Processing payment with credit card for $%s", amount));
        // credit card payment logic
    }
}
