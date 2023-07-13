package ss10_dsa_danh_sach.exercise.trien_khai_array_list;

import java.util.ArrayList;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    Object elements[] = new Object[DEFAULT_CAPACITY];
    public MyList(){
    }
    public MyList(int capacity) {
    }
    public int getCapacity() {
        return elements.length;
    }
    public int getSize() {
        return this.size;
    }
    E elements(int index) {
        //Return the element at the specified index
        return (E) elements[index];
    }
    public void rangeCheckForAdd(int index) {
        //Check index before adding an element
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Out of array size!");
    }
    public void rangeCheck(int index) {
        if (index > size)
            throw new IndexOutOfBoundsException("Out of array list size!");
    }
    public void add(int index, E element) {
        rangeCheck(index);
        size++;
        for (int i = elements.length - 1 ; i > index; i--) {
            elements[i] = elements[(i - 1)];
        }
        elements[index] = element;
    }
    public E remove(int index) {
        rangeCheck(index);

        E oldValue = elements(index);
        //src là mảng bạn muốn sao chép
        //srcPos là vị trí bắt đầu (chỉ số) trong mảng src
        //dest là mảng đích: các phần tử của mảng src sẽ được sao chép vào mảng này
        //destPos là vị trí bắt đầu (chỉ số) trong  mảng dest
        //numMove là số phần tử cần sao chép
        int numMove = size - index - 1;
        System.arraycopy(elements, index +1, elements, index, numMove);
        elements[--size] = null;
        return oldValue;
    }
    public E clone() {
        Object clonedArray[] = new Object[this.size];
        for (int i = 0; i < size; i++) {
            clonedArray[i] = elements[i];
        }
        return (E) clonedArray;
    }
    public boolean contains(E o) {
        for (Object e: elements) {
            if ((E) e == (E) elements)
                return true;
        } return false;
    }
    public void ensureCapacity(int minCapacity) {
//        int minExpand = (elements != DEFAULTCAPACITY_EMPTY_ELEMENTDATA)
//                ? 0 : DEFAULT_CAPACITY;
        //tạo mảng mới, dùng array copy sau đó gán mảng mới cho tên mảng cũ -> giữ được tên để tiếp tục các
        //thao tác khác mà vẫn tăng được capacity của mảng.
        Object[] newElements = new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }
    public E get(int i) {
        return (E) elements[i];
    }
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
    }
    public void findAll() {
        for (Object e : elements) {
            if (e != null)
            System.out.println((E)e);
        }
    }
}

