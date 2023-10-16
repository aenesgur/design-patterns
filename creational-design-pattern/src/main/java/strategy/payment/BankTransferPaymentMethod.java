package strategy.payment;

public class BankTransferPaymentMethod implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println(String.format("Processing payment with bank transfer for $%s", amount));
        // bank transfer payment logic
    }
}
