package ch13generic.book.exam04;

public class Container<K, T> {
    private K key;
    private T field;


    public void set(K key, T field) {
        this.key = key;
        this.field = field;
    }

    public K getKey() {
        return key;
    }

    public T getValue() {
        return field;
    }
}
