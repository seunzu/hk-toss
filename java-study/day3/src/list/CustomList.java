package list;

public interface CustomList<T> {

    void add(T item);
    int size();

    void remove(int index);
    void remove(T item);
    T get(int index);
    String toString();
}
