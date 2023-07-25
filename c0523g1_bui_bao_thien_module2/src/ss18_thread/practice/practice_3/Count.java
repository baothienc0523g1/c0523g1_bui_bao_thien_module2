package ss18_thread.practice.practice_3;

public class Count implements Runnable{
    private Thread myThread;
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("myThread is printing > " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ie) {
            System.out.println("Thread is interrupted");
        }
        System.out.println("Done!");
    }
    public Count() {
        myThread = new Thread(this, "My runnable thread");
        System.out.println("My thread created " + myThread);
        myThread.start();
    }
    public Thread getMyThread() {
        return myThread;
    }

    public static void main(String[] args) {
        Count count = new Count();
        try {
            while (count.getMyThread().isAlive()) {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        } catch (InterruptedException ie) {
            System.out.println("Main thread is interrupted");
        }
        System.out.println("Main thread is done");
    }
}
