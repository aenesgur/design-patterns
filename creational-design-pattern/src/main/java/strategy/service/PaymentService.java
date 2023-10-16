package strategy.service;


import strategy.payment.PaymentMethod;

public class PaymentService {
    private PaymentMethod paymentMethod;

    public PaymentService(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }
    public void processPayment(double amount) {
        paymentMethod.processPayment(amount);
    }
}
