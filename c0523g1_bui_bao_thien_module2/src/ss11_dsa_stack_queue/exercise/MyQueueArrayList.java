package ss11_dsa_stack_queue.exercise;

import java.util.ArrayList;

public class MyQueueArrayList<T> extends ArrayList {

    ArrayList<T> myQueueArray = new ArrayList<>();
    public void peekFirst() {
        System.out.println(myQueueArray.get(0));
    }
    public void peekLast() {
        System.out.println(myQueueArray.get(size() - 1));
    }
    public void push(T element) {
        myQueueArray.add(size() - 1,element);
    }
    public T getFirstQueue() {
        T temp = myQueueArray.get(0);
        myQueueArray.remove(0);
        return temp;
    }
}
