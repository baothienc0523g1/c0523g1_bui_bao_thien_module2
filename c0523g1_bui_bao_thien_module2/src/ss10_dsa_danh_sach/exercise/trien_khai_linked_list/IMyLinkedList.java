package ss10_dsa_danh_sach.exercise.trien_khai_linked_list;

public interface IMyLinkedList<E> {
    void add(int index, E element);
    void addFirst(E e);
    void addLast(E e);
    E remove(int index);
    boolean remove(Object e);
    int size();
    E clone();
    boolean contains(E o);
    int indexOf(E o);
    boolean add(E e);
    void ensureCapacity(int minCapacity);
    E get(int i);
    E getFirst();
    E getLast();
    void clear();
}
