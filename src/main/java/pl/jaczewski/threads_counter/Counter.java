package pl.jaczewski.threads_counter;

import java.util.concurrent.Semaphore;

public class Counter {
    private volatile int counter = 0;

    private Semaphore semaphore = new Semaphore(1);

    public void increment() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counter += 1;
        semaphore.release();
    }

    public int getCounter() {
        return counter;
    }
}
