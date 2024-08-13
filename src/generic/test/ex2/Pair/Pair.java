package generic.test.ex2.Pair;

public class Pair<K, V> {
    private K first;
    private V second;


    public void setFirst(K i) {
        first = i;
    }

    public void setSecond(V data) {
        second = data;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
