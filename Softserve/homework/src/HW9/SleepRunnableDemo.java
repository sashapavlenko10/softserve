package HW9;
public class SleepRunnableDemo {
    public static void main(String[] args) {
        SleepRunnable sleepRunnable = new SleepRunnable();
        Thread one = new Thread(sleepRunnable);
        one.setName("I study java ");  
        one.start();
      
    }
}