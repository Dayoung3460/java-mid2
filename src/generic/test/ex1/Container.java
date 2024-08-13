package generic.test.ex1;

public class Container<T> {
    private T value;

    public boolean isEmpty() {
        return value == null;
    }

    public void setItem(T item) {
        this.value = item;
    }

    public T getItem() {
        return value;
    }
}
