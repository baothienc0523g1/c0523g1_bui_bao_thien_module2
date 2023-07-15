package ss11_dsa_stack_queue.practice;

public class Optional1TrienKhaiQueueSuDungMang {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;
    public Optional1TrienKhaiQueueSuDungMang(int capacity) {
        this.capacity = capacity;
        queueArr = new int[this.capacity];
    }
    public boolean isQueueFull() {
        return (currentSize == capacity) ? true : false;
    }
    public boolean isQueueEmpty() {
        return (currentSize == 0);
    }
    public void enqueue(int element) {
        if (isQueueFull()) {
            System.out.println("Queue is full, cant add " + element);
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = element;
            currentSize++;
            System.out.println(element + " is pushed to Queue");
        }
    }
    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Queue doesn't have element to dequeue");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Dequeue done, removed element " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Dequeue done, removed element " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }

}
