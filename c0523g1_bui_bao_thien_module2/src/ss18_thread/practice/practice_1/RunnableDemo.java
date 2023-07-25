package ss18_thread.practice.practice_1;

public class RunnableDemo implements Runnable{
    private Thread t;
    private final String threadName;
    public RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }
    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + " > " + i);
                //Tam dung vong lap trong 50ms
                Thread.sleep(50);
            }
        } catch (InterruptedException ie) {
            System.out.println("Thread " + threadName + " interrupted");
        }
        System.out.println("Thread " + threadName + " is exiting");
    }
    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
