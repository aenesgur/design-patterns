package strategy;


import strategy.model.PaymentType;
import strategy.payment.PaymentMethod;
import strategy.payment.PaymentMethodDecider;
import strategy.service.PaymentService;

public class Main {
    public static void main(String[] args) {

        PaymentType paymentType = PaymentType.PAYPAL;
        double amount = 50;

        //Factory Design Pattern
        PaymentMethodDecider paymentMethodDecider = new PaymentMethodDecider();
        PaymentMethod paymentMethod = paymentMethodDecider.decide(paymentType);

        //Strategy Design Pattern
        PaymentService paymentService = new PaymentService(paymentMethod);
        paymentService.processPayment(amount);
    }
}