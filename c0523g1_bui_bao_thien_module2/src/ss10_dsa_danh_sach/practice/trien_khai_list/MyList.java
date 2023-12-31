package ss10_dsa_danh_sach.practice.trien_khai_list;

import java.util.Arrays;

public class MyList<E> {
    public static final int DEFAULT_CAPACITY = 20;
    private int size = 0;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
            elements[size++] = e;
    }
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
            return (E) elements[i];
    }
}
