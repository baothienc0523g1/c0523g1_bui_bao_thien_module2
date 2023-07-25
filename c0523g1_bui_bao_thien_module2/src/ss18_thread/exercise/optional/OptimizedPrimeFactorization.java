package ss18_thread.exercise.optional;

public class OptimizedPrimeFactorization implements Runnable{
    private Thread optimizedThread;
    @Override
    public void run() {
        System.out.println("OptimizedPrimeFactorization is printing");
        double start = System.currentTimeMillis();
        for (int i = 0; i < 500; i++) {
            long count = 0;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("OptimizedPrimeFactorization is printing " + i);
            }
        }
        double stop = System.currentTimeMillis();
        System.out.println("OptimizedPrimeFactorization is STOPPED! with " + (stop - start) / 1000 + " seconds");

    }
    public void start() {
        optimizedThread = new Thread(this);
        optimizedThread.start();
    }
}
