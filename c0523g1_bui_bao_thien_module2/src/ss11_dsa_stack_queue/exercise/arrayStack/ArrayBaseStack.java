package ss11_dsa_stack_queue.exercise.arrayStack;

import java.util.ArrayList;

/* bài này sử dụng stack -> FILO */
public class ArrayBaseStack<E> extends ArrayList implements StackADT {

    private ArrayList array = new ArrayList<>();
    private static int index = 0;
    public ArrayBaseStack() {
    }

    @Override
    public void push(Object element) {
        array.add(array.size(), element);
        index++;
    }

    @Override
    public Object pop() {
        index--;
        return array.remove(array.size()-1);
    }

    @Override
    public Object top() {
        return array.get(size() - 1);
    }

    @Override
    public int size() {
        return array.size();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }




    @Override
    public String toString() {
        return "Array stack = " + array + ";";
    }
}
