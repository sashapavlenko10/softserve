package HW9;
public class MyThread extends Thread {

	   @Override
	   public void run() {
		   for (int i=1; i <= 5; i++)
	       System.out.println("������ ������ ������ " 
		   + Thread.currentThread().getName()+" "+i+" times");

	       try {
	           Thread.sleep(5000);
	       } catch (InterruptedException e) {
	           e.printStackTrace();
	       }
	       System.out.println("����� " + getName() +  " �������� ������.");
	   }
	}
