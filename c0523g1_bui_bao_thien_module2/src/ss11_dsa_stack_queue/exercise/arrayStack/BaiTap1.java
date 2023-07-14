package ss11_dsa_stack_queue.exercise.arrayStack;

import ss11_dsa_stack_queue.exercise.arrayStack.ArrayBaseStack;

import java.util.ArrayList;
import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        ArrayBaseStack<String> wStack = new ArrayBaseStack<>();
        ArrayBaseStack<String> mWord = new ArrayBaseStack<>();

        mWord.push("Tran Thanh");
        mWord.push("Hoai Linh");
        mWord.push("Nguyen Ngoc Ngan");
        mWord.push("Dam Vinh Hung");
        mWord.push("Truong Giang");

        System.out.println("Stack truoc khi thuc hien dao nguoc");
        System.out.println(mWord.toString());
        System.out.println("m size" + mWord.size() + " w size " + wStack.size());

        int realSize = mWord.size();
        for (int i = 0; i < realSize; i++) {
            wStack.push(mWord.pop());
        }

        System.out.println("-----");
        System.out.println("Stack sau khi thuc hien dao nguoc");
        System.out.println(mWord.toString());
        System.out.println("m size" + mWord.size() + " w size " + wStack.size());
    }
}
