package observer.observer;

public class PremiumUser implements UserObserver {

    private String name;

    public PremiumUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println("The news received to ".concat(name));
    }
}
