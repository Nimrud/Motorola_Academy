package pl.jaczewski.threads_future;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;

public class FutureSimulation {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        List<Future<Integer>> tasks = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            LongTask longTask = new LongTask(5, 13);
            Future<Integer> resultFuture = executor.submit(longTask::longCalc);
            System.out.println("Future submitted");
            tasks.add(resultFuture);
        }

        for (Future<Integer> task : tasks) {
            System.out.println(task.get());
        }

        executor.shutdown();
    }

    private static class LongTask {
        private final int a;
        private final int b;

        private LongTask(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int longCalc() {
            System.out.println("Started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished");
            return a + b;
        }
    }

}
