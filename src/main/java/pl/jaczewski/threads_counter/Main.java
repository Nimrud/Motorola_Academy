package pl.jaczewski.threads_counter;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        CounterUser counterUser1 = new CounterUser(counter);
        CounterUser counterUser2 = new CounterUser(counter);

        Thread counterThread1 = new Thread(counterUser1);
        Thread counterThread2 = new Thread(counterUser2);

        counterThread1.start();
        counterThread2.start();

        counterThread1.join();
        counterThread2.join();

        System.out.println("Counter= " + counter.getCounter());
    }
}
