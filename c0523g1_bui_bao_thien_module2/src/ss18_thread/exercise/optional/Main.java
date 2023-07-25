package ss18_thread.exercise.optional;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazy = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimized = new OptimizedPrimeFactorization();
        lazy.start();
        optimized.start();
    }
}
