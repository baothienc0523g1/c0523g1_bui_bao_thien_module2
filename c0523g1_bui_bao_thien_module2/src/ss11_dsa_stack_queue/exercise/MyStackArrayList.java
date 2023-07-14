package ss11_dsa_stack_queue.exercise;

import java.util.ArrayList;

public class MyStackArrayList<T> extends ArrayList {
    private final ArrayList<T> myArray;
   private int DEFAULT_CAPACITY = 10;
    public MyStackArrayList() {
        this.myArray = new ArrayList<>(DEFAULT_CAPACITY);
    }


    public void push(T elememt) {
        myArray.add(elememt);
   }
   public T pop() {
       return myArray.remove(myArray.size() - 1);
   }
   public T top() {
       return myArray.get(size() - 1);
   }
   public int size() {
        return myArray.size();
   }
   public boolean isEmpty() {
       return myArray.isEmpty();
   }

}
