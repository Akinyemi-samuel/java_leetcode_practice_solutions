package easy;

import java.util.Arrays;

/*
 *
 * @author -> Samuel
 * @Question -> Replication of the list implementation backed by an array in java
 *
 */
public class ArrayListImplementation<T> {

    private Object[] elements;
    private int size;
    private final int DEFAULT_CAPACITY = 10;

    ArrayListImplementation() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    ArrayListImplementation(int DEFAULT_CAPACITY) {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(T element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size] = element;
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) elements[index];
    }

    public int size() {
        return size;
    }


    private void ensureCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }


    public static void main(String[] args) {
        ArrayListImplementation<String> list = new ArrayListImplementation<>();
        list.add("samuel");
        list.add("joseph");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.size());
        System.out.println(list.get(1));
    }

}

