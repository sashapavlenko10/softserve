package HW9;

public class Potok1 implements Runnable{
	@Override
	public void run() {
		for (int x = 0; x <= 5; x++) {
	        System.out.println(Thread.currentThread().getName()
	               + x + " times ");
	        try {
	            Thread.sleep(2000);
	        } catch (InterruptedException ex) {
	            ex.printStackTrace();
	        }
	    }
	}
	}