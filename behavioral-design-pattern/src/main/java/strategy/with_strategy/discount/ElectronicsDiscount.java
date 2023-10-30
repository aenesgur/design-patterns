package strategy.with_strategy.discount;

public class ElectronicsDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double originalPrice) {
        return originalPrice * 0.05;
    }
}
