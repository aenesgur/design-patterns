package composite.composite;

import composite.component.Priceable;

import java.util.ArrayList;
import java.util.List;

public class Box implements Priceable{
    private List<Priceable> items = new ArrayList<>();

    public void add(Priceable item) {
        items.add(item);
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for (Priceable item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}
