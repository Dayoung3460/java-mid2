package collection.map.test.cart;

import java.util.Objects;

public class Product {
    private String item;
    private int price;

    public Product(String item, int count) {
        this.item = item;
        this.price = count;
    }

    public String getItem() {
        return item;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(item, product.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "item='" + item + '\'' +
                ", price=" + price +
                '}';
    }
}
