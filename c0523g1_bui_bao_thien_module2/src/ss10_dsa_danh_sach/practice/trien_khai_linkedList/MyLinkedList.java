package ss10_dsa_danh_sach.practice.trien_khai_linkedList;

public class MyLinkedList {
    private Node head;
    private int size;

    public MyLinkedList(Object data) {
        head = new Node(data);
        size++;
    }
    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        size++;
    }
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        size++;
    }
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    private class Node {
        private Node next;
        private final Object data;

        public Node(Object data) {
            this.data = data;
        }
        private Object getData() {
            return this.data;
        }
    }
}
