package HW8;

public class Runner {
	public static void main(String[] args) {
		   try {
		      Plant pl = new Plant("rose", "blue", 5);
		      System.out.println(pl);
		   } catch (ColorException | TypeException e) {
		      System.err.println(e.getMessage() + "\n");
		       
		   }
		}

}
