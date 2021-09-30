package pl.jaczewski.threads_calc;

public class Calculation implements Runnable{

    private int a, b;
    private int result;
    private boolean isFinished = false;

    public Calculation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        System.out.println("Starting thread #" + Thread.currentThread().getId());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        result = a + b;
        isFinished = true;

        System.out.println("Finishing thread #" + Thread.currentThread().getId());
    }

    public int getResult() {
        return result;
    }

    public boolean isFinished() {
        return isFinished;
    }
}
