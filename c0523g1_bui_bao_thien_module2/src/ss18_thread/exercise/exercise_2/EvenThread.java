package ss18_thread.exercise.exercise_2;

public class EvenThread extends Thread{
    private Thread evenThread;
    public EvenThread() {
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("even thread is printing " + i);
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
