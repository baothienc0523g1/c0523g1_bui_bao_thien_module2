package ss4_oop.exercise;

import java.time.LocalDateTime;
import java.util.Scanner;

public class StopWatch {
    long startTime;
    long endTime;

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public StopWatch() {
    }

    public long start() {
        return this.startTime = System.currentTimeMillis();
    }

    public long stop() {
        return this.endTime = System.currentTimeMillis();
    }

    public String getElapsedTime() {
        return this.endTime - this.startTime + " ms";
    }

    public static void main(String[] args) {
        StopWatch casio = new StopWatch();
        casio.start();
        Scanner sc = new Scanner(System.in);
        System.out.println("Test time 1");
        String str = sc.nextLine();
        casio.stop();
        System.out.println(casio.getElapsedTime());
    }
}
