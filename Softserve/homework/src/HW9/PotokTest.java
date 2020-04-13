package HW9;

public class PotokTest extends Thread{
	   public static void main(String[] args) {
		     Potok1 p1 = new Potok1();
		     Potok2 p2 = new Potok2();
		     Thread one = new Thread(p1);
		     Thread two = new Thread(p2);
		      one.setName("Hello, world ");
		      two.setName("Peace in the peace ");
		      one.start();
		      two.start();
		      System.out.println("My name is Potok" );
		   }

}