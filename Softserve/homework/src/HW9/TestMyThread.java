package HW9;
public class TestMyThread {
	   public static void main(String[] args) {
		   MyThread t1 = new MyThread();
		   MyThread t2 = new MyThread();
		   MyThread t3 = new MyThread();
		   Thread one = new Thread(t1);
		   Thread two = new Thread(t2);
		   Thread three = new Thread(t2);
		   one.setName("hello ");
		   two.setName("privet ");
		   three.setName("poka ");
		   one.start();
		   two.start();
		   three.start();
		   try {
			 three.wait();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		         try {
		             t1.join();
		         } catch (InterruptedException e) {
		             e.printStackTrace();
		         }

		         t2.start();

		         try {
		             t1.join();
		             t2.join();
		             t3.notify();
		         } catch (InterruptedException e) {
		             e.printStackTrace();
		         }

		         System.out.println("Все потоки закончили работу"
		         		+ ", программа завершена");

	   }
}