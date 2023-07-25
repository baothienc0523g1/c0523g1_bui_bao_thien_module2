package ss18_thread.exercise.exercise_1;

import java.util.Objects;

public class NumberGenerator implements Runnable{
    private Thread numberGenerator;
    private String name;

    public NumberGenerator(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " have hashCode " + this.hashCode());
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " printing > " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void start() {
        System.out.println("Starting " + this.name);
        numberGenerator = new Thread(this, name);
        numberGenerator.start();
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberGenerator);
    }

    public static void main(String[] args) {
        System.out.println("Main start");
        NumberGenerator num1 = new NumberGenerator("Num1");
        NumberGenerator num2 = new NumberGenerator("Num2");

        num1.start();
        num2.start();
    }
}
