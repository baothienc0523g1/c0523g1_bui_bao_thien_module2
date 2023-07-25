package ss18_thread.exercise.exercise_2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();
        odd.start();
        even.start();

        odd.join();
        even.join();
    }
}
