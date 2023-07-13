package ss10_dsa_danh_sach.exercise.trien_khai_array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayList {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<String>();
        System.out.println("Capacity");
        System.out.println(myList.getCapacity());
        System.out.println("size");
        System.out.println(myList.getSize());
        System.out.println("--- TEST CASE ----");
        myList.add(0, "bcd");
        myList.elements(3);
        myList.findAll();
    }
}
