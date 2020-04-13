package HW9;
public class SleepRunnable implements Runnable {
    public void run() {
        for (int x = 0; x <= 10; x++) {
            System.out.println(Thread.currentThread().getName()
                   + x + " times ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}