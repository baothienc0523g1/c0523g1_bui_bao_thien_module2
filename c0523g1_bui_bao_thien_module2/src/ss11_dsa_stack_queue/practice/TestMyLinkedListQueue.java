package ss11_dsa_stack_queue.practice;

public class TestMyLinkedListQueue {
    public static void main(String[] args) {
        /* Queue: FIFO */
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);
        queue.enqueue(80);
        System.out.println(queue.dequeue().key);
    }
}
