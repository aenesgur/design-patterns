package builder.model;

public class Product {
    private String name;
    private String type;
    private int price;

    private Product(Builder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.price = builder.price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public static class Builder {
        private String name;
        private String type;
        private int price;

        public Builder(String name) {
            this.name = name;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder price(int price) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
