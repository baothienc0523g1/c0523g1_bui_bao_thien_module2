package ss11_dsa_stack_queue.practice;

import java.util.Arrays;

public class Optional2TrienKhaiStackSuDungMang {
    private int arr[];
    private int size;
    private int index = -1;
    private int capacity;
    public Optional2TrienKhaiStackSuDungMang(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }
    public void push(int element) {
        if (isFull()) {
            System.out.println("Queue stack is full, can't push more");
        } else {
            arr[size - 1] = element;
            size++;
            index++;
        }
    }
    public int pop() {
        int temp = 0;
        if (isEmpty()) {
            System.out.println("Queue stack is empty, nothing to pop bro");
        } else {
            temp = arr[index];
            arr[index] = Integer.parseInt(null);
            size--;
            index--;
        }
        return temp;
    }
    public int size() {
        return this.size;
    }
    public boolean isFull() {
        return (size == capacity) ? true : false;
    }
    public boolean isEmpty() {
        return (size == 0) ? true : false;
    }
}

