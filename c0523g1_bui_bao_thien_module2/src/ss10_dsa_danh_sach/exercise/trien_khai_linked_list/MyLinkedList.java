//package ss10_dsa_danh_sach.exercise.trien_khai_linked_list;
//
//import java.util.LinkedList;
//
//public class MyLinkedList<E> implements IMyLinkedList<E> {
//    private Node<E> head = null;
//    private Node<E> tail = null;
//    private int size;
//
//    private boolean isEmpty() {
//        return size() == 0;
//    }
//    public E removeLast() {
//        if (isEmpty()) throw new RuntimeException("Empty linked list!");
//        E data = tail.getData();
//        tail = tail.getPrev();
//        size--;
//        if (isEmpty()) head = null;
//        else tail.setNext(null);
//
//        return data;
//    }
//    public E removeFirst() {
//        if (isEmpty()) throw new RuntimeException("Empty link list!");
//        E data = head.getData();
//        head = head.getNext();
//        size--;
//        if (isEmpty()) tail = null;
//        else head.setPrev(null);
//
//        return data;
//    }
//    @Override
//    public void add(int index, E element) {
//    }
//
//    @Override
//    public void addFirst(E e) {
//        Node<E> newNode = new Node<>(e,null,head);
//        head.setPrev(newNode);
//        head = head.getPrev();
//    }
//
//    @Override
//    public void addLast(E e) {
//            //check if this not empty
//        if (isEmpty()){
//            head = tail = new Node<>(e, null, null)
//        } else{
//            Node<E> newNode = new Node<>(e, tail, null);
//            tail.setNext(newNode);
//            tail = tail.getNext();
//        }
//    }
//
//    @Override
//    /* nếu mảng rỗng hoặc index không hợp lệ thì throw new
//    còn index hợp lệ thì bắt đầu xét index. Index < size/2 thì bắt đầu từ head,
//    index > size/2 thì bắt đầu từ tail. Giảm được thời gian thực thi.
//    biến i để dò vị trí hiện tại của currentNode trong vòng lặp, nếu i != index
//     */
//    public E removeAt(int index) {
//        if (isEmpty()) { throw new RuntimeException("Empty list, cannot remove!"); }
//        if (index < 0 || index >= size) { throw new IllegalArgumentException(); }
//
//        int i;
//        Node<E> currentNode;
//
//        //dịch chuyển currentNode liên tục cho đến khi i = index thì dừng
//        if (index < size / 2) {
//            i = 0;
//            currentNode = head;
//            while (i != index) {
//            }
//                currentNode = currentNode.getNext();
//                i++;
//            } else {
//           i = size - 1;
//           currentNode = tail;
//           while (i != index) {
//               currentNode = currentNode.getPrev();
//               i--;
//           }
//        }
//        return currentNode.getData();
//    }
//
//    @Override
//    public boolean remove(Object e) {
//        return false;
//    }
//
//    @Override
//    public int size() {
//        return size;
//    }
//
//    @Override
//    public E clone() {
//        return null;
//    }
//
//    @Override
//    public boolean contains(E o) {
//        if (indexOf(o) != -1)
//        return true;
//    }
//
//    @Override
//    public int indexOf(E o) {
//        int index = 0;
//        Node<E> currenNode = head;
//
//        if (o == null) {
//            while (currenNode != null) {
//                if (currenNode.getData() == null) {
//                    return index;
//                }
//                currenNode = currenNode.getNext();
//                index++;
//            }
//        } else {
//            while (currenNode != null) {
//                if (currenNode.getData() == o) {
//                    return index;
//                }
//                currenNode = currenNode.getNext();
//                index++;
//            }
//        }
//        return -1;
//    }
//
//    @Override
//    public boolean add(E e) {
//        return false;
//    }
//
//    @Override
//    public void ensureCapacity(int minCapacity) {
//
//    }
//
//    @Override
//    public E get(int i) {
//        return null;
//    }
//
//    @Override
//    public E getFirst() {
//        return null;
//    }
//
//    @Override
//    public E getLast() {
//        return null;
//    }
//
//    @Override
//    public void clear() {
//        Node<E> currentNode = head;
//        while (currentNode != null) {
//            Node<E> nextNode = currentNode.getNext();
//            currentNode.setNext(null);
//            currentNode.setPrev(null);
//            currentNode.setData(null);
//            currentNode = null;
//        }
//        head = tail = null;
//        size = 0;
//    }
//
//    private class Node<E> {
//        private E data;
//        private Node <E> prev, next;
//
//        public Node(E data, Node<E> prev, Node<E> next) {
//            this.data = data;
//            this.prev = prev;
//            this.next = next;
//        }
//        public String toString() {
//            return data.toString();
//        }
//
//        public E getData() {
//            return data;
//        }
//
//        public void setData(E data) {
//            this.data = data;
//        }
//
//        public Node<E> getPrev() {
//            return prev;
//        }
//
//        public void setPrev(Node<E> prev) {
//            this.prev = prev;
//        }
//
//        public Node<E> getNext() {
//            return next;
//        }
//
//        public void setNext(Node<E> next) {
//            this.next = next;
//        }
//    }
//}
