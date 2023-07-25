package ss18_thread.exercise.optional;

public class LazyPrimeFactorization implements Runnable {
    private Thread lazyThread;

    public LazyPrimeFactorization() {
    }

    @Override
    public void run() {
        System.out.println("LazyPrimeFactorization is printing");
        double start = System.currentTimeMillis();
        for (int i = 0; i <= 500; i++) {
            long count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Lazy prime is printing: " + i);
            }
        }
        double stop = System.currentTimeMillis();
        System.out.println("LazyPrimeFactorization is STOPPED! with " + (stop - start) / 1000 + " seconds");
    }

    public void start() {
        lazyThread = new Thread(this);
        lazyThread.start();
    }
}
