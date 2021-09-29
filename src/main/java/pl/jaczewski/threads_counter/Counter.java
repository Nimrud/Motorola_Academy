package pl.jaczewski.threads_counter;

public class Counter {
    private int counter = 0;

    public void increment() {
        counter += 1;
    }

    public int getCounter() {
        return counter;
    }
}
