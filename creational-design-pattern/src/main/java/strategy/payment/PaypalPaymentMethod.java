package strategy.payment;

public class PaypalPaymentMethod implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println(String.format("Processing payment with paypal for $%s", amount));
        // paypal payment logic
    }
}

