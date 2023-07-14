package ss11_dsa_stack_queue.practice;

public class MyLinkedListQueue<T> {
    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int key) {
        /* Ở đây enqueue bằng cách thêm vào cuối linked list */
        Node temp = new Node(key);
        if (this.head == null) {
            this.head = this.tail = temp;
        }
        this.tail.next = temp;
        this.tail = this.tail.next;
    }

    public Node dequeue() {
        /*Ở đây dequeue bằng cách lấy ra ở đầu (FIFO)*/
        if (this.head == null) {
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null) {
            this.tail = null;
        }
        return temp;
    }
    public Node getHead() {
        return this.head;
    }
    public Node getTail() {
        return this.tail;
    }
}
