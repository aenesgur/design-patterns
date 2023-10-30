package strategy.with_strategy.discount;

public class ClothingDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double originalPrice) {
        return originalPrice * 0.2;
    }
}