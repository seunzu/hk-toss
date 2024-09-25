package custom;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList {

    private Object[] arr;
    private int size;

    public CustomArrayList() {
        arr = new Object[10];
        size = 0;
    }

    public static void main(String[] args) {
        CustomList<String> strs = new CustomArrayList();
        strs.add("Hello");
        strs.add("World");
        strs.add("Java");
        System.out.println(strs);
        for (int i = 0; i < 10; i++) {
            strs.add(i + "index");
        }
        System.out.println(strs);
        System.out.println(strs.get(4));
        strs.remove("Java");
        System.out.println(strs);
    }

    @Override
    public void add(Object item) {
        Object[] before = arr;
        if (size == arr.length) arr = new Object[arr.length + 1];
        arr[size++] = item;
        for (int i = 0; i < before.length; i++) {
            arr[i] = before[i];
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    @Override
    public void remove(Object item) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(item)) {
                remove(i);
                return;
            }
        }
    }

    @Override
    public Object get(int index) {
        if (size <= index) return null;
        return arr[index];
    }

    @Override
    public String toString() {
        return "arr = " + Arrays.toString(arr) + ", size = " + size;
    }
}
