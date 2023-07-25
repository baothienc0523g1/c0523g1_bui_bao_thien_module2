package ss18_thread.practice.practice_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread is running");
        RunnableDemo runnableDemo1 = new RunnableDemo("Thread1");
        runnableDemo1.start();

        RunnableDemo runnableDemo2 = new RunnableDemo("Thread2");
        runnableDemo2.start();
        System.out.println("Main thread is stopped");
    }
}
