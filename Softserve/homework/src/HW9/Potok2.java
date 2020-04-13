package HW9;

public class Potok2 implements Runnable{
@Override
public void run() {
	for (int x = 0; x <= 5; x++) {
        System.out.println(Thread.currentThread().getName()
               + x + " times ");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
}

