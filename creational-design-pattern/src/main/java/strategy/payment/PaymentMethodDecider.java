package strategy.payment;


import strategy.model.PaymentType;

public class PaymentMethodDecider {

    public PaymentMethod decide(PaymentType paymentType) {
        switch (paymentType) {
            case BANK_TRANSFER:
                return new BankTransferPaymentMethod();
            case CREDIT_CARD:
                return new CreditCardPaymentMethod();
            case PAYPAL:
                return new PaypalPaymentMethod();
            default:
                throw new IllegalArgumentException("Invalid Payment Type");
        }
    }
}
