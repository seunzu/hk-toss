package list;

public class Node<T> implements CustomList<T> {
    private Node<T> next;
    private T data;
    private int size;

    public Node(T data) {
        this.data = data;
        size = 1;
    }

    public static void main(String[] args) {
        CustomList<String> list = new Node<>("t");
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list.size());
    }

    @Override
    public void add(T item) {
        Node<T> current = this;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node<>(item);
        size++;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void remove(T item) {

    }

    @Override
    public T get(int index) {
        return null;
    }
}
