package ss18_thread.exercise.exercise_2;

public class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 10; i+=2) {
            System.out.println("odd thread in printing " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
