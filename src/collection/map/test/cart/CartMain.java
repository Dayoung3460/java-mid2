package collection.map.test.cart;

public class CartMain {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Product("apple", 1000), 1);
        cart.add(new Product("banana", 500), 1);
        cart.printAll();

        cart.add(new Product("apple", 1000), 2);
        cart.printAll();

        cart.minus(new Product("apple", 1000), 3);
        cart.printAll();
    }
}
