package pl.jaczewski.threads_calc;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Calculation calculation = new Calculation(5, 10);
        Thread calcThread = new Thread(calculation);

        calcThread.start();
        //calcThread.join();
        calcThread.interrupt();

        if (calculation.isFinished()) {
            System.out.println("Result: " + calculation.getResult());
        } else {
            System.out.println("Not finished yet");
        }
    }
}
