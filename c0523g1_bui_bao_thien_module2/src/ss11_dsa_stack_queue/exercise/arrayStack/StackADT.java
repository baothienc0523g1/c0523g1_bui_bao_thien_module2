package ss11_dsa_stack_queue.exercise.arrayStack;

public interface StackADT<T> extends Iterable<T>{
    void push(T element);
    T pop();
    T top();
    int size();
    boolean isEmpty();
}
